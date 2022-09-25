package g0001_0100.s0085_maximal_rectangle

// #Hard #Array #Dynamic_Programming #Matrix #Stack #Monotonic_Stack
// #2022_09_25_Time_463_ms_(55.17%)_Space_58.5_MB_(62.07%)

class Solution {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        /*
         * idea: using [LC84 Largest Rectangle in Histogram]. For each row of the matrix, construct
         * the histogram based on the current row and the previous histogram (up to the previous
         * row), then compute the largest rectangle area using LC84.
         */
        val m = matrix.size
        var n = 0
        if (m == 0 || matrix[0].size.also { n = it } == 0) {
            return 0
        }
        var i: Int
        var j: Int
        var res = 0
        val heights = IntArray(n)
        i = 0
        while (i < m) {
            j = 0
            while (j < n) {
                if (matrix[i][j] == '0') {
                    heights[j] = 0
                } else {
                    heights[j] += 1
                }
                j++
            }
            res = Math.max(res, largestRectangleArea(heights))
            i++
        }
        return res
    }

    private fun largestRectangleArea(heights: IntArray): Int {
        /*
         * idea: scan and store if a[i-1]<=a[i] (increasing), then as long as a[i]<a[i-1], then we
         * can compute the largest rectangle area with base a[j], for j<=i-1, and a[j]>a[i], which
         * is a[j]*(i-j). And meanwhile, all these bars (a[j]'s) are already done, and thus are
         * throwable (using pop() with a stack).
         *
         * <p>We can use an array nLeftGeq[] of size n to simulate a stack. nLeftGeq[i] = the number
         * of elements to the left of [i] having value greater than or equal to a[i] (including a[i]
         * itself). It is also the index difference between [i] and the next index on the top of the
         * stack.
         */
        val n = heights.size
        if (n == 0) {
            return 0
        }
        val nLeftGeq = IntArray(n)
        // the number of elements to the left
        // of [i] with value >= heights[i]
        nLeftGeq[0] = 1
        // preIdx=the index of stack.peek(), res=max area so far
        var preIdx = 0
        var res = 0
        for (i in 1 until n) {
            nLeftGeq[i] = 1
            // notice that preIdx = i - 1 = peek()
            while (preIdx >= 0 && heights[i] < heights[preIdx]) {
                res = Math.max(res, heights[preIdx] * (nLeftGeq[preIdx] + i - preIdx - 1))
                // pop()
                nLeftGeq[i] += nLeftGeq[preIdx]
                // peek() current top
                preIdx = preIdx - nLeftGeq[preIdx]
            }
            if (preIdx >= 0 && heights[i] == heights[preIdx]) {
                // pop()
                nLeftGeq[i] += nLeftGeq[preIdx]
            }
            // otherwise nothing to do
            preIdx = i
        }
        // compute the rest largest rectangle areas with (indices of) bases
        // on stack
        while (preIdx >= 0 && 0 < heights[preIdx]) {
            res = Math.max(res, heights[preIdx] * (nLeftGeq[preIdx] + n - preIdx - 1))
            // peek() current top
            preIdx = preIdx - nLeftGeq[preIdx]
        }
        return res
    }
}
