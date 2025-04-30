package com.Array;

//268. Missing Number
class MissingNum{
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }

        int naturalSum=0;
        for(int i=0;i<=n;i++)
        {
            naturalSum+=i;
        }
        return naturalSum-sum;
    }
}