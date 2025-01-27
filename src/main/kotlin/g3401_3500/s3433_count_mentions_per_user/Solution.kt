package g3401_3500.s3433_count_mentions_per_user

// #Medium #Array #Math #Sorting #Simulation #2025_01_26_Time_90_(100.00%)_Space_49.08_(100.00%)

class Solution {
    fun countMentions(numberOfUsers: Int, events: List<List<String>>): IntArray {
        val sortedEvents = events.sortedWith { a, b ->
            val time1 = a[1].toInt()
            val time2 = b[1].toInt()
            if (time1 == time2 && a[0] == "OFFLINE" && b[0] == "MESSAGE") {
                -1
            } else {
                time1 - time2
            }
        }
        val ans = IntArray(numberOfUsers)
        val userTimestamps = IntArray(numberOfUsers)
        for (event in sortedEvents) {
            val msg = event[0]
            val time = event[1].toInt()

            when (msg) {
                "OFFLINE" -> {
                    userTimestamps[event[2].toInt()] = time + 60
                }
                "MESSAGE" -> {
                    val mentionsString = event[2]
                    when (mentionsString) {
                        "ALL" -> {
                            for (i in 0 until numberOfUsers) {
                                ans[i]++
                            }
                        }
                        "HERE" -> {
                            for (i in 0 until numberOfUsers) {
                                if (userTimestamps[i] <= time) ans[i]++
                            }
                        }
                        else -> {
                            mentionsString.split(" ").forEach { id ->
                                val curr = id.substring(2).toInt()
                                ans[curr]++
                            }
                        }
                    }
                }
            }
        }
        return ans
    }
}
