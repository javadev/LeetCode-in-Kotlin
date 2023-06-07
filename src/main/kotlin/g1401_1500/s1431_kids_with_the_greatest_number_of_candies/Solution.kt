package g1401_1500.s1431_kids_with_the_greatest_number_of_candies

// #Easy #Array
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
