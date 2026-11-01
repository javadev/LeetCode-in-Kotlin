package g3901_4000.s3943_number_of_pairs_after_increment

// #Hard #Array #Hash_Table #Counting #Divide_and_Conquer #Senior_Staff #Weekly_Contest_503
// #2026_09_29_Time_233_ms_(98.11%)_Space_189.48_MB_(39.62%)

class Solution {
    private lateinit var cache: HashMap<Long, Long>

    private fun update(nums2: LongArray, l: Int, r: Int, `val`: Long) {
        if (r < l) {
            return
        }
        for (i in l..r) {
            val oldValue = nums2[i]
            val newValue = nums2[i] + `val`
            cache[oldValue] = cache.getOrDefault(oldValue, 0L) - 1
            cache[newValue] = cache.getOrDefault(newValue, 0L) + 1
            nums2[i] = newValue
        }
    }

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, queries: Array<IntArray>): IntArray {
        val n2 = initialize(nums2)
        var globalOffset: Long = 0
        val answers: MutableList<Int> = ArrayList<Int>()
        var q = 0
        while (q < queries.size) {
            val result = processQuery(q, queries, nums1, n2, globalOffset)
            q = result.nextIndex
            globalOffset = result.globalOffset
            if (result.answer != null) {
                answers.add(result.answer)
            }
        }
        return toArray(answers)
    }

    private fun initialize(nums2: IntArray): LongArray {
        cache = HashMap<Long, Long>()
        val result = LongArray(nums2.size)
        for (i in nums2.indices) {
            result[i] = nums2[i].toLong()
            incrementCount(result[i])
        }
        return result
    }

    private fun incrementCount(value: Long) {
        cache[value] = cache.getOrDefault(value, 0L) + 1
    }

    private fun processQuery(
        index: Int,
        queries: Array<IntArray>,
        nums1: IntArray,
        nums2: LongArray,
        globalOffset: Long,
    ): QueryResult {
        val query = queries[index]
        if (query[0] == 1) {
            return processUpdateQuery(index, queries, nums2, globalOffset)
        }
        val answer = countPairs(nums1, query[1].toLong(), globalOffset)
        return QueryResult(index + 1, globalOffset, answer)
    }

    private fun processUpdateQuery(
        index: Int,
        queries: Array<IntArray>,
        nums2: LongArray,
        globalOffset: Long,
    ): QueryResult {
        var globalOffset = globalOffset
        val query = queries[index]
        val l = query[1]
        val r = query[2]
        var `val` = query[3].toLong()
        var nextIndex = index + 1
        while (nextIndex < queries.size && hasSameRange(queries[nextIndex], l, r)) {
            `val` += queries[nextIndex][3].toLong()
            nextIndex++
        }
        globalOffset = applyUpdate(nums2, l, r, `val`, globalOffset)
        return QueryResult(nextIndex, globalOffset, null)
    }

    private fun hasSameRange(query: IntArray, l: Int, r: Int): Boolean =
        query.size == 4 && query[1] == l && query[2] == r

    private fun applyUpdate(nums2: LongArray, l: Int, r: Int, `val`: Long, globalOffset: Long): Long {
        val length = r - l + 1
        if (length <= nums2.size / 2) {
            update(nums2, l, r, `val`)
            return globalOffset
        }
        update(nums2, 0, l - 1, -`val`)
        update(nums2, r + 1, nums2.size - 1, -`val`)
        return globalOffset + `val`
    }

    private fun countPairs(nums1: IntArray, target: Long, globalOffset: Long): Int {
        var totalPairs: Long = 0
        for (num1 in nums1) {
            val num2 = target - num1 - globalOffset
            totalPairs += cache.getOrDefault(num2, 0L)
        }
        return totalPairs.toInt()
    }

    private fun toArray(answers: MutableList<Int>): IntArray {
        val result = IntArray(answers.size)
        for (i in answers.indices) {
            result[i] = answers[i]
        }
        return result
    }

    private class QueryResult(val nextIndex: Int, val globalOffset: Long, val answer: Int?)
}
