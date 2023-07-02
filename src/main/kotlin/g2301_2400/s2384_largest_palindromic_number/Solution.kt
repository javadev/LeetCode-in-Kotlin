package g2301_2400.s2384_largest_palindromic_number

// #Medium #String #Hash_Table #Greedy
class Solution {
    fun largestPalindromic(num: String): String {
        val count = IntArray(10)
        var center = -1
        val first = StringBuilder()
        val second: StringBuilder
        for (c in num.toCharArray()) {
            count[c.code - '0'.code]++
        }
        var c: Int
        for (i in 9 downTo 0) {
            c = 0
            if (count[i] % 2 == 1 && center == -1) {
                center = i
            }
            if (first.length == 0 && i == 0) {
                continue
            }
            while (c < count[i] / 2) {
                first.append(i.toString())
                c++
            }
        }
        second = StringBuilder(first.toString())
        if (center != -1) {
            first.append(center)
        }
        first.append(second.reverse().toString())
        return if (first.length == 0) "0" else first.toString()
    }
}
