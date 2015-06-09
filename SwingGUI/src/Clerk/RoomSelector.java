package Clerk;
import javax.swing.*;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoomSelector extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 511722221333440926L;
	
	private JLabel selectedRoom;
	private JPanel hotelMapPanel;
	private GridBagConstraints roomPos;
	
	public RoomSelector() {
		super();
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.white);
		selectedRoom = new JLabel("Selected Room: 101");
		hotelMapPanel = new JPanel();
		hotelMapPanel.setLayout(new GridBagLayout());
		roomPos = new GridBagConstraints();
		
		roomPos.gridx = 1;
		roomPos.gridy = 1;
		selectedRoom.setFont(new Font("TimesRoman", Font.BOLD, 18));
		selectedRoom.setPreferredSize(new Dimension(200, 36));
		this.add(selectedRoom, roomPos);
		
		roomPos.gridx = 1;
		roomPos.gridy = 2;
		this.add(hotelMapPanel, roomPos);
		CreateHotelMap();
	}
	
	private void BuildRoom(int RoomNumber, boolean Full) {
		hotelMapPanel.setBackground(Color.DARK_GRAY);
		JLabel Room = new JLabel(Integer.toString(RoomNumber));
		Room.setPreferredSize(new Dimension(50, 50));
		Room.setOpaque(true);
		
		if (Full) { 
			Room.setBackground(Color.red); 

			}
		else { 
			Room.setBackground(Color.green); 
			Room.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					e.getComponent().setBackground(Color.decode("#98FB98"));
				}
				
				public void mouseExited(MouseEvent e) {
					e.getComponent().setBackground(Color.green);
				}
				
				public void mousePressed(MouseEvent e) {
					JLabel temp = (JLabel) e.getComponent();
					temp.setBackground(Color.decode("#228B22"));
					selectedRoom.setText("Selected Room: " + temp.getText());
				}
				
				public void mouseReleased(MouseEvent e) {
					e.getComponent().setBackground(Color.green);
				}
			});
			}
		Room.setHorizontalAlignment(SwingConstants.CENTER);
		
		roomPos.gridx = RoomNumber % 10;
		roomPos.gridy = 7 - ((RoomNumber % 1000) / 100);
		roomPos.insets = new Insets(3,3,3,3);
		hotelMapPanel.add(Room, roomPos);
	}
	
	private void CreateHotelMap() {
		ArrayList<Integer> rooms = new ArrayList<Integer>();
		rooms.add(101);
		rooms.add(102);
		rooms.add(103);
		rooms.add(104);
		rooms.add(201);
		rooms.add(202);
		rooms.add(203);
		rooms.add(302);
		rooms.add(402);
		rooms.add(502);
		
		for (int i = 0; i < rooms.size(); i++) {
			boolean full;
			if (i % 2 > 0) {
				full = true;
			}
			else {
					full = false;
			}
			BuildRoom(rooms.get(i), full);
		}
		
	}
}
