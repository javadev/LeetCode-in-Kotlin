package g1001_1100.s1015_smallest_integer_divisible_by_k

// #Medium #Hash_Table #Math #2023_05_17_Time_123_ms_(100.00%)_Space_34.3_MB_(50.00%)

class Solution {
    fun smallestRepunitDivByK(k: Int): Int {
        var n = 0
        if (k % 2 == 0 || k % 5 == 0) {
            return -1
        }
        var i = 1
        while (i <= k) {
            n = (n * 10 + 1) % k
            if (n == 0) {
                return i
            }
            i++
        }
        return -1
    }
}
