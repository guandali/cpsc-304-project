import java.awt.*;
import java.awt.event.*;
import javax.swing.*;        

import Clerk.RoomSelector;
import Customer.ModifyPanel;
import Customer.hotelReservationPanel;
 
public class HotelGUI {

	private JFrame mainFrame;
	private StartMenu mainPanel;
	
	public void runGUI() {
        //Create and set up the window.
        mainFrame = new JFrame("Hotels");
        mainFrame.setMinimumSize(new Dimension(400,400));
        mainPanel = new StartMenu();

        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
	}
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        HotelGUI hotel = new HotelGUI();
        hotel.runGUI();
    }
}
