package g0801_0900.s0811_subdomain_visit_count

// #Medium #Array #String #Hash_Table #Counting
// #2023_03_17_Time_220_ms_(100.00%)_Space_36.6_MB_(100.00%)

class Solution {
    fun subdomainVisits(d: Array<String>): List<String> {
        val fmap: MutableMap<String, Int> = HashMap()
        for (s in d) {
            var rep = 0
            var i = 0
            while (i < s.length) {
                val c = s[i]
                rep = if (c in '0'..'9') {
                    rep * 10 + (c.code - '0'.code)
                } else {
                    break
                }
                i++
            }
            val str = s.substring(i + 1)
            seperate(rep, str, fmap)
        }
        val res: MutableList<String> = ArrayList()
        for (entry in fmap.entries.iterator()) {
            var comp = ""
            comp += entry.value
            comp += " "
            comp += entry.key
            res.add(comp)
        }
        return res
    }

    private fun seperate(rep: Int, s: String, fmap: MutableMap<String, Int>) {
        var i = s.length - 1
        while (i >= 0) {
            while (i >= 0 && s[i] != '.') {
                i--
            }
            val toHash: String = s.substring(i + 1)
            fmap[toHash] = fmap.getOrDefault(toHash, 0) + rep
            i--
        }
    }
}
