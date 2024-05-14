package StringFunctionCalulation;




public class StringFunctionCalculation {
	 public static int maximumValue(String t) {
	        int max = 0;

	        // Iterate over all substrings of t
	        for (int i = 0; i < t.length(); i++) {
	            for (int j = i + 1; j <= t.length(); j++) {
	                String substring = t.substring(i, j);
	                int length = substring.length();
	                int value = length * countOccurrences(t, substring);

	                max = Math.max(max, value);
	            }
	        }

	        return max;
	    }

	    // Function to count the occurrences of a substring in a string
	    private static int countOccurrences(String str, String substr) {
	        int count = 0;
	        int index = str.indexOf(substr);
	        while (index != -1) {
	            count++;
	            index = str.indexOf(substr, index + 1);
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String t = "aaaaaa";
	        System.out.println(maximumValue(t)); // Output: 12

	        t = "abcabcddd";
	        System.out.println(maximumValue(t)); // Output: 9
	    }
}
