package g3401_3500.s3457_eat_pizzas

// #Medium #Array #Sorting #Greedy #2025_02_18_Time_101_ms_(90.91%)_Space_91.06_MB_(63.64%)

class Solution {
    fun maxWeight(pizzas: IntArray): Long {
        val n = pizzas.size
        val m = n / 4
        val z = (m + 1) / 2
        val y = m / 2
        var j = 0
        pizzas.sort()
        var res: Long = 0
        for (i in 0..<z) {
            res += pizzas[n - 1 - j].toLong()
            j += 1
        }
        for (i in 0..<y) {
            res += pizzas[n - 1 - j - 1].toLong()
            j += 2
        }
        return res
    }
}
