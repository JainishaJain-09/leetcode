class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char org = s.charAt(i);
            if (map.containsKey(org)) {
                map.put(org, map.get(org) + 1);
            } else {
                map.put(org, 1);
            }
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        while (!list.isEmpty()) {
            int maxFreq = -1;
            int index = -1;
            for (int j = 0; j < list.size(); j++) {
                char key = list.get(j);
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    index = j;
                }
            }
            char ch = list.get(index);
            for (int i = 0; i < maxFreq; i++) {
                sb.append(ch);
            }
            map.remove(ch);
            list.remove(index);
        }
        return sb.toString();
    }
}