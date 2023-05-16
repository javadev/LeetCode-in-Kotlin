package g1001_1100.s1010_pairs_of_songs_with_total_durations_divisible_by_60

// #Medium #Array #Hash_Table #Counting #2023_05_16_Time_287_ms_(77.78%)_Space_63_MB_(18.52%)

class Solution {
    fun numPairsDivisibleBy60(time: IntArray): Int {
        val remainder = IntArray(60)
        var ans = 0
        for (j in time) {
            val rem = j % 60
            ans += if (rem == 0) {
                remainder[0]
            } else {
                remainder[60 - rem]
            }
            remainder[rem]++
        }
        return ans
    }
}
