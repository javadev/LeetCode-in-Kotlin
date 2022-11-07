package g0301_0400.s0301_remove_invalid_parentheses

// #Hard #String #Breadth_First_Search #Backtracking
// #2022_11_07_Time_312_ms_(100.00%)_Space_35.8_MB_(100.00%)

class Solution {
    fun removeInvalidParentheses(s: String): List<String> {
        val res: MutableList<String> = ArrayList()
        // reversed+inverted
        val ri = false
        dfs(s, 0, 0, res, ri)
        return res
    }

    // BASIC IDEA: find prefix w/ extra ")".
    // THEN use for loop to delete ")"s inside prefix, making recursive calls on the ENTIRE STRING
    // b/c you don't know where the next ")" will be deleted.
    private fun dfs(s: String, deletionSearch: Int, stackSearch: Int, res: MutableList<String>, ri: Boolean) {
        // functions imilarly to LC20. Valid Parenthesis, -1 for ")" and +1 for "("
        var s = s
        var deletionSearch = deletionSearch
        var stack = 0
        // see recursive call for explanation
        var p = stackSearch
        while (p < s.length && stack >= 0) {
            if (s[p] == ')') {
                stack--
            }
            if (s[p] == '(') {
                stack++
            }
            p++
        }
        if (stack < 0) {
            // p already goes beyond the prefix by +1
            val prefix = s.substring(0, p)
            // remove extra ")" from prefix
            for (i in deletionSearch until prefix.length) {
                // find last ")" in ")))...)" to avoid duplicates
                if (s[i] == ')' && (i == prefix.length - 1 || s[i + 1] != ')')) {
                    // remove s.charAt(i) and recurse
                    // NOTE: p-1 b/c after you make a deletion, you know that the prefix is valid,
                    // so there's no point in recounting ")"
                    // NOTE: p-1 is the start index for COUNTING ")" in the recursive call, not for
                    // DELETIONS.
                    // Think of the DELETION index as SEPARATE from the COUNTING/STACK index.
                    dfs(s.substring(0, i) + s.substring(i + 1), deletionSearch, p - 1, res, ri)
                    // for next iteration, can only search BEYOND i in recursive calls for the ")"
                    // to delete
                    deletionSearch = i + 1
                }
            }
        } else {
            // no extra ")" found
            // repeat for "("
            if (!ri) {
                // reverse + invert
                s = reverseInvert(s)
                // call again
                dfs(s, 0, 0, res, true)
            } else {
                // done with both ")" and "("
                // revert to original arr
                s = reverseInvert(s)
                res.add(s)
            }
        }
    }

    // reverses and inverts to accomplish r->l scan
    private fun reverseInvert(s: String): String {
        val sb = StringBuilder()
        // invert
        for (c in s.toCharArray()) {
            if (c == '(') {
                sb.append(')')
            } else if (c == ')') {
                sb.append('(')
            } else {
                sb.append(c)
            }
        }
        // reverse
        return sb.reverse().toString()
    }
}
