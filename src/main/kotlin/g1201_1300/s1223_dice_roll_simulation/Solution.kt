package g1201_1300.s1223_dice_roll_simulation

// #Hard #Array #Dynamic_Programming
class Solution {
    fun dieSimulator(n: Int, rollMax: IntArray): Int {
        val all = Array(6) { LongArray(15 + 1) }
        val countsBySide = LongArray(6)
        var total: Long = 0
        var newTotal: Long
        var max: Int
        for (j in all.indices) {
            all[j][1] = 1
            countsBySide[j] = 1
            total = 6
        }
        for (i in 1 until n) {
            newTotal = total
            for (j in all.indices) {
                all[j][0] = (total - countsBySide[j]) % MOD
                max = rollMax[j]
                newTotal = newTotal - all[j][max] + all[j][0]
                countsBySide[j] = (total - all[j][max]) % MOD
                System.arraycopy(all[j], 0, all[j], 1, max)
            }
            total = newTotal
        }
        return (total % MOD).toInt()
    }

    companion object {
        private const val MOD: Long = 1000000007
    }
}
