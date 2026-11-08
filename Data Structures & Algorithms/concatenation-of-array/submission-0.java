class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<n;i++){
            map.put(i, nums[i]);
            ans[i] = map.get(i);
            ans[i+n] = map.get(i);
        }

        return ans;
        
    }
}