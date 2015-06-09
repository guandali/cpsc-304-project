package Customer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ModifyPanel extends ClerkTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModifyPanel(String title, String buttonTitle) {
		super(title, buttonTitle);
		// TODO Auto-generated constructor stub
		JButton cancelButton = new JButton("Cancel Reservation");
		
        gbc.gridy = 4;
        gbc.gridx = 1;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.anchor = GridBagConstraints.SOUTH;
        cancelButton.setPreferredSize(new Dimension(200, 50));
		selectBkg.add(cancelButton, gbc);
		selectBkg.setBackground(Color.DARK_GRAY);
		cancelButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  cancelReservation();
		  }
		});
		this.updateUI();
		
	}

	public void setOriginalData() {
		this.dataSelectPanel.setData();
	}
	
	private void cancelReservation() {
		CustomerDBAccess cancelDB = new CustomerDBAccess();
		int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel your reservation?", "Cancel Resrvation", JOptionPane.YES_NO_OPTION);
		
		if (reply == JOptionPane.YES_OPTION) {
			cancelDB.cancelReservation("");
		}
		
		else {
			
		}
	}
	
	@Override
	protected void buttonAction() {
		// TODO Auto-generated method stub
		CustomerDBAccess modifyDB = new CustomerDBAccess();
		
		if (modifyDB.checkRoomAvailability() == true) {
			int reply = JOptionPane.showConfirmDialog(this, "Are you sure you want to modify your reservation?", "Modify Confirmation", JOptionPane.YES_NO_OPTION);
			
			if (reply == JOptionPane.YES_OPTION) {
				modifyDB.updateReservation(0, 0, "");
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "Unfortunately there are no available rooms!");
		}
	}	
}
