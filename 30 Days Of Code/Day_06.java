import java.util.Scanner;

public class Day_06 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String str1 = "";
    	String str2 = "";
    	for(int i=0; i<n; i++) {
    	String[] pstr = sc.next().split("");
    		for(int j=0; j<pstr.length; j++) {
    			if(j%2==0) {
    				str1 += pstr[j];
    			}else {
    				str2 += pstr[j];
    			}
    		}
    		System.out.println(str1 + " " + str2);
    		str1 = "";
    		str2 = "";
    	}
    }
}
