
import java.util.*;



/*public class generateNgrams{
    
    private  String words[];  // List of words in Supplied String
    private  HashMap<String ,List<String> > nGramsMap; // Mapping of the Ngrams
    private int n; // Value for NGram

    generateNgrams(String text, int n){

         if(n<1 || text==null || text.length()==0) 
            throw new IllegalArgumentException("Check the input Parameters : String Should not be null or empty and Ngram value should be > 1");

        words=text.split(" ");
        nGramsMap=new HashMap<String ,List<String>>();
        this.n=n;
    }
    public Map<String, List<String>> fromText(String text) {
    // Use .isEmpty() instead of .length() == 0
    if (text == null || text.isEmpty()) {
        throw new IllegalArgumentException("null or empty text");
    }
    String[] words = text.split(" ");
    Map<String, List<String>> nGramsMap = new HashMap<String, List<String>>();

    for(int i = 0; i <= words.length-n ; i++) {
        // Renamed sb to give it purpose.  Use a for-loop.
        // Removed the special case within the loop.
        StringBuilder keyBuilder = new StringBuilder(words[i].trim());
        for (int j = 1; j < n - 1; j++) {
            keyBuilder.append(' ').append(words[i + j].trim());
        }
        String key = keyBuilder.toString();

        // Calling .containsKey() is redundant work; just call .get().
        // (The only reason to call .containsKey() would be to check for
        // an entry with a null value, which wouldn't be the case for us.)
        List<String> list = nGramsMap.get(key);
        if (list == null) {
            nGramsMap.put(key, list = new ArrayList<String>());
        }
        // Added benefit: we can write the following line just once.
        list.add(words[i + n - 1]);
    }
    return nGramsMap;
}}*/
    public class generateNgrams {


         public static List<List<String>> getNGramsPositions(List<String> items, int minSize, int maxSize) {
        List<List<String>> ngrams = new ArrayList<List<String>>();
            int listSize = items.size();
            for (int i = 0; i < listSize; ++i) {
                for (int ngramSize = minSize; ngramSize <= maxSize; ++ngramSize) {
                    if (i + ngramSize <= listSize) {
                        List<String> ngram = new ArrayList<String>();
                            for (int j = i; j < i + ngramSize; ++j) {
                                 ngram.add(items.get(j));
            }
                   
            ngrams.add(ngram);
        }
        }
    }
    return ngrams;
    }
    }

    

