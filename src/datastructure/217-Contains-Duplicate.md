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
1.Time complexity: O(N^2), memory: O(1)
  The naive approach would be to run a iteration for each element and see whether a duplicate value can be found:
   this results in O(N^2) time complexity.

------

```
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
```

------

Time complexity: O(N), memory: O(N)

Finally we can used a well known data structure hash table that will help us to identify whether an element has been previously encountered in the array.

------

```
public boolean containsDuplicate(int[] nums) {

    final Set<Integer> distinct = new HashSet<Integer>();
    for(int num : nums) {
        if(distinct.contains(num)) {
            return true;
        }
        distinct.add(num);
    }
    return false;
}
```

------

This is trivial but quite nice example of space-time tradeoff.

## Key Points



## Code

- Support Language: Java

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for(int i : nums)
        if(!set.add(i))// if there is same
        return true; 
    return false;
    }
}
```

**_Complexity Anlysis_**

- _Time Complexity_: O(N)
- _Space Complexity_：O(N)

