package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero

// #Medium #Array #Hash_Table #Greedy #Stack #Monotonic_Stack
// #2025_05_13_Time_11_ms_(100.00%)_Space_77.22_MB_(95.45%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        val mq = IntArray(nums.size)
        var idx = 0
        var res = 0
        for (num in nums) {
            if (num == 0) {
                res += idx
                idx = 0
            } else {
                while (idx > 0 && mq[idx - 1] >= num) {
                    if (mq[idx - 1] > num) {
                        res++
                    }
                    idx--
                }
                mq[idx++] = num
            }
        }
        return res + idx
    }
}
