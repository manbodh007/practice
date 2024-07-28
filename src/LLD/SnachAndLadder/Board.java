package LLD.SnachAndLadder;

import java.util.Random;

public class Board {
	private Player player;
	private Dice dice;
	private Cell[][] cells;


	public Board(int numberOfCells, int numberOfSnacks, int numberOfLadders){
		cells = new Cell[numberOfCells][numberOfCells];
		for(int i=0;i<numberOfCells;i++){
			for(int j=0;j<numberOfCells;j++){
				cells[i][j] = new Cell(null);
			}
		}
		addSnacksAndLadders(numberOfSnacks, numberOfLadders);
	}

	private void addSnacksAndLadders(int numberOfSnacks, int numberOfLadders) {
		int numberOfCells = cells.length * cells.length - 1;
		while(numberOfSnacks>0) {
			int snackStart = new Random().nextInt(numberOfCells);
			int snackEnd = new Random().nextInt(numberOfCells);
			if(snackStart<snackEnd)
				continue;

			Jump jump = new Jump(snackStart,snackEnd);
			Cell cell = getCell(snackStart);
			cell.setJump(jump);
			numberOfSnacks--;
		}

		while(numberOfLadders>0){
			int ladderStart = new Random().nextInt(numberOfCells);
			int ladderEnd = new Random().nextInt(numberOfCells);
			if(ladderStart>ladderEnd)
				continue;

			Jump jump = new Jump(ladderStart,ladderEnd);
			Cell cell = getCell(ladderStart);
			cell.setJump(jump);
			numberOfLadders--;
		}
	}

	public Cell getCell(int position) {
		int row = position / cells.length;
		int column = position % cells.length;
		return cells[row][column];
	}
	public int getBoardEndPosition(){
		return cells.length * cells.length;
	}
}
