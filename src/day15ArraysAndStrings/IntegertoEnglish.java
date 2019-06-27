package day15ArraysAndStrings;

import java.util.*;

public class IntegertoEnglish {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(numberToWords(num));
	}

	private final static String[] LessThanTwenty = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private final static String[] Tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	private final static String[] Thousands = { "", "Thousand", "Million", "Billion" };

	public static String numberToWords(int num) {

		if (num == 0)
			return "Zero";
		return number2Words(num);

	}

	private static String number2Words(int num) {
		if (num == 0) {
			return "Zero";
		}
		int index=0;
		StringBuilder ans = new StringBuilder();
		while (num > 0) {
			if (num % 1000 != 0) {
				StringBuilder temp = new StringBuilder();
				helper(temp, num % 1000);
				 ans.insert(0, temp.append(Thousands[index]).append(" "));
			}
			
			index++;
			num/=1000;
		}
		return ans.toString();
	}

	private static void helper(StringBuilder ans, int n) {
		if(n==0) {
			return ;
		}else if(n<20) {
			ans.append(LessThanTwenty[n]).append(" ");
			return;
		}else if(n<100) {
			ans.append(Tens[n/10]).append(" ");
			helper(ans,n%10);
		}else {
			ans.append(LessThanTwenty[n/100]).append(" hundred ");
			helper(ans, n%100);
		}
	}

}
