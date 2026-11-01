package g3901_4000.s3911_k_th_smallest_remaining_even_integer_in_subarray_queries

// #Hard #Array #Binary_Search #Senior_Staff #Biweekly_Contest_181
// #2026_09_17_Time_5_ms_(100.00%)_Space_215.84_MB_(25.00%)

class Solution {
    fun kthRemainingInteger(nums: IntArray, queries: Array<IntArray>): IntArray {
        val n = nums.size
        val ans = IntArray(queries.size)
        val prefix = IntArray(n + 1)
        for (i in 1..n) {
            prefix[i] = prefix[i - 1] + (if (nums[i - 1] % 2 == 0) 1 else 0)
        }
        for (q in queries.indices) {
            val l = queries[q][0]
            val r = queries[q][1]
            val k = queries[q][2]
            val lowerCnt = (nums[l] - 1) / 2
            val upperCnt = nums[r] / 2
            val remove = prefix[r + 1] - prefix[l]
            // first segment
            if (lowerCnt >= k) {
                ans[q] = 2 * k
                continue
            }
            // third segment
            if (upperCnt - remove < k) {
                ans[q] = 2 * (k + remove)
            } else {
                // middle segment
                var s = l
                var e = r
                while (s <= e) {
                    val m = s + (e - s) / 2
                    val u = nums[m] / 2
                    val rem = prefix[m + 1] - prefix[l]
                    if (u - rem < k) {
                        s = m + 1
                    } else {
                        e = m - 1
                    }
                }
                ans[q] = 2 * (k + (prefix[s] - prefix[l]))
            }
        }
        return ans
    }
}
