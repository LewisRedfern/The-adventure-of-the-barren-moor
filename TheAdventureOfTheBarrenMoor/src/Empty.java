
public class Empty extends GameObject {

	public Empty() {
		super("Empty", 0);

	}

	public String getType() {
		return this.type;
	}

	public void setType() {
		this.type = Empty.class.getName().toString();
	}

	public int getBehaviour() {
		return this.behaviour;
	}

	public void setBehaviour() {
		this.behaviour = 0;//does nothing
	}

}
