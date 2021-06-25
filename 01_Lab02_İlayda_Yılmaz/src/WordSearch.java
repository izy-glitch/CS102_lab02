import cs1.SimpleURLReader;

public class WordSearch extends HTMLFilteredReader{

    String text = super.getPageContents();

    public WordSearch( String URL ) {
        super( URL );
    }

    public void getWordIndex( String word ) {
        int index;
        index = text.indexOf( word );

        System.out.printf("%s is in the index %d\n", word, index);
    }
}
