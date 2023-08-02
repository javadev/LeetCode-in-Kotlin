package g1701_1800.s1744_can_you_eat_your_favorite_candy_on_your_favorite_day

// #Medium #Array #Prefix_Sum #2023_06_16_Time_809_ms_(100.00%)_Space_94.7_MB_(100.00%)

class Solution {
    fun canEat(candiesCount: IntArray, queries: Array<IntArray>): BooleanArray {
        val result = BooleanArray(queries.size)
        val candiesComm = LongArray(candiesCount.size + 1)
        for (i in 1..candiesCount.size) {
            candiesComm[i] = candiesComm[i - 1] + candiesCount[i - 1]
        }
        for (i in queries.indices) {
            val type: Int = queries[i][0]
            val day: Long = queries[i][1].toLong()
            val cap: Long = queries[i][2].toLong()
            result[i] = ((day + 1) * cap > candiesComm[type]) && day < candiesComm[type + 1]
        }
        return result
    }
}
