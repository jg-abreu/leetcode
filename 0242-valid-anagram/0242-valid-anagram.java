class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sContains = new HashMap<>();

        HashMap<Character, Integer> tContains = new HashMap<>();
        
        for (int i = 0; i < s.length(); i ++) {

            char letter = s.charAt(i);
            
            if (sContains.containsKey(letter)){
                int count = sContains.get(letter);
                count += 1;
                sContains.put(letter, count);
            } else {
                sContains.put(letter, 1);
            }
        }

        for (int i = 0; i < t.length(); i ++) {

            char letter = t.charAt(i);
            
            if (tContains.containsKey(letter)){
                int count = tContains.get(letter);
                count += 1;
                tContains.put(letter, count);
            } else {
                tContains.put(letter, 1);
            }
        }

        return sContains.equals(tContains);
    }
}