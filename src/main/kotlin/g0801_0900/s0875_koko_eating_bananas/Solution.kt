package g0801_0900.s0875_koko_eating_bananas

// #Medium #Array #Binary_Search #LeetCode_75_Binary_Search #Binary_Search_II_Day_4
// #2023_04_08_Time_267_ms_(93.85%)_Space_37.7_MB_(96.62%)

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var maxP = piles[0]
        var sumP = 0L
        for (pile in piles) {
            maxP = maxP.coerceAtLeast(pile)
            sumP += pile.toLong()
        }
        // binary search
        var low = ((sumP - 1) / h + 1).toInt()
        var high = maxP
        while (low < high) {
            val mid = low + (high - low) / 2
            if (isPossible(piles, mid, h)) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }

    private fun isPossible(piles: IntArray, k: Int, h: Int): Boolean {
        var sum = 0
        for (pile in piles) {
            sum += (pile - 1) / k + 1
        }
        return sum <= h
    }
}
