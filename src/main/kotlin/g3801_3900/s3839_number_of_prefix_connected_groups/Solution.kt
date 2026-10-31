package g3801_3900.s3839_number_of_prefix_connected_groups

// #Medium #Array #String #Hash_Table #Counting #Senior #Biweekly_Contest_176
// #2026_07_21_Time_20_ms_(89.73%)_Space_48.85_MB_(67.30%)

class Solution {
    fun prefixConnected(words: Array<String>, k: Int): Int {
        val mpp = HashMap<String?, Int?>()
        for (word in words) {
            if (word.length >= k) {
                val pref = word.substring(0, k)
                mpp.put(pref, mpp.getOrDefault(pref, 0)!! + 1)
            }
        }
        var cnt = 0
        for (y in mpp.values) {
            if (y!! >= 2) {
                cnt++
            }
        }
        return cnt
    }
}
