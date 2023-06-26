package g2201_2300.s2212_maximum_points_in_an_archery_competition

// #Medium #Array #Bit_Manipulation #Recursion #Enumeration
class Solution {
    private val ans = IntArray(12)
    private val ans1 = IntArray(12)
    private var max = 0
    fun maximumBobPoints(numArrows: Int, aliceArrows: IntArray): IntArray {
        solve(numArrows, aliceArrows, 11, 0)
        return ans1
    }

    private fun solve(numArrows: Int, aliceArrows: IntArray, index: Int, sum: Int) {
        if (numArrows <= 0 || index < 0) {
            if (max < sum) {
                max = sum
                ans1[0] = Math.max(ans[0], ans[0] + numArrows)
                System.arraycopy(ans, 1, ans1, 1, 11)
            }
            return
        }
        if (aliceArrows[index] + 1 <= numArrows) {
            ans[index] = aliceArrows[index] + 1
            solve(numArrows - (aliceArrows[index] + 1), aliceArrows, index - 1, sum + index)
            ans[index] = 0
        }
        solve(numArrows, aliceArrows, index - 1, sum)
    }
}
