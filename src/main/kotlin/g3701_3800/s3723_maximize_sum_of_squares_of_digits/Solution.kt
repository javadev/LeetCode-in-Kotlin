package g3701_3800.s3723_maximize_sum_of_squares_of_digits

// #Medium #Biweekly_Contest_168 #2025_10_28_Time_16_ms_(94.44%)_Space_47.62_MB_(61.11%)

class Solution {
    fun maxSumOfSquares(places: Int, sum: Int): String {
        var ans = ""
        val nines = sum / 9
        if (places < nines) {
            return ans
        } else if (places == nines) {
            val remSum = sum - nines * 9
            if (remSum > 0) {
                return ans
            }
            ans = "9".repeat(nines)
        } else {
            val remSum = sum - nines * 9
            ans = "9".repeat(nines) + remSum
            val extra = places - ans.length
            if (extra > 0) {
                ans = ans + ("0".repeat(extra))
            }
        }
        return ans
    }
}
