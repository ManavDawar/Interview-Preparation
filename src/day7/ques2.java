package day7;
import java.util.*;

public class ques2 {
	
	public static class Helper{
		
		int pid;
		int ws;//when started
		int nmt;//not my time
		
		public Helper(int pid,int ws,int nmt) {
			this.pid=pid;
			this.ws=ws;
			this.nmt=nmt;
		}
		
	}
//	public static int[] exclusiveTime(int n, List<String> logs) {
//	     // Write your code here
//
//        String[] str = logs.get(0).split(arg0, arg1);
//	        
//	     }
	     
	     
	     // Dont make changes here
	     public static void main(String[] args) {
//	         Scanner sc = new Scanner(System.in);
//	         int n = sc.nextInt();
//	         int L = sc.nextInt();
//	         List<String> logs = new ArrayList<>(L);
//	         for (int i = 0; i < L; i++) {
//	             logs.add(sc.next());
//	         }
//	         int[] res = exclusiveTime(n, logs);
//	         for (int i = 0; i < res.length; i++) {
//	             System.out.print(res[i] + " ");
//	         }
	    	 String Str = new String("a:B:C:D:E:F:G:H");
	         System.out.println("Return Value :" );
	         
	         for (String retval: Str.split(":", -1)) {
	            System.out.println(retval);
	         }
	     }
	


}
