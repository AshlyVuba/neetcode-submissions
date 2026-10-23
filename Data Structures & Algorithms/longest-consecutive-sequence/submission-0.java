class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int currentStreak = 1;
        int maxLength = 1;

        for(int i = 0; i < sorted.length - 1; i++){
            if(sorted[i] == sorted[i + 1]){
                continue;
            }
            if(sorted[i + 1] == sorted[i] + 1){
                currentStreak++;

            }
            else{
                maxLength = Math.max(currentStreak, maxLength);
                currentStreak = 1;
            }
        }
        return Math.max(currentStreak, maxLength);
        
    }
}
