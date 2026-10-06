import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Create the map: key = sorted word, value = list of original words

        HashMap<String, List<String>> grp = new HashMap<>();

        for (String word : strs) {
            
            // 2. Build the sorted key for the word (toCharArray → Arrays.sort → new String)

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key  = new String(chars);

            // 3. If the key is not in the map yet, create a new list for it
            if (!(grp.containsKey(key))) {
                grp.put(key, new ArrayList<>());

            }
            // 4. Add the original word to that key's list
            grp.get(key).add(word);
        }
        // 5. Return all the map's values as a List
        return new ArrayList<>(grp.values());
    }
}