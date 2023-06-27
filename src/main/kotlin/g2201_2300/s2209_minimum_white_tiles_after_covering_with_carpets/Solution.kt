package g2201_2300.s2209_minimum_white_tiles_after_covering_with_carpets

// #Hard #String #Dynamic_Programming #Prefix_Sum
// #2023_06_27_Time_373_ms_(100.00%)_Space_40_MB_(100.00%)

class Solution {
    fun minimumWhiteTiles(floor: String, numCarpets: Int, carpetLen: Int): Int {
        val len = floor.length
        val dp = Array(numCarpets + 1) { IntArray(len + 1) }
        val prefix = IntArray(len)
        var tiles = 0
        var total = 0
        for (i in 0 until len) {
            // calculate total no of Tiles within the Carpet Length Window
            tiles += floor[i].code - '0'.code
            // start excluding tiles which are not in the Range anymore of the Carpet Length given
            if (i - carpetLen >= 0) {
                tiles -= floor[i - carpetLen].code - '0'.code
            }
            // the total no of tiles covered within the Carpet Length range for current index
            prefix[i] = tiles
            total += floor[i].code - '0'.code
        }
        for (i in 1..numCarpets) {
            for (j in 0 until len) {
                // if we do not wish to cover current Tile
                val doNot = dp[i][j]
                // if we do wish to cover current tile
                val doTake = dp[i - 1][Math.max(0, j - carpetLen + 1)] + prefix[j]
                // we should go back the Carpet length & check for tiles not covered before j -
                // carpet Length distance
                dp[i][j + 1] = Math.max(doTake, doNot)
            }
        }
        return total - dp[numCarpets][len]
    }
}
