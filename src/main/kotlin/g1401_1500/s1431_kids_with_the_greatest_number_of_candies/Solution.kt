package g1401_1500.s1431_kids_with_the_greatest_number_of_candies

// #Easy #Array #2023_06_07_Time_152_ms_(99.61%)_Space_35.5_MB_(90.98%)

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for (i in candies) {
            max = Math.max(max, i)
        }
        val result: MutableList<Boolean> = ArrayList()
        for (candy in candies) {
            result.add(candy + extraCandies >= max)
        }
        return result
    }
}
