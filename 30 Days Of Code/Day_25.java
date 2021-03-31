import java.util.Scanner;

public class Day_25 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] answer = new String[size];
		for (int i = 0; i < size; i++) {
			String num = sc.next();
			answer[i] = checkPrime(num);
		}

		for (String str : answer) {
			System.out.println(str);
		}
	}

	public static String checkPrime(String num) {
		String[] check = num.split("\\D");
		int checki = Integer.parseInt(check[0]);
		if (check.length > 1) {
			return checkPrime(check[0]) + check[1];
		}
		if (checki == 1) {
			return "Not prime";
		}
		for (int i = 2; i <= checki / i; i++) {
			if (checki % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";
	}
}