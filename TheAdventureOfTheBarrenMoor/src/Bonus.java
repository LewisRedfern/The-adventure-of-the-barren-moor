/*
 * 
 * 
 * SETTER WILL BE ADDED LATER WHEN GAME IS EXPANDED
 * 
 * 
 * */
public class Bonus extends GameObject {

	private String message;

	public Bonus() {
		super("Bonus", 2);
		this.message = "You found a big mac.\n\n+1 Health Point.";
	}
	
	public String getType () {
		
		return this.type;
	}
	
	public int getBehaviour () {
		
		return this.behaviour;
	}
	
	public String getMessage () {
		
		return this.message;
	}

}
