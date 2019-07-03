package test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hack3b {

	public static List<Integer> commandCount(List<String> commands) {
		List<Integer> substrings = new ArrayList<>();
		for (int n = 0; n < commands.size(); n++) {
			String s = commands.get(n).toString();
			int count = 0;
			List<String> listofstrings = new ArrayList<>();
			
			for (int i = 0; i < s.toCharArray().length; i++) {
				StringBuilder sub = new StringBuilder(s.toCharArray()[i]);
				listofstrings.add(sub.toString());
				for (int j = i + 1; j < s.toCharArray().length; j++) {
					listofstrings.add(sub.append(s.toCharArray()[j]).toString());
				}
			}
			
			String[] arrayofsubstr = new String[listofstrings.size()];
			for (int x = 0; x < listofstrings.size(); x++) {
				arrayofsubstr[x] = listofstrings.get(x);
			}

			for (int i = 0; i < arrayofsubstr.length; i++) {
				String substr = arrayofsubstr[i];
				Pattern p = Pattern.compile("^[a-z]{1}\\w*\\:*\\/\\w+\\\\[a-z]+$");
				Matcher m = p.matcher(substr);


				while(m.find()) {
					count++;
				}
				if (m.matches())
					count += m.groupCount();

			}
			substrings.add(count);
		}

		return substrings;
	}

	 public static void Main(String[] args)
	    {

	        commandCount(new ArrayList<>(Arrays.asList("w:/a\\bc::/12\\xyz")));
	        

	    }

}
