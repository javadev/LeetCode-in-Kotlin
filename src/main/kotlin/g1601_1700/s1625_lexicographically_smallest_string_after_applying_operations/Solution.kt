package g1601_1700.s1625_lexicographically_smallest_string_after_applying_operations

// #Medium #String #Breadth_First_Search #2023_06_16_Time_415_ms_(100.00%)_Space_68.7_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private var ans = "z"
    private fun dfs(s: String, a: Int, b: Int, set: HashSet<String>) {
        if (set.contains(s)) {
            return
        }
        set.add(s)
        val one = add(s, a)
        val two = rotate(s, b)
        dfs(one, a, b, set)
        dfs(two, a, b, set)
    }

    private fun add(s: String, a: Int): String {
        var s = s
        val temp = s.toCharArray()
        var i = 1
        while (i < temp.size) {
            var `val` = temp[i].code - '0'.code
            `val` = (`val` + a) % 10
            temp[i] = (`val` + '0'.code).toChar()
            i += 2
        }
        s = String(temp)
        if (ans > s) {
            ans = s
        }
        return s
    }

    private fun rotate(s: String, b: Int): String {
        var s = s
        var b = b
        if (b < 0) {
            b += s.length
        }
        b %= s.length
        b = s.length - b
        s = s.substring(b) + s.substring(0, b)
        if (ans > s) {
            ans = s
        }
        return s
    }

    fun findLexSmallestString(s: String, a: Int, b: Int): String {
        val set = HashSet<String>()
        dfs(s, a, b, set)
        return ans
    }
}
