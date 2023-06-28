package g2201_2300.s2294_partition_array_such_that_maximum_difference_is_k

// #Medium #Array #Sorting #Greedy
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
