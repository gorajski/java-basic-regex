import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {

    public static Boolean has_ssn(String input) {
        Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher m = p.matcher(input);
        Boolean b = m.find();
        System.out.print(b);
        return b;
    }

//# Find and return a Social Security Number.
//    def grab_ssn(string)
    public static String grab_ssn(String input) {
        return "hi";
    }

//# Find and return all Social Security Numbers.
//    def grab_all_ssns(string)
    public static String[] grab_all_ssns(String input) {
        String[] x = new String[2];
        x[0] = "hi";
        x[1] = "bye";
        return x;
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
