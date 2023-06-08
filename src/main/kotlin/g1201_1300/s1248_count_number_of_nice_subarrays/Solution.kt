package g1201_1300.s1248_count_number_of_nice_subarrays

// #Medium #Array #Hash_Table #Math #Sliding_Window
class Solution {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var oddLen = 0
        var startIndex = 0
        var num = 0
        var endIndex: Int
        var res = 0
        var hasK: Boolean
        for (i in nums.indices) {
            hasK = false
            endIndex = i
            if (nums[i] % 2 == 1) {
                oddLen++
            }
            while (oddLen >= k) {
                hasK = true
                if (nums[startIndex++] % 2 == 1) {
                    oddLen--
                }
                num++
            }
            res += num
            while (hasK && ++endIndex < nums.size && nums[endIndex] % 2 == 0) {
                res += num
            }
            num = 0
        }
        return res
    }
}
