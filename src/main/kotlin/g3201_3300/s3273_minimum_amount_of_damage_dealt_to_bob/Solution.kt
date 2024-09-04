package g3201_3300.s3273_minimum_amount_of_damage_dealt_to_bob

// #Hard #Array #Sorting #Greedy #2024_09_04_Time_793_ms_(90.00%)_Space_67.1_MB_(55.00%)

class Solution {
    fun minDamage(pw: Int, damage: IntArray, health: IntArray): Long {
        var res: Long = 0
        var sum: Long = 0
        for (e in damage) {
            sum += e.toLong()
        }
        val pairs = arrayOfNulls<Pair>(damage.size)
        for (e in damage.indices) {
            pairs[e] = Pair(damage[e], (health[e] + pw - 1) / pw)
        }
        pairs.sort()
        for (pr in pairs) {
            res += pr!!.`val` * sum
            sum -= pr.key.toLong()
        }
        return res
    }

    internal class Pair(var key: Int, var `val`: Int) : Comparable<Pair> {
        override fun compareTo(p: Pair): Int {
            return `val` * p.key - key * p.`val`
        }
    }
}
