package g2801_2900.s2848_points_that_intersect_with_cars

// #Easy #Hash_Table #Math #Prefix_Sum #2023_12_18_Time_190_ms_(100.00%)_Space_41.3_MB_(25.00%)

class Solution {
    fun numberOfPoints(nums: List<List<Int>>): Int {
        var min = 101
        var max = 0
        val count = IntArray(102)
        for (list in nums) {
            val num1 = list[0]
            val num2 = list[1]
            if (num1 < min) {
                min = num1
            }
            if (num2 > max) {
                max = num2
            }
            count[num1]--
            count[num2 + 1]++
        }
        var result = 0
        var balance = 0
        while (min <= max) {
            balance += count[min]
            if (balance < 0) {
                result++
            }
            min++
        }
        return result
    }
}
