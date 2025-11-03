package g3701_3800.s3731_find_missing_elements

// #Easy #Weekly_Contest_474 #2025_11_03_Time_12_ms_(100.00%)_Space_48.81_MB_(11.11%)

class Solution {
    fun findMissingElements(nums: IntArray): MutableList<Int> {
        val list: MutableList<Int> = ArrayList()
        nums.sort()
        for (i in 0..<nums.size - 1) {
            if (nums[i + 1] - nums[i] > 1) {
                for (j in nums[i] + 1..<nums[i + 1]) {
                    list.add(j)
                }
            }
        }
        return list
    }
}
