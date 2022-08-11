## Problem

https://leetcode.com/problems/contains-duplicate/

## Problem Description

```
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
```

## Solution


## Key Points

- Find the difference instead of the sum
- Connect every number with its index through the help of Map
- Less time by more space. Reduce the time complexity from O(N) to O(1)

## Code

- Support Language: Kotlin

```js
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function (nums, target) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    const diff = target - nums[i];
    if (map.has(diff)) {
      return [map.get(diff), i];
    }
    map.set(nums[i], i);
  }
};
```

**_Complexity Anlysis_**

- _Time Complexity_: O(N)
- _Space Complexity_：O(N)
