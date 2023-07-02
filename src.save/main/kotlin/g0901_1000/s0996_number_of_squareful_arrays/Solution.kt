package g0901_1000.s0996_number_of_squareful_arrays

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Backtracking #Bitmask
// #2023_05_12_Time_139_ms_(100.00%)_Space_34.5_MB_(100.00%)

import kotlin.math.sqrt

class Solution {
    var count = 0
    fun numSquarefulPerms(nums: IntArray): Int {
        val n = nums.size
        if (n < 2) {
            return count
        }
        backtrack(nums, n, 0)
        return count
    }

    private fun backtrack(nums: IntArray, n: Int, start: Int) {
        if (start == n) {
            count++
        }
        val set: MutableSet<Int> = HashSet()
        for (i in start until n) {
            if (set.contains(nums[i])) {
                continue
            }
            swap(nums, start, i)
            if (start == 0 || isPerfectSq(nums[start], nums[start - 1])) {
                backtrack(nums, n, start + 1)
            }
            swap(nums, start, i)
            set.add(nums[i])
        }
    }

    private fun swap(array: IntArray, a: Int, b: Int) {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
    }

    private fun isPerfectSq(a: Int, b: Int): Boolean {
        val x = a + b
        val sqrt = sqrt(x.toDouble())
        return sqrt - sqrt.toInt() == 0.0
    }
}
