package g0401_0500.s0402_remove_k_digits

// #Medium #String #Greedy #Stack #Monotonic_Stack
// #2022_12_01_Time_375_ms_(75.00%)_Space_42.8_MB_(66.67%)

class Solution {
    fun removeKdigits(num: String, k: Int): String {
        var k = k
        val list = CharArray(num.length)
        val len = num.length - k
        var top = 0
        for (i in 0 until num.length) {
            while (top > 0 && k > 0 && num[i] < list[top - 1]) {
                top--
                k--
            }
            list[top++] = num[i]
        }
        var number = 0
        while (number < len && list[number] == '0') {
            number++
        }
        return if (number == len) "0" else String(list, number, len - number)
    }
}
