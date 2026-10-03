class Solution {
    public int majorityElement(int[] nums) {
        int majarity=1;
        int ele = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) > majarity) {
                ele = i;
                majarity=map.get(i);
            }
        }
        return ele;
    }
}