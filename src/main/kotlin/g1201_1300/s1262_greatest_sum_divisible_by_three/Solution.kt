package g1201_1300.s1262_greatest_sum_divisible_by_three

// #Medium #Array #Dynamic_Programming #Greedy
// #2023_06_08_Time_263_ms_(100.00%)_Space_39.9_MB_(33.33%)

class Solution {
    fun maxSumDivThree(nums: IntArray): Int {
        var sum = 0
        var smallestNumWithMod1 = 10001
        var secondSmallestNumWithMod1 = 10002
        var smallestNumWithMod2 = 10001
        var secondSmallestNumWithMod2 = 10002
        for (i in nums) {
            sum += i
            if (i % 3 == 1) {
                if (i <= smallestNumWithMod1) {
                    val temp = smallestNumWithMod1
                    smallestNumWithMod1 = i
                    secondSmallestNumWithMod1 = temp
                } else if (i < secondSmallestNumWithMod1) {
                    secondSmallestNumWithMod1 = i
                }
            }
            if (i % 3 == 2) {
                if (i <= smallestNumWithMod2) {
                    val temp = smallestNumWithMod2
                    smallestNumWithMod2 = i
                    secondSmallestNumWithMod2 = temp
                } else if (i < secondSmallestNumWithMod2) {
                    secondSmallestNumWithMod2 = i
                }
            }
        }
        if (sum % 3 == 0) {
            return sum
        } else if (sum % 3 == 2) {
            val min = Math.min(smallestNumWithMod2, smallestNumWithMod1 + secondSmallestNumWithMod1)
            return sum - min
        } else if (sum % 3 == 1) {
            val min = Math.min(smallestNumWithMod1, smallestNumWithMod2 + secondSmallestNumWithMod2)
            return sum - min
        }
        return sum
    }
}
