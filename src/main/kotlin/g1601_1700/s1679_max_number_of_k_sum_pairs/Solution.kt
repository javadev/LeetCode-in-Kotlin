package g1601_1700.s1679_max_number_of_k_sum_pairs

// #Medium #Array #Hash_Table #Sorting #Two_Pointers
class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var start = 0
        var end = nums.size - 1
        var count = 0
        while (start < end) {
            val sum = nums[start] + nums[end]
            if (sum == k) {
                count++
                start++
                end--
            } else if (sum < k) {
                start++
            } else {
                end--
            }
        }
        return count
    }
}
