package examen;

import java.util.*;

/**
 * Clase para jugar a piedra, papel o tijera.
 * 
 * @author DAM113
 * @version 1.2
 * 
 * @param keyboard Sirve para ingresar las opciones por teclado con el uso de números del 1 al 3, incluidos estos.
 * @param scanner Sirve para inicializar el scanner y leer lo que el usuario ingresa por teclado.
 * @param optionList Sirve para elegir las opciones disponibles respecto al número ingresado.
 * 
 */
public class RockPaperScissors {
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	public static final List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");

	public RockPaperScissors() {
	}

	/**
	 * Método main con el que se muestra un pequeño menú explicando las opciones, aquí se elige de forma aleatoria la
	 *  opción del ordenador, se pone en común con la que hayas puesto, se llama al método para ver quién ha ganado y cierra el scanner.
	 * 
	 */
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
	
	/**
	 * Método por el que según la opción elegida por el usuario y el ordenador, se indica un mensaje para mostrar si has ganado,
	 *  has perdido o si hay un empate.
	 *  
	 *  @param gameResult Un string vacío que luego se devuelve con el resultado del juego respectivamente.
	 * 
	 */
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