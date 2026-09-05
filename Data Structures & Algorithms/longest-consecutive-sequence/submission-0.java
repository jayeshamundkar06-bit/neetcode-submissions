class Solution {
    public int longestConsecutive(int[] nums) {

        java.util.Set<Integer> numSet = new java.util.HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {

            if (!numSet.contains(num - 1)) {

                int length = 1;

                while (numSet.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}