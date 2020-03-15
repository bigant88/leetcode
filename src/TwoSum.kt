
import java.util.HashMap

class TwoSum {

    /**
    One-pass Hash Table
    It turns out we can do it in one-pass. While we iterate and inserting elements into the table,
    we also look back to check if current element's complement already exists in the table.
    If it exists, we have found a solution and return immediately.
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
    return new int[] { map.get(complement), i };
    }
    map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in 0 until nums.size){
            val complement = target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")

    }
    /*
        Runtime: 184 ms, faster than 75.39% of Kotlin online submissions for Two Sum.
        Memory Usage: 37.4 MB, less than 81.82% of Kotlin online submissions for Two Sum.
     */
}
