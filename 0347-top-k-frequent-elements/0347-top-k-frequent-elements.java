class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int index = -1;
            for (int j = 0; j < list.size(); j++) {
                int key = list.get(j);
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    index = j;
                }
            }
            ans[i] = list.get(index);
            map.remove(list.get(index));
            list.remove(index);
        }
        return ans;
    }
}