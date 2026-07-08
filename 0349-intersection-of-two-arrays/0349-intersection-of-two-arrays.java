class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            int num=nums1[i];
                map.put(num,1);
        }
        for(int j=0;j<m;j++){
            int ch=nums2[j];
            if(!map.containsKey(ch)) continue;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                list.add(ch);
            }


        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
        
    }
}