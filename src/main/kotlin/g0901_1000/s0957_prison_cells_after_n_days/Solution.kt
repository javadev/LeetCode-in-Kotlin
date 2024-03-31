package g0901_1000.s0957_prison_cells_after_n_days

// #Medium #Array #Hash_Table #Math #Bit_Manipulation
// #2023_05_03_Time_172_ms_(100.00%)_Space_36.2_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun prisonAfterNDays(cells: IntArray, n: Int): IntArray {
        var n = n
        if (n == 0) {
            return cells
        }
        var first: IntArray? = null
        var prev = cells
        var period: Int
        var day = 0
        while (n > 0) {
            day++
            n--
            val next = getNextDay(prev)
            if (next.contentEquals(first)) {
                period = day - 1
                n %= period
            }
            if (day == 1) {
                first = next
            }
            prev = next
        }
        return prev
    }

    private fun getNextDay(arr: IntArray): IntArray {
        val ret = IntArray(8)
        for (i in 1..6) {
            if (arr[i - 1] == arr[i + 1]) {
                ret[i] = 1
            }
        }
        return ret
    }
}
