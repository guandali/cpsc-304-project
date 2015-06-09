package Customer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class ClerkTemplate extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected DataSelectPanel dataSelectPanel;
	protected JPanel selectBkg;
	protected GridBagConstraints gbc;
	
	private String Title = "";
	private String ButtonTitle = "";
	
	public ClerkTemplate(String title, String buttonTitle) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		Title = title;
		ButtonTitle = buttonTitle;
		setUpPanel();
	}
	
	private void addReserveAction(JButton target) {
		target.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  buttonAction();
		  }
		});
	}
	
	protected abstract void buttonAction();
	
	private void setUpPanel() {
		dataSelectPanel = new DataSelectPanel();
		JButton reserveButton = new JButton(ButtonTitle);
		
		selectBkg = new JPanel();
		JLabel titleLabel = new JLabel(Title);
		
		this.setPreferredSize(new Dimension(600, 400));
		selectBkg.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(30,3,3,3);
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        titleLabel.setFont(new Font("TimesRoman", Font.BOLD, 22));
        titleLabel.setForeground(Color.orange);
		selectBkg.add(titleLabel, gbc);
		
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
		selectBkg.add(dataSelectPanel,gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        reserveButton.setPreferredSize(new Dimension(200, 50));
		selectBkg.add(reserveButton, gbc);
		selectBkg.setBackground(Color.DARK_GRAY);
		addReserveAction(reserveButton);
		this.add(selectBkg);
	}
	

}
