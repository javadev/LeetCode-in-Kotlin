package g2001_2100.s2035_partition_array_into_two_arrays_to_minimize_sum_difference

// #Hard #Array #Dynamic_Programming #Binary_Search #Two_Pointers #Bit_Manipulation #Ordered_Set
// #Bitmask #2023_06_23_Time_1318_ms_(100.00%)_Space_53.2_MB_(100.00%)

class Solution {
    fun minimumDifference(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return -1
        }
        val n = nums.size / 2
        var sum = 0
        val arr1: MutableList<MutableList<Int>> = ArrayList()
        val arr2: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0..n) {
            arr1.add(ArrayList())
            arr2.add(ArrayList())
            if (i < n) {
                sum += nums[i]
                sum += nums[i + n]
            }
        }
        for (state in 0 until (1 shl n)) {
            var sum1 = 0
            var sum2 = 0
            for (i in 0 until n) {
                if (state and (1 shl i) == 0) {
                    continue
                }
                val a1 = nums[i]
                val a2 = nums[i + n]
                sum1 += a1
                sum2 += a2
            }
            val numOfEleInSet = Integer.bitCount(state)
            arr1[numOfEleInSet].add(sum1)
            arr2[numOfEleInSet].add(sum2)
        }
        for (i in 0..n) {
            arr2[i].sort()
        }
        var min = Int.MAX_VALUE
        for (i in 0..n) {
            val sums1: List<Int> = arr1[i]
            val sums2: List<Int> = arr2[n - i]
            for (s1 in sums1) {
                var idx = sums2.binarySearch(sum / 2 - s1)
                if (idx < 0) {
                    idx = -(idx + 1)
                }
                if (idx < sums1.size) {
                    min = Math.min(
                        min,
                        Math.abs(sum - s1 - sums2[idx] - (sums2[idx] + s1)),
                    )
                }
                if (idx - 1 >= 0) {
                    min = Math.min(
                        min,
                        Math.abs(
                            sum - s1 - sums2[idx - 1] -
                                (sums2[idx - 1] + s1),
                        ),
                    )
                }
            }
        }
        return min
    }
}
