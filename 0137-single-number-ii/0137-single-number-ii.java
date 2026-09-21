class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int i:map.keySet()) {
            if(map.get(i)==1) {
                return i;
            }
        }
        return -1;
    }
}