// class Solution {
//     public int beautySum(String s) {
//         int count=0;
//         for (int i=0;i<s.length();i++) {
//             HashMap<Character, Integer> map = new HashMap<>();
//             for(int j=i;j<s.length();j++) {
//                 char ch=s.charAt(j);
//                 if(map.containsKey(ch)) {
//                     map.put(ch,map.get(ch)+1);
//                 } 
//                 else {
//                     map.put(ch,1);
//                 }
//                 int max=Integer.MIN_VALUE;
//                 int min=Integer.MAX_VALUE;
//                 for(int val:map.values()) {
//                     if(val>max) {
//                         max=val;
//                     }
//                     if(val<min) {
//                         min=val;
//                     }
//                 }
//                 count=count+(max-min);
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        if (freq[k] > max) {
                            max = freq[k];
                        }
                        if (freq[k] < min) {
                            min = freq[k];
                        }
                    }
                }
                ans += (max - min);
            }
        }

        return ans;
    }
}