package g0801_0900.s0859_buddy_strings

// #Easy #String #Hash_Table #2023_04_03_Time_149_ms_(91.01%)_Space_35.7_MB_(56.18%)

class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        var first = -1
        val second: Int
        val sCounts = IntArray(26)
        if (s == goal) {
            for (i in s.indices) {
                sCounts[s[i].code - 'a'.code]++
                if (sCounts[s[i].code - 'a'.code] > 1) {
                    return true
                }
            }
        }
        for (i in s.indices) {
            val curr = s[i]
            sCounts[curr.code - 'a'.code]++
            if (curr != goal[i]) {
                if (first == -1) {
                    first = i
                } else {
                    second = i
                    val ss = s.toCharArray()
                    val temp = ss[first]
                    ss[first] = ss[second]
                    ss[second] = temp
                    return String(ss) == goal
                }
            }
        }
        return false
    }
}
