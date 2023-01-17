package g0501_0600.s0546_remove_boxes

// #Hard #Array #Dynamic_Programming #Memoization
// #2023_01_17_Time_283_ms_(100.00%)_Space_46.9_MB_(100.00%)

internal class Solution {
    // dp for memoization
    lateinit var dp: Array<Array<IntArray>>
    fun removeBoxes(boxes: IntArray): Int {
        val n = boxes.size
        dp = Array(n + 1) {
            Array(n + 1) {
                IntArray(
                    n + 1
                )
            }
        }
        return get(boxes, 0, boxes.size - 1, 0)
    }

    operator fun get(boxes: IntArray, i: Int, j: Int, streak: Int): Int {
        var i = i
        var streak = streak
        if (i > j) {
            return 0
        }

        // first we traverse till the adjacent values are different
        while (i + 1 <= j && boxes[i] == boxes[i + 1]) {
            i++
            streak++
        }

        // memoization
        if (dp[i][j][streak] > 0) {
            return dp[i][j][streak]
        }

        // we calculate the ans here which is streak (length of similar elements) and move
        // forward to the remaining block through recursion
        var ans = (streak + 1) * (streak + 1) + get(boxes, i + 1, j, 0)
        // also another way we can choose is to choose the inner elements first then the outer similar elements can be combined to get even
        // larger value
        for (k in i + 1..j) {
            // we traverse from k (i has moved from 0 to just before the beginning of different elements) and keep searching for same value as
            // in i. after that the middle elements (between i+1 and k-1) are sent to differnt partition and from k to j(ending) we send the updated streak
            if (boxes[i] == boxes[k]) {
                ans = Math.max(ans, get(boxes, i + 1, k - 1, 0) + get(boxes, k, j, streak + 1))
            }
        }
        // return ans here
        return ans.also { dp[i][j][streak] = it }
    }
}
