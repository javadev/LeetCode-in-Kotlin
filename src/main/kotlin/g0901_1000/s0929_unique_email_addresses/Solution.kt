package g0901_1000.s0929_unique_email_addresses

// #Easy #Array #String #Hash_Table #2023_04_26_Time_207_ms_(89.29%)_Space_37.1_MB_(82.14%)

class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        val set: MutableSet<String> = HashSet()
        for (s in emails) {
            val sb = StringBuilder()
            var i = 0
            while (i < s.length) {
                val c = s[i]
                if (c == '+' || c == '@') {
                    sb.append('@')
                    i = s.indexOf("@") + 1
                    sb.append(s.substring(i))
                    break
                } else if (c != '.') {
                    sb.append(c)
                }
                i++
            }
            set.add(sb.toString())
        }
        return set.size
    }
}
