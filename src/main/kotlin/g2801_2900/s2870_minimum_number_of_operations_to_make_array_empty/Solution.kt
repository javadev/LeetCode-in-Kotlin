package g2801_2900.s2870_minimum_number_of_operations_to_make_array_empty

// #Medium #Array #Hash_Table #Greedy #Counting
// #2023_12_21_Time_503_ms_(80.00%)_Space_56.8_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var count = 0
        val map = hashMapOf<Int, Int>()
        for (num in nums) map[num] = map[num]?.plus(1) ?: 1
        for ((_, v) in map) {
            if (v == 1) return -1
            count += (v / 3) + (if (v % 3 == 0) 0 else 1)
        }
        return count
    }
}
