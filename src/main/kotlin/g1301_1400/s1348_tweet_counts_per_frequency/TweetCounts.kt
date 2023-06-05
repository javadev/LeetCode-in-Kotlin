package g1301_1400.s1348_tweet_counts_per_frequency

// #Medium #Hash_Table #Sorting #Binary_Search #Design #Ordered_Set

class TweetCounts {
    private val store: MutableMap<String, MutableMap<Int, MutableMap<Int, MutableMap<Int, MutableList<Int>>>>>

    init {
        store = HashMap()
    }

    fun recordTweet(tweetName: String, time: Int) {
        val d = time / DAY
        val h = (time - d * DAY) / HOUR
        val m = (time - d * DAY - h * HOUR) / MINUTE
        val dstore = store.computeIfAbsent(tweetName) { _: String? -> HashMap() }
        val hstore = dstore.computeIfAbsent(d) { _: Int? -> HashMap() }
        val mstore = hstore.computeIfAbsent(h) { _: Int? -> HashMap() }
        mstore.computeIfAbsent(m) { k: Int? -> ArrayList() }.add(time)
    }

    fun getTweetCountsPerFrequency(
        freq: String,
        tweetName: String,
        startTime: Int,
        endTime: Int
    ): List<Int> {
        val sfreq = convFreqToSecond(freq)
        val dstore: Map<Int, MutableMap<Int, MutableMap<Int, MutableList<Int>>>> = store[tweetName]!!
        val chunks = IntArray((endTime - startTime) / sfreq + 1)
        val sd = startTime / DAY
        val ed = endTime / DAY
        for (d in sd..ed) {
            if (!dstore.containsKey(d)) {
                continue
            }
            val sh = if (startTime <= d * DAY) 0 else (startTime - d * DAY) / HOUR
            val eh = if (endTime > (d + 1) * DAY) DAY / HOUR else (endTime - d * DAY) / HOUR + 1
            val hstore: Map<Int, MutableMap<Int, MutableList<Int>>> = dstore[d]!!
            for (h in sh until eh) {
                if (!hstore.containsKey(h)) {
                    continue
                }
                val sm = if (startTime <= d * DAY + h * HOUR) 0
                else (startTime - d * DAY - h * HOUR) / MINUTE
                val em = if (endTime > d * DAY + (h + 1) * HOUR) HOUR / MINUTE
                else (endTime - d * DAY - h * HOUR) / MINUTE + 1
                val mstore: Map<Int, MutableList<Int>> = hstore[h]!!
                for (m in sm..em) {
                    if (!mstore.containsKey(m)) {
                        continue
                    }
                    for (rc in mstore[m]!!) {
                        if (startTime <= rc && rc <= endTime) {
                            chunks[(rc - startTime) / sfreq]++
                        }
                    }
                }
            }
        }
        val ans: MutableList<Int> = ArrayList()
        for (chunk in chunks) {
            ans.add(chunk)
        }
        return ans
    }

    private fun convFreqToSecond(freq: String): Int {
        return when (freq) {
            "minute" -> MINUTE
            "hour" -> HOUR
            "day" -> DAY
            else -> 0
        }
    }

    companion object {
        private const val MINUTE = 60
        private const val HOUR = 3600
        private const val DAY = 86400
    }
}
