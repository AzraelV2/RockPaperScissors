package examen;

import java.util.*;

public class RockPaperScissors {
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	public static final List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");

	public RockPaperScissors() {
	}

	public static void main(String[] args) {
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(userChoice, computerChoice));
		scanner.close();
	}

	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}