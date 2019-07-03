package day18ArraysandStrings;

import java.util.Scanner;

public class IntegerToRoman {

	public static String intToRoman(int num) {

//		String[] ms= {"","M","MM","MMM"};
//		String[] hun= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
//
//		String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
//		String[] ones= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
//		
//		String ans=ms[num/1000]+hun[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];
//		
//		return ans;
//		-----------------------------------------------------------------
		
		 String romans[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		 
 	 	 int vals[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
 	 	 int i=0;
 	 	 String ans="";
 	 	 while(num>0&&i<vals.length) {
 	 		 if(num>=vals[i]) {
 	 			 num-=vals[i];
 	 			 ans+=romans[i];
 	 		 }else {
 	 			 i++;
 	 		 }
 	 		 
 	 	 }
 	 	 return ans;
	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(intToRoman(num));

	}

}
