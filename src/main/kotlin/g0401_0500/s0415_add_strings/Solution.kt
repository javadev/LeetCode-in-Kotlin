package g0401_0500.s0415_add_strings

// #Easy #String #Math #Simulation #Data_Structure_II_Day_6_String
// #2022_12_06_Time_296_ms_(76.00%)_Space_36_MB_(84.00%)

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var endNum1 = num1.length - 1
        var endNum2 = num2.length - 1
        val res = StringBuilder()
        var carry = 0
        var sum: Int

        while(endNum1 >= 0 || endNum2 >= 0){

            val a = if(endNum1 >= 0) num1[endNum1] - '0' else 0
            val b = if(endNum2 >= 0) num2[endNum2] - '0' else 0

            sum = (a + b + carry) % 10
            carry =  (a + b + carry) / 10

            res.append(sum)

            endNum1--
            endNum2--
        }

        if(carry != 0) {
            res.append(carry)
        }

        return res.reverse().toString()

    }
}