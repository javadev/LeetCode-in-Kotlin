package g1501_1600.s1562_find_latest_group_of_size_m

// #Medium #Array #Binary_Search #Simulation #Binary_Search_II_Day_19
// #2023_06_14_Time_534_ms_(100.00%)_Space_52_MB_(100.00%)

class Solution {
    fun findLatestStep(arr: IntArray, m: Int): Int {
        val lengthAtIndex = IntArray(arr.size + 2)
        val countOfLength = IntArray(arr.size + 1)
        var res = -1
        var step = 1
        for (i in arr) {
            val leftLength = lengthAtIndex[i - 1]
            val rightLength = lengthAtIndex[i + 1]
            val newLength = leftLength + rightLength + 1
            lengthAtIndex[i] = newLength
            lengthAtIndex[i - leftLength] = newLength
            lengthAtIndex[i + rightLength] = newLength
            countOfLength[newLength] += 1
            countOfLength[leftLength] -= 1
            countOfLength[rightLength] -= 1
            if (countOfLength[m] > 0) {
                res = step
            }
            step++
        }
        return res
    }
}
