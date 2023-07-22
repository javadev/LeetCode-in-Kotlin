package g1201_1300.s1276_number_of_burgers_with_no_waste_of_ingredients

// #Medium #Math #2023_06_08_Time_190_ms_(50.00%)_Space_35.5_MB_(100.00%)

class Solution {
    fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> {
        val numbers: MutableList<Int> = ArrayList()
        val numberOfCheese = cheeseSlices * 4
        val remaining = numberOfCheese - tomatoSlices
        if (remaining >= 0 && remaining % 2 != 1) {
            val numberOfSmall = remaining / 2
            val numberOfLarge = cheeseSlices - numberOfSmall
            if (numberOfLarge < 0) {
                return numbers
            }
            numbers.add(numberOfLarge)
            numbers.add(numberOfSmall)
        }
        return numbers
    }
}
