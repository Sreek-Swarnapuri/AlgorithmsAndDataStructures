package SolvingCodingProblems.strings;

public class ReverseAString {

    public static String reverse(String reversed){
        StringBuilder sb = new StringBuilder(reversed.length());
        for(int i = reversed.length()-1; i>=0 ; i--)
        {
            sb.append(reversed.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args){

        /*
        Create a function/Method that reverses a string.
        "rakeerS si eman yM" should be
        "My name is Sreekar"
         */

        System.out.println(reverse("rakeerS si eman yM"));

    }

}
