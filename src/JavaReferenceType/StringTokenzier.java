package JavaReferenceType;

/*
boolean hasMoreTokens(): check if there is more tokens available.

boolean hasMoreElements(): works similar to hasMoreTokens() method.

String nextToken(): returns the next tokens from the StringTokenizer obj.

String nextToken(String delim): Returns the next token based on  the delimiter.

Object nextElement(): works similar to nextToken() but return an object.

int countTokens(): returns the total number of tokens.
*/

import java.util.StringTokenizer;

public class StringTokenzier {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("East West North South", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("East,West,North,South", " ");
        // printing nxt token
        System.out.println("Next Token is " + st1.nextToken(","));

    }
}
