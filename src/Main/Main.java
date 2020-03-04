package org.scrum.psd.battleship.ascii;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import org.scrum.psd.battleship.controller.GameController;
import org.scrum.psd.battleship.controller.dto.Letter;
import org.scrum.psd.battleship.controller.dto.Position;
import org.scrum.psd.battleship.controller.dto.Ship;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static List<Ship>		myFleet;
	private static List<Ship>		enemyFleet;
	private static ColoredPrinter	console;
	private List<Position>			hitedPositions;

	public static void
			main(String[] args) {
		console = new ColoredPrinter.Builder(1, false).build();

		console.setForegroundCoprivate static boolean
//		checkSunked(Ship ship) {
//	boolean sunked = true;
//	if (ship != null) {
//		for (Position position : ship.getPositions()) {
//			if (! hitedPositions.isEmpty()) {
//				if (! hitedPositions.contains(position)) {
//					sunked = false;
//				}
//			}
//		}
//	}
//	return sunked;
//}lor(Ansi.FColor.MAGENTA);
		console.println("                                     |__");
		console.println("                                     |\\/");
		console.println("                                     ---");
		console.println("                                     / | [");
		console.println("                              !      | |||");
		console.println("                            _/|     _/|-++'");
		console.println("                        +  +--|    |--|--|_ |-");
		console.println("                     { /|__|  |/\\__|  |--- |||__/");
		console.println("                    +---------------___[}-_===_.'____                 /\\");
		console.println("                ____`-' ||___-{]_| _[}-  |     |_[___\\==--            \\/   _");
		console.println(" __..._____--==/___]_|__|_____________________________[___\\==--____,------' .7");
		console.println("|                        Welcome to Battleship                         BB-61/");
		console.println(" \\_________________________________________________________________________|");
		console.println("");
		console.clear();

		InitializeGame();

		StartGame();
	}

	private static void
			StartGame() {
		Scanner scanner = new Scanner(System.in);

		console.print("\033[2J\033[;H");
		console.println("                  __");
		console.println("                 /  \\");
		console.println("           .-.  |    |");
		console.println("   *    _.-'  \\  \\__/");
		console.println("    \\.-'       \\");
		console.println("   /          _/");
		console.println("  |      _  /\" \"");
		console.println("  |     /_\'");
		console.println("   \\    \\_/");
		console.println("    \" \"\" \"\" \"\" \"");
		hitedPositions = new List<Position>();
		do {
			console.println("");
			console.println("Player, it's your turn");
			console.println("Enter coordinates for your shot :");
			Position position = parsePosition(scanner.next());

			Ship ship = getShipByPosition(position);
			if (checkSunked(ship)) {
				console.println("the ship is already sunked");
				continue;
			}

			boolean isHit = GameController.checkIsHit(enemyFleet, position);
			if (isHit) {
				beep();

				console.println("                \\         .  ./");
				console.println("              \\      .:\" \";'.:..\" \"   /");
				console.println("                  (M^^.^~~:.'\" \").");
				console.println("            -   (/  .    . . \\ \\)  -");
				console.println("               ((| :. ~ ^  :. .|))");
				console.println("            -   (\\- |  \\ /  |  /)  -");
				console.println("                 -\\  \\     /  /-");
				console.println("                   \\  \\   /  /");
			}

			console.println(isHit ? "Yeah ! Nice hit !" : "Miss");

			position = getRandomPosition();
			isHit = GameController.checkIsHit(myFleet, position);
			console.println("");
			console.println(String.format("Computer shoot in %s%s and %s", position.getColumn(), position.getRow(), isHit ? "hit your ship !" : "miss"));
			if (isHit) {
				beep();
				console.println("                \\         .  ./");
				console.println("              \\      .:\" \";'.:..\" \"   /");
				console.println("                  (M^^.^~~:.'\" \").");
				console.println("            -   (/  .    . . \\ \\)  -");
				console.println("               ((| :. ~ ^  :. .|))");
				console.println("            -   (\\- |  \\ /  |  /)  -");
				console.println("                 -\\  \\     /  /-");
				console.println("                   \\  \\   /  /");

				hitedPositions.add(position);

			}
		} while (true);
	}

	private static void
			beep() {
		console.print("\007");
	}

	protected static Position
			parsePosition(String input) {
		Letter letter = Letter.valueOf(input.toUpperCase().substring(0, 1));
		int number = Integer.parseInt(input.substring(1));
		return new Position(letter, number);
	}

	private static Position
			getRandomPosition() {
		int rows = 8;
		int lines = 8;
		Random random = new Random();
		Letter letter = Letter.values()[random.nextInt(linemyFleets)];
		int number = random.nextInt(rows);
		Position position = new Position(letter, number);
		return position;
	}

	private static void
			InitializeGame() {
		InitializeMyFleet();

		InitializeEnemyFleet();
	}

	private static void
			InitializeMyFleet() {
		Scanner scanner = new Scanner(System.in);
		myFleet = GameController.initializeShips();

		console.println("Please position your fleet (Game board has size from A to H and 1 to 8) :");

		for (Ship ship : myFleet) {
			console.println("");
			console.println(String.format("Please enter the positions for the %s (size: %s)", ship.getName(), ship.getSize()));
			for (int i = 1; i <= ship.getSize(); i++) {
				console.println(String.format("Enter position %s of %s (i.e A3):", i, ship.getSize()));

				String positionInput = scanner.next();
				ship.addPosition(positionInput);
			}
		}
	}

	private static void
			InitializeEnemyFleet() {
		enemyFleet = GameController.initializeShips();

		enemyFleet.get(0).getPositions().add(new Position(Letter.B, 4));
		enemyFleet.get(0).getPositions().add(new Position(Letter.B, 5));
		enemyFleet.get(0).getPositions().add(new Position(Letter.B, 6));
		enemyFleet.get(0).getPositions().add(new Position(Letter.B, 7));
		enemyFleet.get(0).getPositions().add(new Position(Letter.B, 8));

		enemyFleet.get(1).getPositions().add(new Position(Letter.E, 6));
		enemyFleet.get(1).getPositions().add(new Position(Letter.E, 7));
		enemyFleet.get(1).getPositions().add(new Position(Letter.E, 8));
		enemyFleet.get(1).getPositions().add(new Position(Letter.E, 9));

		enemyFleet.get(2).getPositions().add(new Position(Letter.A, 3));
		enemyFleet.get(2).getPositions().add(new Position(Letter.B, 3));
		enemyFleet.get(2).getPositions().add(new Position(Letter.C, 3));

		enemyFleet.get(3).getPositions().add(new Position(Letter.F, 8));
		enemyFleet.get(3).getPositions().add(new Position(Letter.G, 8));
		enemyFleet.get(3).getPositions().add(new Position(Letter.H, 8));

		enemyFleet.get(4).getPositions().add(new Position(Letter.C, 5));
		enemyFleet.get(4).getPositions().add(new Position(Letter.C, 6));
	}

	/**
	 * cheks if a ship is complet sunked
	 */
	// private static boolean
	// checkSunked(Ship ship) {
	// boolean sunked = true;
	// if (ship != null) {
	// for (Position position : ship.getPositions()) {
	// if (! hitedPositions.isEmpty()) {
	// if (! hitedPositions.contains(position)) {
	// sunked = false;
	// }
	// }
	// }
	// }
	// return sunked;
	// }

	/**
	 * retrievs ship by position
	 */
//	private static Ship
//			getShipByPosition(Position position) {
//		Ship shipResult = null;
//		for (Ship ship : enemyFleet) {
//			if (ship.getPositions().contains(position)) {
//				shipResult = ship;
//			}
//
//		}
//		return shipResult;
//	}
	
	private void initialShip(int size)
	{
	    List<String> letters = new ArrayList<String>();
	    
		for(int i = 0; i <= 5 ; i++)
		{
             for(int j = 0; j<=size ; j++)
             {
            	 int firstPosition = random.nextInt(rows);
            	 enemyFleet.get(i).getPositions().add(new Position(Letters.get(i), 4));
             }
		}
}
