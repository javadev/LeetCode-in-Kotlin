package g2701_2800.s2740_find_the_value_of_the_partition

// #Medium #Array #Sorting #2023_08_05_Time_431_ms_(100.00%)_Space_57.5_MB_(72.73%)

class Solution {
    fun findValueOfPartition(nums: IntArray): Int = nums
        .sortedDescending()
        .zipWithNext(Int::minus)
        .min()!!
}
