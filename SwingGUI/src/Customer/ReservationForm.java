package Customer;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReservationForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2688245637198159581L;
	
	private JTextField FirstName;
	private JTextField SurName;
	private JTextField phone;
	private JTextField address;
	
	private GridBagConstraints gbc;
	
	public ReservationForm() {
		super();
		this.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		setupScreen();
		
	}
	
	private void setupScreen() {
		JPanel DataInput = new JPanel(new GridBagLayout());
		JLabel persDetailLabel = new JLabel("Personal Details");
		JLabel firstNameLabel = new JLabel("First Name: ");
		FirstName = new JTextField();
		JLabel surNameLabel = new JLabel("Sur Name: ");
		SurName = new JTextField();
		JLabel phoneLabel = new JLabel("Phone Number: ");
		phone = new JTextField();
		JLabel addressLabel = new JLabel("Address: ");
		address = new JTextField();
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(persDetailLabel, gbc);
		
		DataInput.add(firstNameLabel, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		FirstName.setPreferredSize(new Dimension(300, 30));
		DataInput.add(FirstName, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		DataInput.add(surNameLabel, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		SurName.setPreferredSize(new Dimension(300, 30));
		DataInput.add(SurName, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		DataInput.add(phoneLabel, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		phone.setPreferredSize(new Dimension(300, 30));
		DataInput.add(phone, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		DataInput.add(addressLabel, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		address.setPreferredSize(new Dimension(300, 30));
		DataInput.add(address,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		this.add(DataInput, gbc);
		setUpButtons();
			
	}
	
	private void setUpButtons() {
		JPanel buttonPanel = new JPanel();
		JButton reserve = new JButton("Confirm Reservation");
		JButton cancel = new JButton("Cancel");
		
		reserve.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  confirmReservation();
				  } 
				} );
		
		cancel.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 

				  } 
				} );
		
		buttonPanel.add(reserve, gbc);
		buttonPanel.add(cancel, gbc);
		
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(buttonPanel, gbc);	
	}
	
	private void confirmReservation() {
		
	}

}
