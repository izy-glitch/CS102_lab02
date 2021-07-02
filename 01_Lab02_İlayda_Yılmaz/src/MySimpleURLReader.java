import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader {

    //Properties
    String URL;

    public MySimpleURLReader( String URL ) {
        super( URL );
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public String getName() {
        int index = URL.lastIndexOf( "/" );
        return URL.substring( index + 1 );
    }
}
