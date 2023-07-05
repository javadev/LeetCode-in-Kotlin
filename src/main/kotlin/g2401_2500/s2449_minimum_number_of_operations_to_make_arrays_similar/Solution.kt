package g2401_2500.s2449_minimum_number_of_operations_to_make_arrays_similar

// #Hard #Array #Sorting #Greedy #2023_07_05_Time_791_ms_(100.00%)_Space_61.9_MB_(100.00%)

class Solution {
    fun makeSimilar(nums: IntArray, target: IntArray): Long {
        val evenNums = ArrayList<Int>()
        val oddNums = ArrayList<Int>()
        val evenTar = ArrayList<Int>()
        val oddTar = ArrayList<Int>()
        nums.sort()
        target.sort()
        for (i in nums.indices) {
            if (nums[i] % 2 == 0) {
                evenNums.add(nums[i])
            } else {
                oddNums.add(nums[i])
            }
            if (target[i] % 2 == 0) {
                evenTar.add(target[i])
            } else {
                oddTar.add(target[i])
            }
        }
        var countPositiveIteration: Long = 0
        var countNegativeIteration: Long = 0
        for (i in evenNums.indices) {
            val num = evenNums[i]
            val tar = evenTar[i]
            val diff = num.toLong() - tar
            val iteration = diff / 2
            if (diff > 0) {
                countNegativeIteration += iteration
            } else if (diff < 0) {
                countPositiveIteration += Math.abs(iteration)
            }
        }
        for (i in oddNums.indices) {
            val num = oddNums[i]
            val tar = oddTar[i]
            val diff = num.toLong() - tar
            val iteration = diff / 2
            if (diff > 0) {
                countNegativeIteration += iteration
            } else if (diff < 0) {
                countPositiveIteration += Math.abs(iteration)
            }
        }
        val totalDifference = countPositiveIteration - countNegativeIteration
        return if (totalDifference == 0L) countPositiveIteration else countPositiveIteration + Math.abs(totalDifference)
    }
}
