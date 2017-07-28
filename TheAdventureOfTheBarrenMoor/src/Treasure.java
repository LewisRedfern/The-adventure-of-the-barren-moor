
public class Treasure extends GameObject {

	private String message;

	public Treasure() {
		super("Treasure", 3);
		this.message = "The portal is beaming with warm blue light.\n\n" + "A familar voice echos from the portal.\n\n"
				+ "You approach the portal..." + "\n\nThe Voice: 'Enter and return home.'";
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
