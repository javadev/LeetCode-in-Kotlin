package g3901_4000.s3957_maximum_sum_of_m_non_overlapping_subarrays_ii

// #Hard #Array #Dynamic_Programming #Binary_Search #Prefix_Sum #Sliding_Window #Queue
// #Monotonic_Queue #Principal #Weekly_Contest_505
// #2026_10_20_Time_98_ms_(93.55%)_Space_104.56_MB_(90.32%)

class Solution {
    private lateinit var pre: LongArray
    private lateinit var `val`: LongArray
    private lateinit var cnt: IntArray
    private lateinit var dq: IntArray
    private var n = 0
    private var l = 0
    private var r = 0

    fun maximumSum(nums: IntArray, m: Int, l: Int, r: Int): Long {
        n = nums.size
        this.l = l
        this.r = r
        pre = LongArray(n + 1)
        for (i in 0..<n) {
            pre[i + 1] = pre[i] + nums[i]
        }
        `val` = LongArray(n + 1)
        cnt = IntArray(n + 1)
        dq = IntArray(n + 2)
        var lo: Long = 0
        var hi = 20000000000L
        var ansLambda = hi
        solve(0)
        if (cnt[n] <= m) {
            return `val`[n]
        }
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            solve(mid)
            if (cnt[n] <= m) {
                ansLambda = mid
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        solve(ansLambda)
        return `val`[n] + ansLambda * m
    }

    private fun solve(lambda: Long) {
        val neg = Long.MIN_VALUE / 4
        `val`[0] = neg
        cnt[0] = 0
        var head = 0
        var tail = 0
        for (i in 1..n) {
            val j = i - l
            if (j >= 0) {
                tail = addCandidate(j, head, tail)
            }
            head = removeExpiredCandidates(head, tail, i - r)
            var bestV = `val`[i - 1]
            var bestC = cnt[i - 1]
            if (tail > head) {
                val b = dq[head]
                val cand = normalizedValue(b) - pre[b] + pre[i] - lambda
                val candC = normalizedCount(b) + 1
                if (isBetter(cand, candC, bestV, bestC)) {
                    bestV = cand
                    bestC = candC
                }
            }
            `val`[i] = bestV
            cnt[i] = bestC
        }
    }

    private fun addCandidate(j: Int, head: Int, tail: Int): Int {
        var tail = tail
        val key = normalizedValue(j) - pre[j]
        val candidateCount = normalizedCount(j)
        while (tail > head) {
            val t = dq[tail - 1]
            val tailKey = normalizedValue(t) - pre[t]
            val tailCount = normalizedCount(t)
            if (tailKey < key || (tailKey == key && tailCount >= candidateCount)) {
                tail--
            } else {
                break
            }
        }
        dq[tail++] = j
        return tail
    }

    private fun removeExpiredCandidates(head: Int, tail: Int, minIndex: Int): Int {
        var head = head
        while (tail > head && dq[head] < minIndex) {
            head++
        }
        return head
    }

    private fun normalizedValue(index: Int): Long = if (`val`[index] > 0) `val`[index] else 0

    private fun normalizedCount(index: Int): Int = if (`val`[index] > 0) cnt[index] else 0

    private fun isBetter(candidateValue: Long, candidateCount: Int, bestValue: Long, bestCount: Int): Boolean =
        candidateValue > bestValue ||
            (candidateValue == bestValue && candidateCount < bestCount)
}
