package g0501_0600.s0537_complex_number_multiplication

// #Medium #String #Math #Simulation #2023_01_16_Time_171_ms_(75.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun complexNumberMultiply(num1: String, num2: String): String {
        val countReal: Int
        val countImagine: Int
        val arr1 = IntArray(2)
        val arr2 = IntArray(2)
        arr1[0] = num1.substring(0, num1.indexOf("+")).toInt()
        arr1[1] = num1.substring(num1.indexOf("+") + 1, num1.length - 1).toInt()
        arr2[0] = num2.substring(0, num2.indexOf("+")).toInt()
        arr2[1] = num2.substring(num2.indexOf("+") + 1, num2.length - 1).toInt()
        countReal = arr1[0] * arr2[0] - arr1[1] * arr2[1]
        countImagine = arr1[0] * arr2[1] + arr1[1] * arr2[0]
        return countReal.toString() + "+" + countImagine + "i"
    }
}
