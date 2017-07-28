
public class Empty extends GameObject {

	public Empty() {
		super("Empty", 0);

		this.behaviour = 0;// does nothing
		this.type = Empty.class.getName().toString();
	}

	public String getType() {
		return this.type;
	}

	public int getBehaviour() {
		return this.behaviour;
	}
}
