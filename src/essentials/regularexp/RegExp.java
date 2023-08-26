package essentials.regularexp;

import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        // matches()
        String regex = "Hello";
        String input = "Hello";
        System.out.println(input.matches(regex));
        System.out.println(Pattern.matches(regex, input));

        // split()- splits() a given string into an array of string
        String chainedString = "Lets-break-this-chain-and-be-free-!";
        String regex1 = "-";
        String[] freeStrings = chainedString.split(regex1);
        for (String str : freeStrings) {
            System.out.println(str);
        }

        /*
         * 1) Literals: characters that have a literal meaning.
         * 2) Meta Characters: special characters/symbols
         * 3) Quantifiers: specify the frequency of occurence of a character or group
         * 
         * Ex: "Hello.*" -> Hello are the literals, . is a meta character and * is a
         * quantifier
         * 
         * ? - zero or one time
         * * - zero or more times
         * + - one or more times
         * {m} - exactly m times
         * {m,} - m or more times
         * {m,n} - minimum m times and maximum n times
         */

        String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
        System.out.println("Sar_9-3@gmail.com".matches(emailIdRegex));
    }
}
