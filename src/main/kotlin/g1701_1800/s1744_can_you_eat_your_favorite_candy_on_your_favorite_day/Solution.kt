package g1701_1800.s1744_can_you_eat_your_favorite_candy_on_your_favorite_day

// #Medium #Array #Prefix_Sum
class Solution {
    fun canEat(candiesCount: IntArray, queries: Array<IntArray>): BooleanArray {
        val result = BooleanArray(queries.size)
        val candiesComm = LongArray(candiesCount.size + 1)
        for (i in 1..candiesCount.size) {
            candiesComm[i] = candiesComm.get(i - 1) + candiesCount.get(i - 1)
        }
        for (i in queries.indices) {
            val type: Int = queries.get(i).get(0)
            val day: Long = queries.get(i).get(1).toLong()
            val cap: Long = queries.get(i).get(2).toLong()
            result[i] = ((day + 1) * cap > candiesComm.get(type)) && day < candiesComm.get(type + 1)
        }
        return result
    }
}
