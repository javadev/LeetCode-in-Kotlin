package g1901_2000.s1901_find_a_peak_element_ii

// #Medium #Array #Binary_Search #Matrix #Divide_and_Conquer #Binary_Search_II_Day_17
class Solution {
    fun findPeakGrid(mat: Array<IntArray>): IntArray {
        val n = mat.size
        val m = mat[0].size
        var l = 0
        var r = m - 1
        var mid: Int
        while (l <= r) {
            mid = (l + r) / 2
            var mx = mat[0][mid]
            var mxi = 0
            for (i in 1 until n) {
                if (mx < mat[i][mid]) {
                    mx = mat[i][mid]
                    mxi = i
                }
            }
            val lv = if (mid > l) mat[mxi][mid - 1] else -1
            val rv = if (mid < r) mat[mxi][mid + 1] else -1
            if (mx > lv && mx > rv) {
                return intArrayOf(mxi, mid)
            } else if (mx > lv) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return intArrayOf(-1, -1)
    }
}
