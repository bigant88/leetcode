package datastructure

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