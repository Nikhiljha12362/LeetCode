class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int n=nums.size();
        int l=0;
        int h=0;
        int s=0;
        while(h<k) {
            s=s+nums[h];
            h++;
        }
        int maxS=s;
        while(h<n) {
            s=s+nums[h];
            s=s-nums[l];
            h++;
            l++;
            maxS=max(maxS,s);
        }

        return (double) maxS/k;
    }
};