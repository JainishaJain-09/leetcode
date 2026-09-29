class Solution {
    public int[] singleNumber(int[] nums) {
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
        int[] arr=new int[2];
        int j=0;
        for(int num:map.keySet()){
            if(map.get(num)==1){
                arr[j]=num;
                j++;
            }
        }
        return arr;
    }
}