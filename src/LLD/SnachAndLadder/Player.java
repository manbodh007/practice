package LLD.SnachAndLadder;

public class Player {
	private int id;
	private int position;

	public Player(int id){
		this.id = id;
		this.position = 0;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosition() {
		return position;
	}
}
