## Problem

https://leetcode.com/problems/maximum-subarray/

[Array](https://leetcode.com/tag/array) 

[Divide and Conquer](https://leetcode.com/tag/divide-and-conquer)

Kadena Algorithm


## Problem Description

```
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
```

## Solution

​	


## Key Points

pattern: prev subarray cant be negative

dynamic programming: compute max sum for each prefix

## Code

- Support Language: Kotlin

```kotlin
class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var curSum = 0
        for(num in nums){
            if(curSum < 0) curSum = 0
            curSum += num
            maxSum = maxOf(maxSum, curSum)
        }
        return maxSum
    }
}
```

**_Complexity Anlysis_**

- _Time Complexity_: O(N)
- _Space Complexity_：O(1)

