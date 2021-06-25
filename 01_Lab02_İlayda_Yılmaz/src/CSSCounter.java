import cs1.SimpleURLReader;

import java.util.ArrayList;

public class CSSCounter extends MySimpleURLReader{

    String sourceCode = super.getPageContents().substring(4);

    int index;
    float c;

    public CSSCounter( String URL ) {
        super( URL );
        index = 0;
        c = 0;
    }

    public float getNumberOfCSSLinks(){

        float d= c;
        ArrayList<String> css = new ArrayList<String>();

        while ( sourceCode.indexOf("<link", index ) != -1 && index != -1 ){

            int link = sourceCode.indexOf("<link", index );
            int endOfLink = sourceCode.indexOf(">", link );
            css.add(sourceCode.substring( link, endOfLink));
            index = endOfLink;
        }

        for ( String i : css ){
            System.out.println( i );
            c++;
            System.out.println( c );
            d = c;
        }

        return d;
    }
}
