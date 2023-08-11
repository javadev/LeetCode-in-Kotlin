package g0901_1000.s0989_add_to_array_form_of_integer

// #Easy #Array #Math #Programming_Skills_II_Day_5
// #2023_05_11_Time_350_ms_(70.00%)_Space_71.3_MB_(30.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int?> {
        var k = k
        val result = ArrayList<Int?>()
        var carry = 0
        for (i in num.indices.reversed()) {
            val temp = num[i] + k % 10 + carry
            result.add(temp % 10)
            carry = temp / 10
            k /= 10
        }
        while (k > 0) {
            val t = k % 10 + carry
            result.add(t % 10)
            carry = t / 10
            k /= 10
        }
        if (carry == 1) {
            result.add(1)
        }
        result.reverse()
        return result
    }
}
