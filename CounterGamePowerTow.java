package CounterGame;

public class CounterGamePowerTow {
	public static String counterGame(long n) {
		// Initialize player as "Naser" since Naser always starts
		String currentPlayer = "Naser";

		// Continue the game until n becomes 1
		while (n >= 1) {
			// If n is a power of 2, divide it by 2
			if ((n & (n - 1)) == 0) {
				n /= 2;
			} else {
				// Find the next lower power of 2 and subtract it from n
				long powerOf2 = Long.highestOneBit(n);
				n -= powerOf2;
			}

			// Switch the player
			currentPlayer = (currentPlayer.equals("Naser")) ? "Ali" : "Naser";
		}

		// Return the winner
		return currentPlayer;
	}

	public static void main(String[] args) {
		long n = 6;
		System.out.println(counterGame(n)); 
	}
}
