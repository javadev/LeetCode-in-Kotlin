package g3501_3600.s3507_minimum_pair_removal_to_sort_array_i

// #Easy #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_09_Time_2_ms_(100.00%)_Space_43.35_MB_(97.44%)

class Solution {
    fun minimumPairRemoval(nums: IntArray): Int {
        var nums = nums
        var operations = 0
        while (!isNonDecreasing(nums)) {
            var minSum = Int.Companion.MAX_VALUE
            var index = 0
            // Find the leftmost pair with minimum sum
            for (i in 0..<nums.size - 1) {
                val sum = nums[i] + nums[i + 1]
                if (sum < minSum) {
                    minSum = sum
                    index = i
                }
            }
            // Merge the pair at index
            val newNums = IntArray(nums.size - 1)
            var j = 0
            var i = 0
            while (i < nums.size) {
                if (i == index) {
                    newNums[j++] = nums[i] + nums[i + 1]
                    // Skip the next one since it's merged
                    i++
                } else {
                    newNums[j++] = nums[i]
                }
                i++
            }
            nums = newNums
            operations++
        }
        return operations
    }

    private fun isNonDecreasing(nums: IntArray): Boolean {
        for (i in 1..<nums.size) {
            if (nums[i] < nums[i - 1]) {
                return false
            }
        }
        return true
    }
}
