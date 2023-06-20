package g1901_2000.s1964_find_the_longest_valid_obstacle_course_at_each_position

// #Hard #Array #Binary_Search #Binary_Indexed_Tree
@Suppress("NAME_SHADOWING")
class Solution {
    fun longestObstacleCourseAtEachPosition(obstacles: IntArray): IntArray {
        return longestIncreasingSubsequence(obstacles)
    }

    private fun longestIncreasingSubsequence(obstacles: IntArray): IntArray {
        var len = 1
        val length = obstacles.size
        val ans = IntArray(length)
        val arr = IntArray(length)
        arr[0] = obstacles[0]
        ans[0] = 1
        for (i in 1 until length) {
            val `val` = obstacles[i]
            if (`val` >= arr[len - 1]) {
                arr[len++] = `val`
                ans[i] = len
            } else {
                val idx = binarySearch(arr, 0, len - 1, `val`)
                arr[idx] = `val`
                ans[i] = idx + 1
            }
        }
        return ans
    }

    private fun binarySearch(arr: IntArray, lo: Int, hi: Int, `val`: Int): Int {
        var lo = lo
        var hi = hi
        var ans = -1
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            if (`val` >= arr[mid]) {
                lo = mid + 1
            } else {
                ans = mid
                hi = mid - 1
            }
        }
        return ans
    }
}
