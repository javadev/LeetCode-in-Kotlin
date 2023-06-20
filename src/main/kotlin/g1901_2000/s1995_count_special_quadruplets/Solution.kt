package g1901_2000.s1995_count_special_quadruplets

// #Easy #Array #Enumeration
class Solution {
    fun countQuadruplets(nums: IntArray): Int {
        var count = 0
        // max nums value is 100 so two elements sum can be max 200
        val m = IntArray(201)
        for (i in 1 until nums.size - 2) {
            for (j in 0 until i) {
                // update all possible 2 sums
                m[nums[j] + nums[i]]++
            }
            for (j in i + 2 until nums.size) {
                // fix third element and search for fourth - third in 2 sums as a  + b + c = d == a
                // +  b = d - c
                val diff = nums[j] - nums[i + 1]
                if (diff >= 0) {
                    count += m[diff]
                }
            }
        }
        return count
    }
}
