package g1101_1200.s1200_minimum_absolute_difference

// #Easy #Array #Sorting #2023_05_25_Time_507_ms_(75.00%)_Space_87.9_MB_(20.00%)

class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        var min = 10000000
        arr.sort()
        var i = 0
        while (i + 1 < arr.size) {
            val diff = arr[i + 1] - arr[i]
            if (diff <= min) {
                if (diff < min) {
                    min = diff
                    result.clear()
                }
                result.add(listOf(arr[i], arr[i + 1]))
            }
            i++
        }
        return result
    }
}
