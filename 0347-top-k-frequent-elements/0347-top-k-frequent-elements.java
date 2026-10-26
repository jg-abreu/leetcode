class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Create the HashMap (number -> frequency)
        Map<Integer, Integer> c = new HashMap<>();

        // 2. Iterate over nums and count each number in the map
        //    (for-each + getOrDefault)

        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
        }

        // 3. Move the map's entries into a List
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(c.entrySet());

        // 4. Sort the list by frequency, highest to lowest

        l.sort((a, b) -> b.getValue() - a.getValue());

        // 5. Create the result int[] with size k

        int[] r = new int[k];

        // 6. Fill the result with the keys of the first k entries in the list
        //    (for loop from 0 to k)

        for (int i = 0; i < k; i++) {
            r[i] = l.get(i).getKey();
        }

        // 7. Return the result

        return r;
    }
}