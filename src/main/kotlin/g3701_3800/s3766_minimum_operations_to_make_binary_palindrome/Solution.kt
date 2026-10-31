package g3701_3800.s3766_minimum_operations_to_make_binary_palindrome

// #Medium #Array #Binary_Search #Two_Pointers #Bit_Manipulation #Staff #Biweekly_Contest_171
// #2026_05_08_Time_54_ms_(82.69%)_Space_47.43_MB_(64.42%)

import kotlin.math.min

class Solution {
    private fun binlen(n: Int): Int {
        var n = n
        var c = 0
        while (n > 0) {
            c++
            n = n shr 1
        }
        return c
    }

    private fun isPal(n: Int): Boolean {
        var l = 0
        var r = binlen(n) - 1
        while (l < r) {
            if (((n shr l) and 1) != ((n shr r) and 1)) {
                return false
            }
            l++
            r--
        }
        return true
    }

    fun minOperations(nums: IntArray): IntArray {
        val binary = BooleanArray(5050)
        val ans = IntArray(nums.size)
        for (i in 0..5049) {
            binary[i] = isPal(i)
        }
        for (i in nums.indices) {
            var a = nums[i]
            var b = nums[i]
            var c1 = 0
            var c2 = 0
            while (!binary[a]) {
                a--
                c1++
            }
            while (!binary[b]) {
                b++
                c2++
            }
            ans[i] = min(c1, c2)
        }
        return ans
    }
}
