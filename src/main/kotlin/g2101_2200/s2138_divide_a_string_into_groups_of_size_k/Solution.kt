package g2101_2200.s2138_divide_a_string_into_groups_of_size_k

// #Easy #String #Simulation
class Solution {
    fun divideString(s: String, k: Int, fill: Char): Array<String?> {
        val ans = arrayOfNulls<String>(if (s.length % k != 0) s.length / k + 1 else s.length / k)
        var t = k
        val str: MutableList<String> = ArrayList()
        val sb = StringBuilder()
        var i = 0
        while (i < s.length) {
            if (t > 0) {
                sb.append(s[i])
                t--
            } else {
                t = k
                str.add(sb.toString())
                sb.setLength(0)
                i--
            }
            i++
        }
        if (t > 0) {
            while (t-- > 0) {
                sb.append(fill)
            }
        }
        str.add(sb.toString())
        for (j in str.indices) {
            ans[j] = str[j]
        }
        return ans
    }
}
