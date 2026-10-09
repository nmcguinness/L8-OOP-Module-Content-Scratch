package ce01;

import java.util.regex.Pattern;

public class LicencePlateHelper {

    public static boolean sumsTo(String s, int target){

        char[] strAsChars = s.toCharArray();  //"XYZ" -> \2\6\2

        int sum = 0;

        for(int i = 0; i < strAsChars.length; i++)
           sum += (int)strAsChars[i]-48;

        return sum == target;
    }

    public static boolean containsLetter(String s, String target) {
        return s.indexOf(target) != -1;
    }

    public static boolean containsSequence(String s, String regex){
        return Pattern.matches(regex,s);
    }
}
