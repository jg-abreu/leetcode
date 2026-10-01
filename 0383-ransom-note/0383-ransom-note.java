class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> ransomNoteList = new HashMap<>();
        Map<Character, Integer> magazineList = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i ++) {

            char letter =ransomNote.charAt(i);

            if (ransomNoteList.containsKey(letter)) {
                int count = ransomNoteList.get(letter);
                count += 1;
                ransomNoteList.put(letter, count);
            } else {
                ransomNoteList.put(letter, 1);
            }  
        }

        for (int i = 0; i < magazine.length(); i ++) {

            char letter =magazine.charAt(i);

            if (magazineList.containsKey(letter)) {
                int count = magazineList.get(letter);
                count += 1;
                magazineList.put(letter, count);
            } else {
                magazineList.put(letter, 1);
            }  
        }

        for (char letter : ransomNoteList.keySet()) {

            int need = ransomNoteList.get(letter);
            int have = magazineList.getOrDefault(letter, 0);

            if (have < need) {
                return false;
            }
        }

        return true;
    }
}