package g3801_3900.s3804_number_of_centered_subarrays

// #Medium #Array #Hash_Table #Enumeration #Senior #Weekly_Contest_484
// #2026_05_22_Time_84_ms_(80.43%)_Space_47.00_MB_(47.83%)

class Solution {
    fun centeredSubarrays(nums: IntArray): Int {
        val n = nums.size
        var result = 0
        for (i in 0..<n) {
            var subsum = 0
            val subnums: MutableSet<Int?> = HashSet<Int?>()
            for (j in i..<n) {
                subsum += nums[j]
                subnums.add(nums[j])
                result += if (subnums.contains(subsum)) 1 else 0
            }
        }
        return result
    }
}
