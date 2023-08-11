package g0801_0900.s0888_fair_candy_swap

// #Easy #Array #Hash_Table #Sorting #Binary_Search
// #2023_04_09_Time_318_ms_(100.00%)_Space_39_MB_(100.00%)

class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        var aSum = 0
        var bSum = 0
        val ans = IntArray(2)
        for (bar in aliceSizes) {
            aSum += bar
        }
        for (bar in bobSizes) {
            bSum += bar
        }
        val diff: Int = aSum - bSum
        val set: HashSet<Int> = HashSet()
        for (bar in aliceSizes) {
            set.add(bar)
        }
        for (bar in bobSizes) {
            if (set.contains(bar + diff / 2)) {
                ans[0] = bar + diff / 2
                ans[1] = bar
                break
            }
        }
        return ans
    }
}
