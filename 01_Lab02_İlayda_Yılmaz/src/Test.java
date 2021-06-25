import cs1.SimpleURLReader;

public class Test {
    public static void main (String[] args){

        SimpleURLReader test = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt" );

        System.out.println( test.getPageContents() );
        System.out.println( test.getLineCount() );
    }
}
