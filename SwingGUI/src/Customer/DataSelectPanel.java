package Customer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class DataSelectPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3958070591089437721L;
	
	private JTextField checkInBox;
	private JTextField checkOutBox;
	private JComboBox roomTypeCombo;
	private JComboBox guestNumCombo;
	private JComboBox parkingCombo;
	
	public DataSelectPanel() {
		super();
		setUpDataSelectPanel();
	}
	
	public void setData() {
		
	}
	
	private void populateComboBoxes() {
		CustomerDBAccess ora = new CustomerDBAccess();
		ResultSet roomTypes = ora.getRoomTypes();
		
		roomTypeCombo.addItem("Economy");
		roomTypeCombo.addItem("Deluxe");
		
		parkingCombo.addItem("Yes");
		parkingCombo.addItem("No");
		
		for (int i = 0; i < 10; i++) {
			guestNumCombo.addItem(i);
		}
	}
	
	private void setUpDataSelectPanel() {
		roomTypeCombo = new JComboBox();
		guestNumCombo = new JComboBox();
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		//checkInBox = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		//checkOutBox = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		
		checkInBox = new JTextField();
		checkOutBox = new JTextField();
		
		parkingCombo = new JComboBox();
		
		JLabel checkInLabel = new JLabel("Check-in:");
		JLabel checkOutLabel = new JLabel("Check-out:");
		JLabel RoomTypeLabel = new JLabel("Room Type:");
		JLabel GuestNumLabel = new JLabel("No. Guests:");
		JLabel ParkingLabel = new JLabel("Parking:");
		
		this.setLayout(new GridLayout(5, 2));
		this.setBackground(Color.white);
		this.setMaximumSize(new Dimension(300, 150));
		
		this.add(checkInLabel);
		this.add(checkInBox);
		this.add(checkOutLabel);
		this.add(checkOutBox);
		this.add(RoomTypeLabel);
		this.add(roomTypeCombo);
		this.add(GuestNumLabel);
		this.add(guestNumCombo);
		this.add(ParkingLabel);
		this.add(parkingCombo);
		
		populateComboBoxes();
	}
}
