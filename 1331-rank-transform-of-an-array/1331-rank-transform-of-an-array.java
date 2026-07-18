class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int count=1;
        int[] arr1=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int nums=arr1[i];
            if(!map.containsKey(nums)){
                map.put(nums,count);
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;

    }
}