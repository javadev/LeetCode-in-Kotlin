package g3501_3600.s3525_find_x_value_of_array_ii

// #Hard #Array #Math #Segment_Tree #2025_04_22_Time_237_ms_(50.00%)_Space_114.07_MB_(50.00%)

class Solution {
    private var k: Int = 0
    private lateinit var seg: Array<Node?>
    private lateinit var nums: IntArray

    private inner class Node {
        var prod: Int = 1 % k
        var cnt: IntArray = IntArray(k)
    }

    private fun merge(l: Node, r: Node): Node {
        val p = Node()
        p.prod = (l.prod * r.prod) % k
        if (k >= 0) {
            System.arraycopy(l.cnt, 0, p.cnt, 0, k)
        }
        for (t in 0 until k) {
            val w = (l.prod * t) % k
            p.cnt[w] += r.cnt[t]
        }
        return p
    }

    private fun build(idx: Int, l: Int, r: Int) {
        if (l == r) {
            val nd = Node()
            val v = nums[l] % k
            nd.prod = v
            nd.cnt[v] = 1
            seg[idx] = nd
        } else {
            val m = (l + r) ushr 1
            build(idx shl 1, l, m)
            build((idx shl 1) or 1, m + 1, r)
            seg[idx] = merge(seg[idx shl 1]!!, seg[(idx shl 1) or 1]!!)
        }
    }

    private fun update(idx: Int, l: Int, r: Int, pos: Int, `val`: Int) {
        if (l == r) {
            val nd = Node()
            val v = `val` % k
            nd.prod = v
            nd.cnt[v] = 1
            seg[idx] = nd
        } else {
            val m = (l + r) ushr 1
            if (pos <= m) {
                update(idx shl 1, l, m, pos, `val`)
            } else {
                update((idx shl 1) or 1, m + 1, r, pos, `val`)
            }
            seg[idx] = merge(seg[idx shl 1]!!, seg[(idx shl 1) or 1]!!)
        }
    }

    private fun query(idx: Int, l: Int, r: Int, ql: Int, qr: Int): Node {
        if (ql <= l && r <= qr) {
            return seg[idx]!!
        }
        val m = (l + r) ushr 1
        if (qr <= m) {
            return query(idx shl 1, l, m, ql, qr)
        }
        if (ql > m) {
            return query((idx shl 1) or 1, m + 1, r, ql, qr)
        }
        return merge(query(idx shl 1, l, m, ql, qr), query((idx shl 1) or 1, m + 1, r, ql, qr))
    }

    fun resultArray(nums: IntArray, k: Int, queries: Array<IntArray>): IntArray {
        val n = nums.size
        this.k = k
        this.nums = nums
        seg = arrayOfNulls(4 * n)
        build(1, 0, n - 1)
        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val idx0 = queries[i][0]
            val `val` = queries[i][1]
            val start = queries[i][2]
            val x = queries[i][3]
            update(1, 0, n - 1, idx0, `val`)
            val res = query(1, 0, n - 1, start, n - 1)
            ans[i] = res.cnt[x]
        }
        return ans
    }
}
