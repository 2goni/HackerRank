import java.util.Scanner;

public class Day_10 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();

		int max = 0;
		String result[] = Integer.toBinaryString(n).split("0");
		for (int i = 0; i < result.length; i++) {
			if (result[i].length() > max) {
				max = result[i].length();
			}
		}
		System.out.println(max);

	}
}
