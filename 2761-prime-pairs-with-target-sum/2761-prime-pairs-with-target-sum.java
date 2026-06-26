class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = primes.size() - 1;
        while (left <= right) {
            int sum = primes.get(left) + primes.get(right);
            if (sum == n) {
                ans.add(Arrays.asList(primes.get(left), primes.get(right)));
                left++;
                right--;
            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}