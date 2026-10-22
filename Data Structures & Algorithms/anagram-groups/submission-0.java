class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> words = new HashMap<>();
        for(String s: strs){
           char[] chars = s.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           words.putIfAbsent(key, new ArrayList<>());
           words.get(key).add(s);
        
        }
        return new ArrayList<>(words.values());
    }
}
