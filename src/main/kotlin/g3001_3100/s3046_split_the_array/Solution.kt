package g3001_3100.s3046_split_the_array

// #Easy #Array #Hash_Table #Counting #2024_03_03_Time_173_ms_(75.00%)_Space_39.3_MB_(5.36%)

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
