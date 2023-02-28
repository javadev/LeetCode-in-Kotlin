package g0501_0600.s0560_subarray_sum_equals_k

// #Medium #Top_100_Liked_Questions #Array #Hash_Table #Prefix_Sum #Data_Structure_II_Day_5_Array
// #2022_09_11_Time_692_ms_(53.27%)_Space_70.5_MB_(24.30%)

class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var tempSum = 0
        var ret = 0
        val sumCount: MutableMap<Int, Int?> = HashMap()
        sumCount[0] = 1
        for (i in nums) {
            tempSum += i
            if (sumCount.containsKey(tempSum - k)) {
                ret += sumCount[tempSum - k]!!
            }
            if (sumCount[tempSum] != null) {
                sumCount[tempSum] = sumCount[tempSum]!! + 1
            } else {
                sumCount[tempSum] = 1
            }
        }
        return ret
    }
}
