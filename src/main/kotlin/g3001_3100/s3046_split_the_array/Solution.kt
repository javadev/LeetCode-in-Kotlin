package g3001_3100.s3046_split_the_array

// #Easy #Array #Hash_Table #Counting #2024_02_29_Time_1_ms_(98.82%)_Space_42.8_MB_(63.55%)

class Solution {
    fun isPossibleToSplit(nums: IntArray): Boolean {
        val a = IntArray(101)
        for (n in nums) {
            a[n]++
            if (a[n] > 2) {
                return false
            }
        }
        return true
    }
}
