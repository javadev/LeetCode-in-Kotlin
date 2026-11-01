package g3801_3900.s3811_number_of_alternating_xor_partitions

// #Medium #Array #Hash_Table #Dynamic_Programming #Bit_Manipulation #Staff #Biweekly_Contest_174
// #2026_06_09_Time_5_ms_(100.00%)_Space_93.31_MB_(44.19%)

class Solution {
    fun alternatingXOR(nums: IntArray, target1: Int, target2: Int): Int {
        var t1 = 0
        var t2 = 0
        var t3 = 0
        var t4 = 0
        val combXor = target1 xor target2
        var runningXor = 0
        var ans: Int
        val n = nums.size
        for (i in 0..<n) {
            val num = nums[i]
            runningXor = runningXor xor num
            ans = 0
            if (runningXor == target1) {
                ans = t4 + 1
            }
            if (runningXor == combXor) {
                ans += t1
            }
            if (runningXor == target2) {
                ans += t2
            }
            if (runningXor == 0) {
                ans += t3
            }
            var ct1 = t1
            var ct2 = t2
            var ct3 = t3
            var ct4 = t4
            if (runningXor == target1) {
                ct1 += t4 + 1
                ct1 %= MOD
            }
            if (runningXor == combXor) {
                ct2 += t1
                ct2 %= MOD
            }
            if (runningXor == target2) {
                ct3 += t2
                ct3 %= MOD
            }
            if (runningXor == 0) {
                ct4 += t3
                ct4 %= MOD
            }
            t1 = ct1
            t2 = ct2
            t3 = ct3
            t4 = ct4
            if (i == n - 1) {
                return ans % MOD
            }
        }
        return 0
    }

    companion object {
        private val MOD = 1e9.toInt() + 7
    }
}
