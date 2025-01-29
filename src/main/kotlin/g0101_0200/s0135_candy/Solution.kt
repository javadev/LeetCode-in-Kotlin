package g0101_0200.s0135_candy

// #Hard #Array #Greedy #Top_Interview_150_Array/String
// #2022_10_09_Time_466_ms_(58.33%)_Space_51.2_MB_(83.33%)

class Solution {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size)
        candies.fill(1)
        for (i in 0 until ratings.size - 1) {
            if (ratings[i + 1] > ratings[i]) {
                candies[i + 1] = candies[i] + 1
            }
        }
        for (i in ratings.size - 1 downTo 1) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] < candies[i] + 1) {
                candies[i - 1] = candies[i] + 1
            }
        }
        var total = 0
        for (candy in candies) {
            total += candy
        }
        return total
    }
}
