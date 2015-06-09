package Customer;


import java.util.Hashtable;

public class Reservation extends Hashtable<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Reservation() {
		this.put("name", "");
		this.put("checkInDate", "");
		
	}

}
