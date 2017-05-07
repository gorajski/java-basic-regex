import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {

    public static Boolean has_ssn(String input) {
        Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher m = p.matcher(input);
        Boolean b = m.find();
        return b;
    }

//# Find and return a Social Security Number.
//    def grab_ssn(string)
    public static String grab_ssn(String input) {
        Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher m = p.matcher(input);
        if(m.find()) {
            return input.substring(m.start(), m.end());
        }
        return "";
    }

//# Find and return all Social Security Numbers.
//    def grab_all_ssns(string)
    public static String[] grab_all_ssns(String input) {
        List<String> outputList = new ArrayList<String>();
        Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher m = p.matcher(input);

        while(m.find()) {
            outputList.add(input.substring(m.start(), m.end()));
        }
        if(outputList.size() > 0) {
            return outputList.toArray(new String[outputList.size()]);
        }
        return new String[1];
    }

//# Obfuscate all Social Security Numbers. Example: XXX-XX-4430.
//    def hide_all_ssns(string)
    public static String[] hide_all_ssns(String input) {
        String[] x = new String[2];
        x[0] = "chyea";
        x[1] = "hov";
        return x;
    }

//# Format all Social Security Numbers to use single dashes for delimiters:
//            # '480014430', '480.01.4430', and '480--01--4430' would all be formatted '480-01-4430'.
//    def format_ssns(string)
    public static String[] format_ssns(String input) {
        String[] x = new String[2];
        x[0] = "chya";
        x[1] = "boy";
        return x;
    }
}
