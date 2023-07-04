package g2501_2600.s2522_partition_string_into_substrings_with_values_at_most_k

// #Medium #String #Dynamic_Programming #Greedy
// #2023_07_04_Time_174_ms_(100.00%)_Space_37.6_MB_(100.00%)

class Solution {
    fun minimumPartition(s: String, k: Int): Int {
        if (k == 9) {
            return s.length
        }
        var partitions = 1
        var partitionValue: Long = 0
        var digit: Long
        for (i in 0 until s.length) {
            digit = s[i].code.toLong() - '0'.code.toLong()
            if (digit > k) {
                return -1
            }
            partitionValue = partitionValue * 10 + digit
            if (partitionValue > k) {
                partitionValue = digit
                partitions++
            }
        }
        return partitions
    }
}
