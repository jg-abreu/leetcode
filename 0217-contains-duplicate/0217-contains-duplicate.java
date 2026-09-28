class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSeen = new HashSet<>();
        
        for (int num : nums) {
            if (!(numsSeen.contains(num))) {
                numsSeen.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}