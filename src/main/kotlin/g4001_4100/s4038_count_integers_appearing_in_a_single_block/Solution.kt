package g4001_4100.s4038_count_integers_appearing_in_a_single_block

// #Easy #Array #Hash_Table #Counting #Mid_Level #Weekly_Contest_517
// #2026_11_25_Time_1_ms_(99.14%)_Space_43.37_MB_(73.66%)

class Solution {
    fun countSpecialIntegers(nums: IntArray): Int {
        val seen = BooleanArray(101)
        val special = BooleanArray(101)
        var count = 0
        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (seen[nums[i]]) {
                    special[nums[i]] = false
                } else {
                    seen[nums[i]] = true
                    special[nums[i]] = true
                }
            }
        }
        for (x in 1..100) {
            if (special[x]) {
                count++
            }
        }
        return count
    }
}
