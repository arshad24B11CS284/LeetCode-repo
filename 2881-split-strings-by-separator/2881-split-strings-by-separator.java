import java.util.*;
import java.util.regex.Pattern; 

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        String sep = Pattern.quote(String.valueOf(separator));

        for (String word : words) {
            String[] arr = word.split(sep);
            for (String part : arr) {
                if (!part.isEmpty()) { 
                    res.add(part);
                } 
            }
        }

        return res;
    }
}
