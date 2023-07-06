package g2501_2600.s2554_maximum_number_of_integers_to_choose_from_a_range_i

// #Medium #Array #Hash_Table #Sorting #Greedy #Binary_Search
// #2023_07_06_Time_543_ms_(100.00%)_Space_46.4_MB_(100.00%)

class Solution {
    fun maxCount(banned: IntArray, n: Int, maxSum: Int): Int {
        val ban = BooleanArray(20000)
        var count = 0
        var sum = 0
        for (i in banned) ban[i] = true
        for (i in 1..n) {
            if (ban[i]) {
                continue
            } else if (sum + i <= maxSum) {
                sum += i
                count++
            } else {
                break
            }
        }
        return count
    }
}
