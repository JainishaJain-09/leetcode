class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int s = 0,
        e = n - 1,
        mid,
        first = -1,
        last = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                first = mid; 
                e = mid - 1;
            }
            else if (nums[mid] < target){
                s = mid + 1;
            }
            else{
                 e = mid - 1;
            }
        }
        
        s = 0, e = n - 1;
        
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                last = mid;
                s = mid + 1;
            }
            else if(nums[mid] < target) {
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }

        return {first, last};
    }
};
