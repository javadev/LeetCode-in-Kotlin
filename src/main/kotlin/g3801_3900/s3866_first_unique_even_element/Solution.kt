package g3801_3900.s3866_first_unique_even_element

// #Easy #Array #Hash_Table #Counting #Mid_Level #Biweekly_Contest_178
// #2026_07_28_Time_1_ms_(99.26%)_Space_46.46_MB_(18.62%)

class Solution {
    fun firstUniqueEven(nums: IntArray): Int {
        val arr = IntArray(100)
        for (num in nums) {
            arr[num - 1]++
        }
        for (num in nums) {
            if (num % 2 == 0 && (arr[num - 1] == 1)) {
                return num
            }
        }
        return -1
    }
}
