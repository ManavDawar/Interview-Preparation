package test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hack3a {

	public static List<Integer> commandCount(List<String> commands)
    {
        List<Integer> lengths = new ArrayList<>();
        for(int n=0;n<commands.size();n++) {
			String s=commands.get(n).toString();
            int count = 0;
            String[] substring = GetAllSubstring(s);
            for (int i = 0; i < substring.length; i++)
            {
                String input = substring[i];
                Pattern p = Pattern.compile("^[a-z]{1}\\w*\\:*\\/\\w+\\\\[a-z]+$");
//                Regex r1 = new Regex(@"^[a-z]{1}\w*\:*\/\w+\\[a-z]+$");
              Matcher m = p.matcher(input);  
  
//                Match match = r1.Match(input);

            if (m.matches())
                count += m.groupCount();
              
//                if (match.Success)
//                    count += match.Groups.Count;
            }
            lengths.add(count);
        }

        return lengths;
    }

    static List<String> GetAllSubstring(String command)
    {
        List<String> substrings = new ArrayList<>();
        char[] array = command.toCharArray();
        for (int i = 0; i < array.length; i++)
        {
            StringBuilder sub = new StringBuilder(array[i]);
            substrings.add(sub.toString());
            for (int j = i+1; j < array.length; j++)
            {
                substrings.add(sub.append(array[j]).toString());
            }
        }

        return substrings;
    }
}
