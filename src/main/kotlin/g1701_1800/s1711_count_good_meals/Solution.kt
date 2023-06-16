package g1701_1800.s1711_count_good_meals

// #Medium #Array #Hash_Table #2023_06_16_Time_549_ms_(100.00%)_Space_53_MB_(100.00%)

class Solution {
    fun countPairs(deliciousness: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (k in deliciousness) {
            map[k] = map.getOrDefault(k, 0) + 1
        }
        var result: Long = 0
        val it: MutableIterator<Map.Entry<Int, Int>> = map.entries.iterator()
        while (it.hasNext()) {
            val (key, value1) = it.next()
            val value = value1.toLong()
            for (j in 21 downTo 0) {
                val find = (1 shl j) - key
                if (find < 0) {
                    break
                }
                if (map.containsKey(find)) {
                    result += if (find == key) {
                        (value - 1) * value / 2
                    } else {
                        value * map[find]!!
                    }
                }
            }
            it.remove()
        }
        val mod = 1000000007
        return (result % mod).toInt()
    }
}
