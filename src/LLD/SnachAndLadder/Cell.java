package LLD.SnachAndLadder;

public class Cell {
    private Jump jump;

	public Cell(Jump jump){
		this.jump = jump;
	}

	public void setJump(Jump jump){
		this.jump = jump;
	}

	public Jump getJump() {
		return jump;
	}
}
