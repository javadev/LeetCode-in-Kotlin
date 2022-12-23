package g0401_0500.s0441_arranging_coins

// #Easy #Math #Binary_Search #Binary_Search_I_Day_6
// #2022_12_23_Time_150_ms_(84.21%)_Space_33.4_MB_(100.00%)

class Solution {
    fun arrangeCoins(n: Int): Int {
        var i = 1
        var x = n
        while (x > 0) {
            x -= ++i
        }
        return i - 1
    }
}
