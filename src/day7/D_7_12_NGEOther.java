package day7;
import java.util.*;
public class D_7_12_NGEOther {

	 public static int[] nextGreaterOther(int[] nums1, int[] nums2) {
	 	 // Write your code here	 
	 	    HashMap<Integer,Integer> map = new HashMap<>();
	 	    Stack<Integer> st = new Stack<>();
	 	    for(int i =0;i<nums2.length;i++){	 	        
	 	        while(!st.isEmpty()&&st.peek()<nums2[i]){
	 	            map.put(st.pop(),nums2[i]);
	 	        }
	 	        st.push(nums2[i]);
	 	    }
	 	    
	 	    int[] ans = new int[nums1.length];
	 	    
	 	    for(int i=0;i<nums1.length;i++){
	 	        ans[i]=map.getOrDefault(nums1[i],-1);
	 	    }
	 	    
	 	    return ans;
	 	 }
	 	 
	 	 // Dont make changes here
	 	 public static void main(String[] args) {
	 	 	 // TODO Auto-generated method stub
	 	 	 Scanner sc=new Scanner(System.in);
	 	 	 int n1=sc.nextInt(), n2=sc.nextInt();
	 	 	 int[] nums1=new int[n1]; int[] nums2=new int[n2];
	 	 	 for(int i=0;i<n1;i++)nums1[i]=sc.nextInt();
	 	 	 for(int i=0;i<n2;i++)nums2[i]=sc.nextInt();
	 	 	 int[] res=nextGreaterOther(nums1, nums2);
	 	 	 for(int i=0;i<n1;i++)System.out.print(res[i] + " ");
	 	 }
	 
}
