package g1201_1300.s1237_find_positive_integer_solution_for_a_given_equation

// #Medium #Math #Binary_Search #Two_Pointers #Interactive
class Solution {
    // This is the custom function interface.
    // You should not implement it, or speculate about its implementation
    interface CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        fun f(x: Int, y: Int): Int
    }

    fun findSolution(customfunction: CustomFunction, z: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        var x = 1
        var y = 1000
        while (x < 1001 && y > 0) {
            val functionResult = customfunction.f(x, y)
            if (functionResult < z) {
                x++
            } else if (functionResult > z) {
                y--
            } else {
                result.add(listOf(x++, y--))
            }
        }
        return result
    }
}
