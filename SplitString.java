package Practice090218;

public class SplitString {

    // Java program to demonstrate working of split(regex,
    // limit) with small limit.
    public static void main(String[] args) {
        String str = "The@world@is@nice";
        String[] arrOfStr = str.split("@", 2);
        for (String a : arrOfStr)
            System.out.println(a);


       /* Parameters:
        regex - a delimiting regular expression
        Limit - the result threshold

        Returns:
        An array of strings computed by splitting the given string.

        Throws:
        PatternSyntaxException - if the provided regular expression’s
        syntax is invalid.*/
    }
}
