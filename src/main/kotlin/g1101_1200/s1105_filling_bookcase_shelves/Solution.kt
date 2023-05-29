package g1101_1200.s1105_filling_bookcase_shelves

// #Medium #Array #Dynamic_Programming

class Solution {
    fun minHeightShelves(books: Array<IntArray>, shelfWidth: Int): Int {
        val n = books.size
        val dp = IntArray(n + 1)
        dp.fill(Int.MAX_VALUE)
        dp[0] = 0
        for (i in 1..n) {
            var widthLeft = shelfWidth
            var maxH = 0
            for (j in i - 1 downTo 0) {
                widthLeft -= books[j][0]
                maxH = Math.max(maxH, books[j][1])
                if (widthLeft >= 0) {
                    dp[i] = Math.min(dp[i], maxH + dp[j])
                }
            }
        }
        return dp[n]
    }
}