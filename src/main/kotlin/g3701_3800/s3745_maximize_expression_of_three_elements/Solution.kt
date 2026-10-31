package g3701_3800.s3745_maximize_expression_of_three_elements

// #Easy #Array #Sorting #Greedy #Enumeration #Mid_Level #Weekly_Contest_476
// #2026_04_26_Time_1_ms_(99.84%)_Space_45.12_MB_(68.56%)

class Solution {
    fun maximizeExpressionOfThree(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for (num in nums) {
            if (num > max1) {
                max2 = max1
                max1 = num
            } else if (num > max2) {
                max2 = num
            }
            if (num < min) {
                min = num
            }
        }
        return max1 + max2 - min
    }
}
