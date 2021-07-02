import cs1.SimpleURLReader;

public class LastTest {

    public static void main (String[] args){

    // PART B. Testing MySimpleURLReader
    MySimpleURLReader link = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" );
    System.out.println( link.getURL() );

    // PART C. Testing CSSCounter
    CSSCounter cssLink = new CSSCounter( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" );
    cssLink.getNumberOfCSSLinks();

    CSSCounter partALink = new CSSCounter( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt" );
    System.out.println( partALink.getNumberOfCSSLinks() );

    // PART D. Testing HTMLFilteredReader
    HTMLFilteredReader nameOfCountries = new HTMLFilteredReader(
            "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" );
    System.out.println( nameOfCountries.getPageContents() );

    // PART E. Testing WordSearch
    WordSearch findIndex = new WordSearch( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" );

    findIndex.getWordIndex( "Turkey" );
    findIndex.getWordIndex( "Ankara" );
    }
}
