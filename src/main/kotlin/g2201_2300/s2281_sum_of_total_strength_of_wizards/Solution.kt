package g2201_2300.s2281_sum_of_total_strength_of_wizards

// #Hard #Array #Stack #Prefix_Sum #Monotonic_Stack
// #2023_06_28_Time_673_ms_(100.00%)_Space_58.2_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList

@Suppress("kotlin:S107")
class Solution {
    fun totalStrength(nums: IntArray): Int {
        val n = nums.size
        val forward = LongArray(n)
        val backward = LongArray(n)
        val prefix = LongArray(n + 1)
        val suffix = LongArray(n + 1)
        prefix[1] = nums[0].toLong()
        forward[0] = prefix[1]
        suffix[n - 1] = nums[n - 1].toLong()
        backward[n - 1] = suffix[n - 1]
        for (i in 1 until n) {
            forward[i] = nums[i] + forward[i - 1]
            prefix[i + 1] = prefix[i] + forward[i]
        }
        run {
            var i = n - 2
            while (0 <= i) {
                backward[i] = nums[i] + backward[i + 1]
                suffix[i] = suffix[i + 1] + backward[i]
                --i
            }
        }
        var res: Long = 0
        val dq: Deque<Int> = LinkedList()
        for (i in 0 until n) {
            while (dq.isNotEmpty() && nums[dq.peekLast()] >= nums[i]) {
                val cur = dq.pollLast()
                val prev = if (dq.isEmpty()) -1 else dq.peekLast()
                res = (
                    (
                        res +
                            getSum(
                                nums, forward, prefix, backward, suffix,
                                prev, cur, i,
                            ) *
                            nums[cur]
                        ) %
                        mod
                    )
            }
            dq.add(i)
        }
        while (dq.isNotEmpty()) {
            val cur = dq.pollLast()
            val prev = if (dq.isEmpty()) -1 else dq.peekLast()
            res = (
                (
                    res +
                        getSum(nums, forward, prefix, backward, suffix, prev, cur, n) *
                        nums[cur]
                    ) %
                    mod
                )
        }
        return res.toInt()
    }

    private fun getSum(
        nums: IntArray,
        forward: LongArray,
        prefix: LongArray,
        backward: LongArray,
        suffix: LongArray,
        prev: Int,
        cur: Int,
        next: Int,
    ): Long {
        val sum = (cur - prev) * nums[cur].toLong() % mod * (next - cur) % mod
        val preSum = getPresum(backward, suffix, prev + 1, cur - 1, next - cur)
        val postSum = getPostsum(forward, prefix, cur + 1, next - 1, cur - prev)
        return (sum + preSum + postSum) % mod
    }

    private fun getPresum(backward: LongArray, suffix: LongArray, from: Int, to: Int, m: Int): Long {
        val n = backward.size
        val cnt = to - from + 1L
        return (
            (suffix[from] - suffix[to + 1] - cnt * (if (to + 1 == n) 0 else backward[to + 1]) % mod) %
                mod
                * m %
                mod
            )
    }

    private fun getPostsum(forward: LongArray, prefix: LongArray, from: Int, to: Int, m: Int): Long {
        val cnt = to - from + 1L
        return (
            (prefix[to + 1] - prefix[from] - cnt * (if (0 == from) 0 else forward[from - 1]) % mod) %
                mod
                * m %
                mod
            )
    }

    companion object {
        private const val mod = 1e9.toInt() + 7
    }
}
