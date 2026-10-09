package ce01;

public class LicencePlateHelper {

    public static boolean sumsTo(String s, int target){

        char[] strAsChars = s.toCharArray();  //"262" -> \2\6\2

        for(int i = 0; i < strAsChars.length; i++)
            System.out.println((int)strAsChars[i]);  //50

        return false;
    }

    public static boolean containsLetter(String s, String target) {
        return s.indexOf(target) != -1;
    }

    public static boolean containsSequence(String s, String regexSequence){
        return false;
    }
}
