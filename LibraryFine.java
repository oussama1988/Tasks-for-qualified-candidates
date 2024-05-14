package LibraryFine;

public class LibraryFine {
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		if (!isValidDate(d1, m1, y1) || !isValidDate(d2, m2, y2)) {
			throw new IllegalArgumentException("Invalid date input");

		} else {
			if (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2)) {
				// Book returned on or before the due date
				return 0;
			} else if (y1 == y2 && m1 == m2) {
				// Book returned within the same month and year, but after the due date
				return 15 * (d1 - d2);
			} else if (y1 == y2 && m1 > m2) {
				// Book returned after the due month, but within the same year
				return 500 * (m1 - m2);
			} else {
				// Book returned after the due year
				return 10000;
			}

		}

	}

	private static boolean isValidDate(int day, int month, int year) {
		// TODO Auto-generated method stub
		return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1 && year <= 5000;

	}

	public static void main(String[] args) {
		int d1 = 7, m1 = 4, y1 = 2023;
		int d2 = 3, m2 = 4, y2 = 2023;
		System.out.println(libraryFine(d1, m1, y1, d2, m2, y2)); 
	}
}
