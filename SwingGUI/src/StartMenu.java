import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Clerk.RoomSelector;
import Customer.ModifyPanel;
import Customer.hotelReservationPanel;

public class StartMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StartMenu() {
		super();
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		createAccessScreen();
	}
	
	private void createAccessScreen() {
		JButton reserve = new JButton("Make Reservation");
		JButton modify = new JButton("Modify Reservation");
		JButton admin = new JButton("Admin Login");
		
		//firstScreen.setLayout(new BoxLayout(firstScreen, BoxLayout.Y_AXIS));
		
		reserve.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  repaintFrame(new hotelReservationPanel("Hotel Reservation", "Reserve"));
				  } 
				} );
		
		modify.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  repaintFrame(new ModifyPanel("Modify Reservation", "Modify"));
				  } 
				} );
		
		admin.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  repaintFrame(new RoomSelector());
				  } 
				} );
		
		this.add(reserve);
		this.add(modify);
		this.add(admin);

	}
	
	private void repaintFrame(JPanel newPanel) {
		this.removeAll();
		this.add(newPanel);
        this.validate();
        this.repaint();
	}

}
