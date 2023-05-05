package day7Assignmet;

public class SnakeAndLadder {
	static final int WIN_POSITION = 100;
	static int playerPosition1 = 0;
	static int playerPosition2 = 0;
	static int diceCountP1 = 0;
	static int diceCountP2 = 0;

	static void whoWon(String player, int playerPosition, int diceCount) {
		System.out.println("***********");
		System.out.println(player + " won");
		System.out.println("position = " + playerPosition);
		System.out.println("dice rolled " + diceCount + " times to win");
		System.out.println("***********");
	}

	public static void main(String[] args) {
		System.out.println("Snake and Ladder Game");

		int playerChance = 0;
		while (playerPosition1 < WIN_POSITION && playerPosition2 < WIN_POSITION) {
			int option = (int) (Math.random() * 10 % 3); // 0 or 1 or 2
			System.out.println("Choice = " + option);

			int diceValue = (int) (Math.random() * 10 % 6 + 1);
			System.out.println("dice value = " + diceValue);

			if (playerChance % 2 == 0) {
				switch (option) {
				case 0:
					System.out.println("no play");
					System.out.println("--------------------------");
					break;
				case 1:
					diceCountP1++;
					playerPosition1 = playerPosition1 + diceValue;
					// If crossing 100
					if (playerPosition1 > WIN_POSITION) {
						playerPosition1 = playerPosition1 - diceValue;
					}
					System.out.println("Player 1 --> " + playerPosition1);
					System.out.println("--------------------------");
					if (playerPosition1 == WIN_POSITION)
						whoWon("Player 1", playerPosition1, diceCountP1);
					break;
				case 2:
					diceCountP1++;
					playerPosition1 = playerPosition1 - diceValue;
					// If crossing below 0
					if (playerPosition1 < 0) {
						playerPosition1 = 0;
					}
					System.out.println("Player 1 --> " + playerPosition1);
					System.out.println("--------------------------");
					if (playerPosition1 == WIN_POSITION)
						whoWon("Player 1", playerPosition1, diceCountP1);
					break;
				}
			} else {
				switch (option) {
				case 0:
					System.out.println("no play");
					System.out.println("--------------------------");
					break;
				case 1:
					diceCountP2++;
					playerPosition2 = playerPosition2 + diceValue;
					// If crossing 100
					if (playerPosition2 > WIN_POSITION) {
						playerPosition2 = playerPosition2 - diceValue;
					}
					System.out.println("Player 2 --> " + playerPosition2);
					System.out.println("--------------------------");
					if (playerPosition2 == WIN_POSITION)
						whoWon("Player 2", playerPosition2, diceCountP2);
					break;
				case 2:
					diceCountP2++;
					playerPosition2 = playerPosition2 - diceValue;
					// If crossing below 0
					if (playerPosition2 < 0) {
						playerPosition2 = 0;
					}
					System.out.println("Player 2 --> " + playerPosition2);
					System.out.println("--------------------------");
					if (playerPosition2 == WIN_POSITION)
						whoWon("Player 2", playerPosition2, diceCountP2);
					break;
				}
			}
			playerChance++;
		}
	}
}
