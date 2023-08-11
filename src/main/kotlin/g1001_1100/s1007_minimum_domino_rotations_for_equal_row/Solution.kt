package g1001_1100.s1007_minimum_domino_rotations_for_equal_row

// #Medium #Array #Greedy #Udemy_Arrays #2023_05_15_Time_421_ms_(50.00%)_Space_100.4_MB_(50.00%)

class Solution {
    fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
        val top = tops[0]
        var tCount = 0
        var bCount = 0
        val tSwaps: Int
        val bSwaps: Int
        var swaps = 0
        var valid = true
        for (i in tops.indices) {
            if (tops[i] == top) {
                tCount++
            }
            if (bottoms[i] == top) {
                bCount++
            }
            if (tops[i] != top && bottoms[i] != top) {
                valid = false
                swaps = -1
                break
            }
        }
        if (valid) {
            tSwaps = tops.size - tCount
            bSwaps = bottoms.size - bCount
            swaps = Math.min(tSwaps, bSwaps)
        }
        val bottom = bottoms[0]
        var tCount1 = 0
        var bCount1 = 0
        val tSwaps1: Int
        val bSwaps1: Int
        var swaps1 = 0
        var valid1 = true
        for (i in bottoms.indices) {
            if (tops[i] == bottom) {
                tCount1++
            }
            if (bottoms[i] == bottom) {
                bCount1++
            }
            if (tops[i] != bottom && bottoms[i] != bottom) {
                valid1 = false
                swaps1 = -1
                break
            }
        }
        if (valid1) {
            tSwaps1 = tops.size - tCount1
            bSwaps1 = bottoms.size - bCount1
            swaps1 = Math.min(tSwaps1, bSwaps1)
        }
        val ans = IntArray(2)
        if (swaps1 < swaps) {
            ans[0] = swaps1
            ans[1] = swaps
        } else {
            ans[0] = swaps
            ans[1] = swaps1
        }
        return if (ans[0] != -1) {
            ans[0]
        } else {
            ans[1]
        }
    }
}
