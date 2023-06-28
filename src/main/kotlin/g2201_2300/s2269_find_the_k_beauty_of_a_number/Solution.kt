package g2201_2300.s2269_find_the_k_beauty_of_a_number

// #Easy #String #Math #Sliding_Window
class Solution {
    fun divisorSubstrings(num: Int, k: Int): Int {
        var i = 0
        var j = 0
        var count = 0
        val s = num.toString()
        val sb = StringBuilder()
        while (i < s.length && j < s.length) {
            sb.append(s[j].code - '0'.code)
            val `val` = sb.toString().toInt()
            if (j - i + 1 == k) {
                if (`val` != 0 && num % `val` == 0) {
                    count++
                }
                sb.deleteCharAt(0)
                i++
                j++
            } else {
                j++
            }
        }
        return count
    }
}
