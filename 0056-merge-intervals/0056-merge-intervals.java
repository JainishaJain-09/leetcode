class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> mer=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);

            }
            else{
                mer.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        mer.add(new int[]{start,end});
        return mer.toArray(new int[mer.size()][]);
    }
}