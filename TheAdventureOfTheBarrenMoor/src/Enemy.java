/*
 * 
 * 
 * SETTER WILL BE ADDED LATER WHEN GAME IS EXPANDED
 * 
 * 
 * */
public class Enemy extends GameObject {

	private String message;

	public Enemy() {
		super("Enemy", 1);
		this.message = "From the pits of the swamp a dark force emerges and steals your health point!\n\n-1 Health Point.";

	}

	public String getType() {

		return this.type;
	}

	public int getBehaviour() {

		return this.behaviour;
	}

	public String getMessage() {

		return this.message;
	}

}
