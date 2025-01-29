package g3401_3500.s3433_count_mentions_per_user

// #Medium #Array #Math #Sorting #Simulation #2025_01_29_Time_52_(100.00%)_Space_47.22_(60.71%)

class Solution {
    fun countMentions(numberOfUsers: Int, events: List<List<String>>): IntArray {
        val ans = IntArray(numberOfUsers)
        val l: MutableList<Int?> = ArrayList<Int?>()
        var c = 0
        for (i in events.indices) {
            val s = events[i][0]
            val ss = events[i][2]
            if (s == "MESSAGE") {
                if (ss == "ALL" || ss == "HERE") {
                    c++
                    if (ss == "HERE") {
                        l.add(events[i][1].toInt())
                    }
                } else {
                    val sss: Array<String?> = ss.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    for (j in sss.indices) {
                        val jj = sss[j]!!.substring(2, sss[j]!!.length).toInt()
                        ans[jj]++
                    }
                }
            }
        }
        for (i in events.indices) {
            if (events[i][0] == "OFFLINE") {
                val id = events[i][2].toInt()
                val a = events[i][1].toInt() + 60
                for (j in l.indices) {
                    if (l[j]!! >= a - 60 && l[j]!! < a) {
                        ans[id]--
                    }
                }
            }
        }
        for (i in 0..<numberOfUsers) {
            ans[i] += c
        }
        return ans
    }
}
