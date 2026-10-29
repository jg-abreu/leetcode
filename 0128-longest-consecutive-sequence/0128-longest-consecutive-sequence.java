class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        int longest = 0;

        for (int n : nums) {
            numSet.add(n);
        }

        for (int n : numSet) {
            // check if its start of a sequence
            
            if (!(numSet.contains(n - 1))) {
                int length = 0;
                while (numSet.contains(n + length)) {
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}