package g3701_3800.s3762_minimum_operations_to_equalize_subarrays

// #Hard #Array #Math #Binary_Search #Segment_Tree #Principal #Weekly_Contest_478
// #2026_05_08_Time_528_ms_(100.00%)_Space_267.97_MB_(76.92%)

class Solution {
    private class MNode(val l: Int, val r: Int) {
        var vals: IntArray? = null
        var pref: LongArray? = null
        var left: MNode? = null
        var right: MNode? = null
    }

    private class Group {
        lateinit var pos: IntArray
        lateinit var valArray: IntArray
        lateinit var prefPos: LongArray
        var root: MNode? = null
        var minv: Int = 0
        var maxv: Int = 0
    }

    private fun lowerBound(a: IntArray, x: Int): Int {
        var l = 0
        var r = a.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (a[m] >= x) {
                r = m
            } else {
                l = m + 1
            }
        }
        return l
    }

    private fun upperBound(a: IntArray, x: Int): Int {
        var l = 0
        var r = a.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (a[m] > x) {
                r = m
            } else {
                l = m + 1
            }
        }
        return l
    }

    private fun buildMerge(arr: IntArray, l: Int, r: Int): MNode {
        val node = MNode(l, r)
        if (l == r) {
            node.vals = intArrayOf(arr[l])
            node.pref = longArrayOf(arr[l].toLong())
            return node
        }
        val m = (l + r) ushr 1
        node.left = buildMerge(arr, l, m)
        node.right = buildMerge(arr, m + 1, r)

        val a = node.left!!.vals!!
        val b = node.right!!.vals!!
        val na = a.size
        val nb = b.size
        val c = IntArray(na + nb)
        val pref = LongArray(na + nb)

        var ia = 0
        var ib = 0
        var k = 0
        while (ia < na && ib < nb) {
            if (a[ia] <= b[ib]) {
                c[k++] = a[ia++]
            } else {
                c[k++] = b[ib++]
            }
        }
        while (ia < na) {
            c[k++] = a[ia++]
        }
        while (ib < nb) {
            c[k++] = b[ib++]
        }
        pref[0] = c[0].toLong()
        for (i in 1 until c.size) {
            pref[i] = pref[i - 1] + c[i]
        }
        node.vals = c
        node.pref = pref
        return node
    }

    private fun countLE(node: MNode?, ql: Int, qr: Int, x: Int): Int {
        if (node == null || ql > node.r || qr < node.l) {
            return 0
        }
        if (ql <= node.l && node.r <= qr) {
            val idx = upperBound(node.vals!!, x) - 1
            return if (idx < 0) 0 else idx + 1
        }
        return countLE(node.left, ql, qr, x) + countLE(node.right, ql, qr, x)
    }

    private fun sumLE(node: MNode?, ql: Int, qr: Int, x: Int): Long {
        if (node == null || ql > node.r || qr < node.l) {
            return 0L
        }
        if (ql <= node.l && node.r <= qr) {
            val idx = upperBound(node.vals!!, x) - 1
            return if (idx < 0) 0L else node.pref!![idx]
        }
        return sumLE(node.left, ql, qr, x) + sumLE(node.right, ql, qr, x)
    }

    fun minOperations(nums: IntArray, k: Int, queries: Array<IntArray>): LongArray {
        val groupHashMap = buildGroups(nums, k)
        val ans = LongArray(queries.size)
        for (qi in queries.indices) {
            ans[qi] = processQuery(nums, queries[qi], groupHashMap, k)
        }
        return ans
    }

    private fun buildGroups(nums: IntArray, k: Int): Map<Int, Group> {
        val map = HashMap<Int, ArrayList<IntArray>>()
        for (i in nums.indices) {
            val rem = nums[i] % k
            val value = nums[i] / k
            map.computeIfAbsent(rem) { ArrayList() }.add(intArrayOf(i, value))
        }
        val groupHashMap = HashMap<Int, Group>()
        for ((key, value) in map) {
            groupHashMap[key] = createGroup(value)
        }
        return groupHashMap
    }

    private fun createGroup(arr: ArrayList<IntArray>): Group {
        arr.sortBy { it[0] }
        val size = arr.size
        val pos = IntArray(size)
        val values = IntArray(size)
        val prefPos = LongArray(size)
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (i in 0 until size) {
            pos[i] = arr[i][0]
            values[i] = arr[i][1]
            min = Math.min(min, values[i])
            max = Math.max(max, values[i])
            prefPos[i] = if (i == 0) values[i].toLong() else prefPos[i - 1] + values[i]
        }
        val group = Group()
        group.pos = pos
        group.valArray = values
        group.prefPos = prefPos
        group.minv = min
        group.maxv = max
        if (size > 0) {
            group.root = buildMerge(values, 0, size - 1)
        }
        return group
    }

    private fun processQuery(nums: IntArray, query: IntArray, groupHashMap: Map<Int, Group>, k: Int): Long {
        val left = query[0]
        val right = query[1]
        val rem = nums[left] % k
        val group = groupHashMap[rem] ?: return -1
        val l = lowerBound(group.pos, left)
        val r = upperBound(group.pos, right) - 1
        if (!isValidRange(left, right, l, r)) {
            return -1
        }
        return calculateOperations(group, l, r)
    }

    private fun isValidRange(left: Int, right: Int, l: Int, r: Int): Boolean = l <= r && (r - l + 1 == right - left + 1)

    private fun calculateOperations(group: Group, l: Int, r: Int): Long {
        val count = r - l + 1
        val median = findMedian(group, l, r, count)
        val leftCount = countLE(group.root, l, r, median)
        val leftSum = sumLE(group.root, l, r, median)
        val total = group.prefPos[r] - if (l == 0) 0L else group.prefPos[l - 1]
        val rightSum = total - leftSum
        val rightCount = count - leftCount
        return median.toLong() * leftCount - leftSum + rightSum - median.toLong() * rightCount
    }

    private fun findMedian(group: Group, l: Int, r: Int, count: Int): Int {
        val need = (count + 1) / 2
        var low = group.minv
        var high = group.maxv
        while (low < high) {
            val mid = low + ((high - low) ushr 1)
            val currentCount = countLE(group.root, l, r, mid)
            if (currentCount >= need) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }
}
