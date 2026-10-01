class Solution {
    public int firstUniqChar(String s) {
        /* 
            1. create a map: letter → count

            2. loop through the string and count each letter

            3. loop through the string again, in order
            for each letter, look up its count in the map
            if the count is 1 → return its index

            4. if no letter has count 1 → return -1 
        */

        Map<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {

            char letter = s.charAt(i);

            if(letterCount.containsKey(letter)) {
                int count = letterCount.get(letter);
                count += 1;
                letterCount.put(letter, count);
            } else {
                letterCount.put(letter, 1);
            }
        } 

        for (int i = 0; i < s.length(); i ++) {

            char letter = s.charAt(i);

            if (letterCount.get(letter) == 1) {
                return i;
            }
        }
        
        return -1;
    
    }
}