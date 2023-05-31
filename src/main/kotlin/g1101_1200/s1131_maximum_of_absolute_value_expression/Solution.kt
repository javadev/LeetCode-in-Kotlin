package g1101_1200.s1131_maximum_of_absolute_value_expression

// #Medium #Array #Math #2023_05_31_Time_333_ms_(100.00%)_Space_65.4_MB_(100.00%)

class Solution {
    fun maxAbsValExpr(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size != arr2.size) {
            return 0
        }
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var max3 = Int.MIN_VALUE
        var max4 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE
        var min3 = Int.MAX_VALUE
        var min4 = Int.MAX_VALUE
        for (i in arr1.indices) {
            max1 = Math.max(arr1[i] + arr2[i] + i, max1)
            min1 = Math.min(arr1[i] + arr2[i] + i, min1)
            max2 = Math.max(i - arr1[i] - arr2[i], max2)
            min2 = Math.min(i - arr1[i] - arr2[i], min2)
            max3 = Math.max(arr1[i] - arr2[i] + i, max3)
            min3 = Math.min(arr1[i] - arr2[i] + i, min3)
            max4 = Math.max(arr2[i] - arr1[i] + i, max4)
            min4 = Math.min(arr2[i] - arr1[i] + i, min4)
        }
        return Math.max(Math.max(max1 - min1, max2 - min2), Math.max(max3 - min3, max4 - min4))
    }
}
