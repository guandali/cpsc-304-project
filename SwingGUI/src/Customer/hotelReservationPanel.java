package Customer;

import javax.swing.*;

public class hotelReservationPanel extends ClerkTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public hotelReservationPanel(String title, String buttonTitle) {
		super(title, buttonTitle);
		// TODO Auto-generated constructor stub
	}

	private void goToNextScreen() {
		  CustomerDBAccess ora = new CustomerDBAccess();
		  boolean isRoom = false;
		  isRoom = ora.checkRoomAvailability();
		  if (isRoom == true) {
				this.removeAll();
				ReservationForm form = new ReservationForm();
				this.add(form);
		        this.validate();
		        this.repaint();
		  }
		  else {
			  JOptionPane.showMessageDialog(this, "NO MORE ROOMS. TOO BAD");
		  }
	}

	@Override
	protected void buttonAction() {
		// TODO Auto-generated method stub
		goToNextScreen();
	}
	
}
