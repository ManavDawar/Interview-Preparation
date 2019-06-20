package day11hashmapandheap;

import java.util.*;

public class D_11_06_SubDomain {

	public static List<String> subdomainVisits(String[] cpdomains) {
		// Write your code here
		HashMap<String, Integer> domainMap = new HashMap<>();
		 
		 for (String eachDomain : cpdomains) {
			 String[] comleteline=eachDomain.split("\\s+");
			 String[] actualNames=comleteline[1].split("\\.");
			 int count=Integer.valueOf(comleteline[0]);
			 String cur="";
 	 	 	 for (int i = actualNames.length - 1; i >= 0; --i) {
 	 	 	 	 cur = actualNames[i] + (i < actualNames.length - 1 ? "." : "") + cur;
 
 	 	 	 	 domainMap.put(cur, domainMap.getOrDefault(cur, 0) + count);
 	 	 	 }
 
 	 	 }
		
		List<String> list=new ArrayList<>();
		
		for(String dom:domainMap.keySet()) {
			list.add(domainMap.get(dom)+" "+dom);
		}
		return list;
		
	}

	// Don't make any changes here
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] cpd = new String[n];
		for (int i = 0; i < cpd.length; i++) {
			cpd[i] = s.nextLine();
		}
		List<String> ans = subdomainVisits(cpd);
		Collections.sort(ans);
		System.out.println(ans);
	}

}
