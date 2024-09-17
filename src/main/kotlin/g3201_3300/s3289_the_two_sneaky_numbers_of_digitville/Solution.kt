package g3201_3300.s3289_the_two_sneaky_numbers_of_digitville

// #Easy #2024_09_17_Time_223_ms_(68.97%)_Space_37.3_MB_(89.66%)

import java.util.HashMap

class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val countMap: MutableMap<Int, Int> = HashMap<Int, Int>()
        // Populate the HashMap with the frequency of each number
        for (num in nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1)
        }
        // Array to store the result
        val result = IntArray(2)
        var index = 0
        // Find the numbers that appear exactly twice
        for (entry in countMap.entries) {
            if (entry.value == 2) {
                result[index++] = entry.key
                // Break if we have found both sneaky numbers
                if (index == 2) {
                    break
                }
            }
        }
        return result
    }
}
