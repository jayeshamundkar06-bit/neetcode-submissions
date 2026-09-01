class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> Map = new HashMap<>();
        for(String s : strs) {
            int[]count = new int[26];

            for(char c : s.toCharArray()) {
                count[c-'a']++;
            }
            String Key = Arrays.toString(count);

            Map.putIfAbsent(Key,new ArrayList<>());
            Map.get(Key).add(s);
        }
        return new ArrayList<>(Map.values());
    }
}
