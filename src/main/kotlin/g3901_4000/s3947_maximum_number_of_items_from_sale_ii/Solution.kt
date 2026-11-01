package g3901_4000.s3947_maximum_number_of_items_from_sale_ii

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Staff #Weekly_Contest_504
// #2026_10_20_Time_20_ms_(82.93%)_Space_231.68_MB_(87.81%)

import kotlin.math.min

class Solution {
    fun maximumSaleItems(items: Array<IntArray>, budget: Int): Int {
        var budget = budget
        val n = items.size
        val count = IntArray(n + 1)
        var min = Long.MAX_VALUE
        for (item in items) {
            count[item[0]]++
            if (item[1] < min) {
                min = item[1].toLong()
            }
        }
        val temp = IntArray(n + 1)
        for (i in 1..n) {
            if (count[i] > 0) {
                var m = -1
                var j = i
                while (j <= n) {
                    m += count[j]
                    j += i
                }
                temp[i] = m
            }
        }
        val deal = LongArray(n)
        var dealcount = 0
        val limit = min * 2
        for (item in items) {
            val first = item[0]
            val second = item[1]
            if (second < limit) {
                val m = temp[first]
                if (m > 0) {
                    deal[dealcount++] = (second.toLong() shl 32) or (m.toLong() and 0xFFFFFFFFL)
                }
            }
        }
        deal.sort(0, dealcount)
        var total: Long = 0
        for (i in 0..<dealcount) {
            val deals = deal[i]
            val m = (deals ushr 32).toInt()
            val counts = (deals and 0xFFFFFFFFL).toInt()
            if (budget >= m) {
                val time = min(counts.toLong(), (budget / m).toLong())
                budget = (budget - (time * m)).toInt()
                total += 2 * time
            }
        }
        total += budget / min
        return total.toInt()
    }
}
