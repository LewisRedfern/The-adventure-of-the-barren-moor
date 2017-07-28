import java.util.*;

public class GameBoard {

	Cell[][] board;

	public void createBoard(int i) {
		
		board = new Cell[i][i];
		
		int charPosition = i / 2;

		for (int y = 0; y < i; y++) {// sets the y axis to the size of i
			for (int x = 0; x < i; x++) {// same for x axis

				board[y][x] = new Cell(new Empty());// puts an instance of the
													// empty cell object into
													// each field of the array

			}
		}
		// put the character in the centre of the Array
		board[charPosition][charPosition] = new Cell(new Character());
		
		// places the enemies at a random spots in the array
		placeEnemy(i);
		
		// places the bonuses at a random spots in the array
		placeBonus(i);
		
		// places the treasure at a random spot in the array
		placeTreasure(i);
	}

	public void placeTreasure(int i) {

		Random r = new Random();

		int treasureSet = r.nextInt(i);

		board[treasureSet][treasureSet] = new Cell(new Treasure());
	}

	public void placeEnemy(int i) {

		int enemyAmount = (i * i) / 8;
		Random r = new Random();

		int enemySet = r.nextInt(i);

		for (int e = 0; e < enemyAmount; e++) {

			board[enemySet][enemySet] = new Cell(new Enemy());
		}
	}
	
	public void placeBonus(int i) {

		int bonusAmount = (i * i) / 8;
		Random r = new Random();

		int bonusSet = r.nextInt(i);

		for (int e = 0; e < bonusAmount; e++) {

			board[bonusSet][bonusSet] = new Cell(new Bonus());
		}
	}
}
