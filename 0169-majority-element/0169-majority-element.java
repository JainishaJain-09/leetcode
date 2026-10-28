class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        } 
        for(int key:map.keySet()){
            int value=map.get(key);
            if(value>n/2)
            return key;

        }
        return -1;
    }
}