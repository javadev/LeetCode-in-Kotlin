package g0001_0100.s0043_multiply_strings

// #Medium #String #Math #Simulation #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_4
// #Level_2_Day_2_String #2023_07_05_Time_165_ms_(96.72%)_Space_36.1_MB_(67.21%)

class Solution {
    private fun getIntArray(s: String): IntArray {
        val chars = s.toCharArray()
        val arr = IntArray(chars.size)
        for (i in chars.indices) {
            arr[i] = chars[i] - '0'
        }
        return arr
    }

    private fun convertToStr(res: IntArray, i: Int): String {
        var index = i
        val chars = StringBuffer()
        while (index < res.size) {
            chars.append(res[index].toString())
            index++
        }
        return chars.toString()
    }

    fun multiply(num1: String, num2: String): String {
        val arr1 = getIntArray(num1)
        val arr2 = getIntArray(num2)
        val res = IntArray(arr1.size + arr2.size)
        var index = arr1.size + arr2.size - 1
        for (i in arr2.indices.reversed()) {
            var k = index--
            for (j in arr1.indices.reversed()) {
                res[k] += arr2[i] * arr1[j]
                k--
            }
        }
        index = arr1.size + arr2.size - 1
        var carry = 0
        for (i in index downTo 0) {
            val temp = res[i] + carry
            res[i] = temp % 10
            carry = temp / 10
        }
        var i = 0
        while (i < res.size && res[i] == 0) {
            i++
        }
        return if (i > index) {
            "0"
        } else {
            convertToStr(res, i)
        }
    }
}
