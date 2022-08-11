## Problem

https://leetcode.com/problems/two-sum/


## Problem Description

```
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
```

## Solution

- Use hash map to instantly check for difference value, map will add index of last occurrence of a num, don’t use same element twice;


## Key Points



## Code

- Support Language: Kotlin

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in nums.indices){
            val complement = target - nums[i]
            if (map.containsKey(complement)) return intArrayOf(i, map[complement]!!)
            map[nums[i]] = i
        }
        return intArrayOf(-1,-1)
    }
}
```

**_Complexity Anlysis_**

- _Time Complexity_: O(N)
- _Space Complexity_：O(N)

