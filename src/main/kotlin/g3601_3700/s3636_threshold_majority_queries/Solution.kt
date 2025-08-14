package g3601_3700.s3636_threshold_majority_queries

// #Hard #Array #Hash_Table #Binary_Search #Prefix_Sum #Counting #Divide_and_Conquer
// #Biweekly_Contest_162 #2025_08_03_Time_848_ms_(100.00%)_Space_99.90_MB_(100.00%)

import java.util.TreeSet
import kotlin.math.max
import kotlin.math.sqrt

internal class Solution {
    private class FreqPair(var count: Int, var value: Int) : Comparable<FreqPair?> {
        override fun compareTo(other: FreqPair?): Int {
            if (this.count != other?.count) {
                return this.count.compareTo(other?.count ?: 0)
            }
            return other.value.compareTo(this.value)
        }
    }

    private class Query(var l: Int, var r: Int, var originalIndex: Int)

    private lateinit var nums: IntArray
    private var counts: MutableMap<Int, Int> = mutableMapOf()
    private var sortedFrequencies: TreeSet<FreqPair>? = null

    private fun add(pos: Int) {
        val `val` = this.nums[pos]
        val oldCount = this.counts.getOrDefault(`val`, 0)
        if (oldCount > 0) {
            this.sortedFrequencies!!.remove(FreqPair(oldCount, `val`))
        }
        val newCount = oldCount + 1
        this.counts.put(`val`, newCount)
        this.sortedFrequencies!!.add(FreqPair(newCount, `val`))
    }

    private fun remove(pos: Int) {
        val `val` = this.nums[pos]
        val oldCount: Int = this.counts[`val`]!!
        this.sortedFrequencies!!.remove(FreqPair(oldCount, `val`))
        val newCount = oldCount - 1
        if (newCount > 0) {
            this.counts.put(`val`, newCount)
            this.sortedFrequencies!!.add(FreqPair(newCount, `val`))
        } else {
            this.counts.remove(`val`)
        }
    }

    fun subarrayMajority(nums: IntArray, queries: Array<IntArray>): IntArray {
        this.nums = nums
        this.counts = HashMap()
        this.sortedFrequencies = TreeSet<FreqPair>()
        val n = nums.size
        val qLen = queries.size
        val queryList: MutableList<Query> = ArrayList()
        val thresholds = IntArray(qLen)
        for (i in 0..<qLen) {
            queryList.add(Query(queries[i][0], queries[i][1], i))
            thresholds[i] = queries[i][2]
        }
        var blockSize = 1
        if (qLen > 0) {
            blockSize = max(1, (n / sqrt(qLen.toDouble())).toInt())
        }
        val finalBlockSize = blockSize
        queryList.sortWith { a: Query?, b: Query? ->
            val blockA = a!!.l / finalBlockSize
            val blockB = b!!.l / finalBlockSize
            if (blockA != blockB) {
                return@sortWith blockA.compareTo(blockB)
            }
            return@sortWith if ((blockA % 2) == 1) {
                b.r.compareTo(a.r)
            } else {
                a.r.compareTo(b.r)
            }
        }
        val ans = IntArray(qLen)
        var currentL = 0
        var currentR = -1
        for (q in queryList) {
            while (currentL > q.l) {
                add(--currentL)
            }
            while (currentR < q.r) {
                add(++currentR)
            }
            while (currentL < q.l) {
                remove(currentL++)
            }
            while (currentR > q.r) {
                remove(currentR--)
            }
            if (sortedFrequencies!!.isEmpty()) {
                ans[q.originalIndex] = -1
            } else {
                val mostFrequent = sortedFrequencies!!.last()
                if (mostFrequent.count >= thresholds[q.originalIndex]) {
                    ans[q.originalIndex] = mostFrequent.value
                } else {
                    ans[q.originalIndex] = -1
                }
            }
        }
        return ans
    }
}
