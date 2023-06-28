package g2201_2300.s2294_partition_array_such_that_maximum_difference_is_k

// #Medium #Array #Sorting #Greedy #2023_06_28_Time_747_ms_(33.33%)_Space_65.3_MB_(100.00%)

class Solution {
    fun partitionArray(nums: IntArray, k: Int): Int {
        nums.sort()
        var partitions = 1
        var j = 0
        for (i in 1 until nums.size) {
            if (nums[i] - nums[j] > k) {
                partitions++
                j = i
            }
        }
        return partitions
    }
}
