package g0801_0900.s0822_card_flipping_game

// #Medium #Array #Hash_Table #2023_03_25_Time_186_ms_(100.00%)_Space_41.2_MB_(33.33%)

class Solution {
    fun flipgame(fronts: IntArray, backs: IntArray): Int {
        val max = findMax(fronts, backs)
        var value = 10000
        val twinCardHash = IntArray(max + 1)
        val existingNumbersHash = IntArray(max + 1)
        for (i in fronts.indices) {
            if (fronts[i] == backs[i]) {
                twinCardHash[fronts[i]]++
            }
            existingNumbersHash[fronts[i]]++
            existingNumbersHash[backs[i]]++
        }
        for (i in 1..max) {
            if (twinCardHash[i] == 0 && i < value && existingNumbersHash[i] != 0) {
                value = i
                break
            }
        }
        return if (value == 10000) {
            0
        } else {
            value
        }
    }

    companion object {
        private fun findMax(fronts: IntArray, backs: IntArray): Int {
            var max = 0
            for (front in fronts) {
                if (max < front) {
                    max = front
                }
            }
            for (back in backs) {
                if (max < back) {
                    max = back
                }
            }
            return max
        }
    }
}
