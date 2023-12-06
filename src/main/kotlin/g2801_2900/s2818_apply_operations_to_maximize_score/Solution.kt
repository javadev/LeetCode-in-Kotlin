package g2801_2900.s2818_apply_operations_to_maximize_score

// #Hard #Array #Math #Greedy #Stack #Monotonic_Stack #Number_Theory
// #2023_12_06_Time_727_ms_(100.00%)_Space_57.4_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque
import java.util.PriorityQueue
import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumScore(nums: List<Int?>, k: Int): Int {
        // count strictly using nums.get(i) as the selected num
        var k = k
        val dp = IntArray(nums.size)
        // [val, index]
        val pq = PriorityQueue { o1: IntArray, o2: IntArray ->
            Integer.compare(
                o2[0], o1[0]
            )
        }
        val monoStack: Deque<IntArray> = ArrayDeque()
        dp.fill(1)
        for (i in 0..nums.size) {
            var score = Int.MAX_VALUE
            if (i < nums.size) {
                score = PRIME_SCORES[nums[i]!!]
            }
            // when an element is poped, its right bound is confirmed: (i - left + 1) * (right - i +
            // 1)
            while (!monoStack.isEmpty() && monoStack.peekFirst()[0] < score) {
                val popIndex = monoStack.pollFirst()[1]
                val actualRightIndexOfPopedElement = i - 1
                dp[popIndex] *= actualRightIndexOfPopedElement - popIndex + 1
            }
            // when an element is pushed, its left bound is confirmed: (i - left + 1) * (right - i +
            // 1)
            if (i < nums.size) {
                val peekIndex = if (monoStack.isEmpty()) -1 else monoStack.peekFirst()[1]
                val actualLeftIndexOfCurrentElement = peekIndex + 1
                dp[i] *= i - actualLeftIndexOfCurrentElement + 1
                monoStack.offerFirst(intArrayOf(score, i))
                pq.offer(intArrayOf(nums[i]!!, i))
            }
        }
        var result: Long = 1
        while (k > 0) {
            val pair = pq.poll()
            val `val` = pair[0]
            val index = pair[1]
            val times = min(k.toDouble(), dp[index].toDouble()).toInt()
            val power = pow(`val`.toLong(), times)
            result *= power
            result %= MOD.toLong()
            k -= times
        }
        return result.toInt()
    }

    private fun pow(`val`: Long, times: Int): Long {
        if (times == 1) {
            return `val` % MOD
        }
        val subProblemRes = pow(`val`, times / 2)
        var third = 1L
        if (times % 2 == 1) {
            third = `val`
        }
        return subProblemRes * subProblemRes % MOD * third % MOD
    }

    companion object {
        private const val N = 100000
        private val PRIME_SCORES = computePrimeScores()
        private const val MOD = 1000000000 + 7
        private fun computePrimeScores(): IntArray {
            val primeCnt = IntArray(N + 1)
            for (i in 2..N) {
                if (primeCnt[i] == 0) {
                    var j = i
                    while (j <= N) {
                        primeCnt[j]++
                        j += i
                    }
                }
            }
            return primeCnt
        }
    }
}
