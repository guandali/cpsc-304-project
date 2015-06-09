package Customer;

import java.sql.ResultSet;

public class CustomerDBAccess {

	public ResultSet getRoomTypes() {
		ResultSet data = null;
		
		//ToDo
		
		return data;
	}
	
	public boolean checkRoomAvailability() {
		boolean isRoom = true;
		
		//ToDo
		
		return isRoom;
	}
	
	public boolean checkParkingAvailability() {
		boolean isParking = true;
		
		//ToDo
		
		return isParking;
	}
	
	public boolean makeReservation(int checkInDate, 
								   int checkOutDate, 
								   String roomType, 
								   String firstName, 
								   String lastName, 
								   String phone,
								   String address) {
		return false;
		
	}
	
	public boolean updateReservation(int checkInDate, 
			   int checkOutDate, 
			   String roomType) {
		return false;

	}

	public void cancelReservation(String resID) {
		
	}
	
}
