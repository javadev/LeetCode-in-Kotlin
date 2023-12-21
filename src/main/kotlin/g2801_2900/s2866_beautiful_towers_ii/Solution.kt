package g2801_2900.s2866_beautiful_towers_ii

// #Medium #Array #Stack #Monotonic_Stack #2023_12_21_Time_676_ms_(85.71%)_Space_70.9_MB_(71.43%)

import java.util.Deque
import java.util.LinkedList
import kotlin.math.max

class Solution {
    fun maximumSumOfHeights(mH: List<Int>): Long {
        val n = mH.size
        val st: Deque<Int> = LinkedList()
        val prevSmaller = IntArray(n + 1)
        for (i in 0 until n) {
            while (!st.isEmpty() && mH[st.peek()] >= mH[i]) {
                st.pop()
            }
            if (st.isEmpty()) {
                prevSmaller[i] = -1
            } else {
                prevSmaller[i] = st.peek()
            }
            st.push(i)
        }
        st.clear()
        val nextSmaller = IntArray(n + 1)
        for (i in n - 1 downTo 0) {
            while (!st.isEmpty() && mH[st.peek()] >= mH[i]) {
                st.pop()
            }
            if (st.isEmpty()) {
                nextSmaller[i] = n
            } else {
                nextSmaller[i] = st.peek()
            }
            st.push(i)
        }
        val leftSum = LongArray(n)
        leftSum[0] = mH[0].toLong()
        for (i in 1 until n) {
            val prevSmallerIdx = prevSmaller[i]
            val equalCount = i - prevSmallerIdx
            leftSum[i] = (equalCount.toLong() * mH[i])
            if (prevSmallerIdx != -1) {
                leftSum[i] += leftSum[prevSmallerIdx]
            }
        }
        val rightSum = LongArray(n)
        rightSum[n - 1] = mH[n - 1].toLong()
        for (i in n - 2 downTo 0) {
            val nextSmallerIdx = nextSmaller[i]
            val equalCount = nextSmallerIdx - i
            rightSum[i] = (equalCount.toLong() * mH[i])
            if (nextSmallerIdx != n) {
                rightSum[i] += rightSum[nextSmallerIdx]
            }
        }
        var ans: Long = 0
        for (i in 0 until n) {
            val totalSum = leftSum[i] + rightSum[i] - mH[i]
            ans = max(ans, totalSum)
        }
        return ans
    }
}
