package g2401_2500.s2405_optimal_partition_of_string

// #Medium #String #Hash_Table #Greedy #2023_07_03_Time_185_ms_(100.00%)_Space_38_MB_(70.00%)

class Solution {
    fun partitionString(s: String): Int {
        var count = 1
        var arr = BooleanArray(26)
        for (c in s.toCharArray()) {
            if (arr[c.code - 'a'.code]) {
                count++
                arr = BooleanArray(26)
            }
            arr[c.code - 'a'.code] = true
        }
        return count
    }
}
