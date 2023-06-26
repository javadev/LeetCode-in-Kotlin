package g2001_2100.s2070_most_beautiful_item_for_each_query

// #Medium #Array #Sorting #Binary_Search #2023_06_26_Time_747_ms_(100.00%)_Space_100.9_MB_(100.00%)

class Solution {
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        val res = IntArray(queries.size)
        items.sortWith(compareBy { a: IntArray -> a[1] })
        for (i in res.indices) {
            res[i] = maxBeauty(items, queries[i])
        }
        return res
    }

    private fun maxBeauty(items: Array<IntArray>, query: Int): Int {
        for (i in items.indices.reversed()) {
            val price = items[i][0]
            val beauty = items[i][1]
            if (price <= query) {
                return beauty
            }
        }
        return 0
    }
}
