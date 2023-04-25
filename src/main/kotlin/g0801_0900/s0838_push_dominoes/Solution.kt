package g0801_0900.s0838_push_dominoes

// #Medium #String #Dynamic_Programming #Two_Pointers
// #2023_03_28_Time_270_ms_(100.00%)_Space_39.5_MB_(100.00%)

class Solution {
    fun pushDominoes(dominoes: String): String {
        val ch = CharArray(dominoes.length + 2)
        ch[0] = 'L'
        ch[ch.size - 1] = 'R'
        for (k in 1 until ch.size - 1) {
            ch[k] = dominoes[k - 1]
        }
        var i = 0
        var j = 1
        while (j < ch.size) {
            while (ch[j] == '.') {
                j++
            }
            if (ch[i] == 'L' && ch[j] == 'L') {
                while (i != j) {
                    ch[i] = 'L'
                    i++
                }
                j++
            } else if (ch[i] == 'R' && ch[j] == 'R') {
                while (i != j) {
                    ch[i] = 'R'
                    i++
                }
                j++
            } else if (ch[i] == 'L' && ch[j] == 'R') {
                i = j
                j++
            } else if (ch[i] == 'R' && ch[j] == 'L') {
                var rTemp = i + 1
                var lTemp = j - 1
                while (rTemp < lTemp) {
                    ch[rTemp] = 'R'
                    ch[lTemp] = 'L'
                    rTemp++
                    lTemp--
                }
                i = j
                j++
            }
        }
        val sb = StringBuilder()
        for (k in 1 until ch.size - 1) {
            sb.append(ch[k])
        }
        return sb.toString()
    }
}
