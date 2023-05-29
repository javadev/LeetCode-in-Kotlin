package g1101_1200.s1111_maximum_nesting_depth_of_two_valid_parentheses_strings

// #Medium #String #Stack

class Solution {
    fun maxDepthAfterSplit(seq: String): IntArray {
        val n = seq.length
        val ans = IntArray(n)
        val chars = seq.toCharArray()
        var depth = 0
        for (i in 0 until n) {
            if (chars[i] == '(') {
                depth++
                if (depth % 2 == 0) {
                    ans[i] = 0
                } else {
                    ans[i] = 1
                }
            } else {
                if (depth % 2 == 0) {
                    ans[i] = 0
                } else {
                    ans[i] = 1
                }
                depth--
            }
        }
        return ans
    }
}