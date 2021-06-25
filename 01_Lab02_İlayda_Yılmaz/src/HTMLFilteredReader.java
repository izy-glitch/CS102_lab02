import cs1.SimpleURLReader;

public class HTMLFilteredReader extends MySimpleURLReader{

    String sourceCode = super.getPageContents().substring(4);

    public HTMLFilteredReader( String URL ) {
        super( URL );
    }

    public String getPageContents(){

        String filteredText = "";
        int i = 0;

        while ( i < sourceCode.length()){
            while( sourceCode.charAt( i ) == '<' ){
                if( sourceCode.charAt( i ) == '<' ){
                    do{
                        i++;
                    }while( sourceCode.charAt( i ) != '>');
                }

                i++;
            }

            filteredText = filteredText + sourceCode.charAt( i );
            i++;
        }
        return filteredText;
    }

    public String getUnfilteredPageContents(){
        return sourceCode;
    }
}
