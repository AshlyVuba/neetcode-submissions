class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n :nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        int[] result = new int[k];

        for(int j = 0; j < k; j++){
            int max = 0;
            for(int v: freq.values()){
                if(v > max){
                    max = v;
                }
            }
            for(int i: freq.keySet()){
                if(freq.get(i) == max){
                    result[k-j-1] = i;
                    freq.remove(i);
                    break;
                
                }
            }
            
            
        }
        return result;


    }
}
