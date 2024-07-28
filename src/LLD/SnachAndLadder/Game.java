package LLD.SnachAndLadder;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
	private final Dice dice;
	private final Queue<Player> players = new ArrayDeque<>();
	private final Board board;
	private boolean winner;

	private final int endPosition;

	public Game(int numberOfPlayer) {
		for (int i = 1; i <= numberOfPlayer; i++) {
			Player p1 = new Player(i);
			players.add(p1);
		}
		board = new Board(10, 10, 10);
		dice = new Dice(1, 6);
		endPosition = board.getBoardEndPosition();
		initializeGame();
	}

	public void initializeGame() {
		while (!winner) {
			Player player = players.peek();
			System.out.println("Rolling a Dice by " + player.getId());
			int number = dice.rollDice();
			System.out.println("Player dice number is: " + number);
			players.remove();
			int finalPosition = (player.getPosition() + number);

			if (finalPosition >= endPosition) {
				winner = true;
				System.out.println("Player " + player.getId() + " is a winner");
				break;
			}

			Cell cell = board.getCell(finalPosition);
			Jump jump = cell.getJump();
			if (jump != null) {
				if (jump.getStart() > jump.getEnd()) {
					System.out.println("Player " + player.getId() + " finds Snack");
				} else {
					System.out.println("Player " + player.getId() + " finds Ladder");
				}
				player.setPosition(jump.getEnd());
			} else {
				player.setPosition(finalPosition);
			}
			System.out.println("Player " + player.getId() + " position is: " + player.getPosition());
			players.add(player);
		}
	}
}
