package g0001_0100.s0066_plus_one

// #Easy #Top_Interview_Questions #Array #Math #Programming_Skills_II_Day_3 #Udemy_Arrays
// #2022_09_23_Time_303_ms_(35.18%)_Space_35.1_MB_(80.78%)

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val num = 1
        var carry = 0
        var sum: Int
        for (i in digits.indices.reversed()) {
            sum = if (i == digits.size - 1) {
                digits[i] + carry + num
            } else {
                digits[i] + carry
            }
            carry = sum / 10
            digits[i] = sum % 10
        }
        if (carry != 0) {
            val ans = IntArray(digits.size + 1)
            ans[0] = carry
            System.arraycopy(digits, 0, ans, 1, ans.size - 1)
            return ans
        }
        return digits
    }
}
