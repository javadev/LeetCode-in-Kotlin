package g3301_3400.s3375_minimum_operations_to_make_array_values_equal_to_k

// #Easy #2024_12_08_Time_191_ms_(100.00%)_Space_39.9_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val s: MutableSet<Int?> = HashSet<Int?>()
        for (i in nums) {
            s.add(i)
        }
        var res = 0
        for (i in s) {
            if (i!! > k) {
                res++
            } else if (i < k) {
                return -1
            }
        }
        return res
    }
}
