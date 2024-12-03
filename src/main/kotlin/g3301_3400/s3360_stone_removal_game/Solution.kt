package g3301_3400.s3360_stone_removal_game

// #Easy #Math #Simulation #2024_11_24_Time_0_ms_(100.00%)_Space_33.5_MB_(100.00%)

class Solution {
    fun canAliceWin(n: Int): Boolean {
        if (n < 10) {
            return false
        }
        var stonesRemaining = n - 10
        var stonesToBeRemoved = 9
        var i = 1
        while (stonesRemaining >= stonesToBeRemoved) {
            stonesRemaining -= stonesToBeRemoved
            i++
            stonesToBeRemoved--
        }
        return i % 2 != 0
    }
}
