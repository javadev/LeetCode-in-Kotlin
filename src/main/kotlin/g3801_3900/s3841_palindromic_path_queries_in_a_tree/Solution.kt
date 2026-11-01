package g3801_3900.s3841_palindromic_path_queries_in_a_tree

// #Hard #Array #String #Depth_First_Search #Tree #Bit_Manipulation #Divide_and_Conquer
// #Segment_Tree #Principal #Biweekly_Contest_176
// #2026_07_22_Time_65_ms_(100.00%)_Space_185.61_MB_(96.67%)

class Solution {
    private lateinit var head: IntArray
    private lateinit var to: IntArray
    private lateinit var next: IntArray
    private lateinit var lift: Array<IntArray>
    private lateinit var first: IntArray
    private lateinit var last: IntArray
    private lateinit var depth: IntArray
    private var time = 0
    private var maxPower = 0

    fun palindromePath(n: Int, edges: Array<IntArray>, s: String, queries: Array<String>): MutableList<Boolean> {
        this.first = IntArray(n)
        this.last = IntArray(n)
        this.maxPower = 31 - Integer.numberOfLeadingZeros(n)
        this.depth = IntArray(n)
        this.lift = Array<IntArray>(maxPower + 1) { IntArray(n) }
        val m = edges.size
        this.head = IntArray(n)
        this.to = IntArray(m shl 1)
        this.next = IntArray(m shl 1)
        head.fill(-1)
        for (i in 0..<m) {
            val a = edges[i][0]
            val b = edges[i][1]
            to[i shl 1] = b
            next[i shl 1] = head[a]
            head[a] = i shl 1
            to[i shl 1 or 1] = a
            next[i shl 1 or 1] = head[b]
            head[b] = i shl 1 or 1
        }
        dfs(0, -1)
        val bit = BIT(n + 1)
        val arr = s.toCharArray()
        for (i in 0..<n) {
            bit.update(first[i], 1 shl arr[i].code - 'a'.code)
            bit.update(last[i] + 1, 1 shl arr[i].code - 'a'.code)
        }
        val list = ArrayList<Boolean>(queries.size)
        for (query in queries) {
            if (query[0] == 'u') {
                val i = query.substring(7, query.length - 2).toInt()
                val c = query[query.length - 1]
                if (c == arr[i]) {
                    continue
                }
                val filter = 1 shl arr[i].code - 'a'.code or (1 shl c.code - 'a'.code)
                bit.update(first[i], filter)
                arr[i] = c
                bit.update(last[i] + 1, filter)
            } else {
                val i1 = query.indexOf(' ')
                val i2 = query.lastIndexOf(' ')
                val a = query.substring(i1 + 1, i2).toInt()
                val b = query.substring(i2 + 1).toInt()
                val r = bit.query(first[a]) xor bit.query(first[b]) xor (1 shl arr[lca(a, b)].code - 'a'.code)
                list.add((r and r - 1) == 0)
            }
        }
        return list
    }

    private fun lca(a: Int, b: Int): Int {
        var a = a
        var b = b
        if (depth[a] > depth[b]) {
            val temp = a
            a = b
            b = temp
        }
        if (first[a] <= first[b] && last[a] >= last[b]) {
            return a
        }
        var diff = depth[b] - depth[a]
        run {
            var i = maxPower
            while (diff != 0) {
                if (diff >= 1 shl i) {
                    b = lift[i][b]
                    diff -= 1 shl i
                }
                --i
            }
        }
        if (a == b) {
            return a
        }
        for (i in maxPower downTo 0) {
            if (lift[i][a] != lift[i][b]) {
                a = lift[i][a]
                b = lift[i][b]
            }
        }
        return lift[0][a]
    }

    private fun dfs(index: Int, prev: Int) {
        first[index] = ++time
        var x = head[index]
        while (x != -1) {
            val nextIndex = to[x]
            if (nextIndex == prev) {
                x = next[x]
                continue
            }
            depth[nextIndex] = depth[index] + 1
            lift[0][nextIndex] = index
            var i = 1
            while ((1 shl i) < depth[nextIndex]) {
                lift[i][nextIndex] = lift[i - 1][lift[i - 1][nextIndex]]
                i++
            }
            dfs(nextIndex, index)
            x = next[x]
        }
        last[index] = time
    }

    private class BIT(private val n: Int) {
        private val ints: IntArray = IntArray(n + 1)

        fun update(index: Int, `val`: Int) {
            var i = index + 1
            while (i <= n) {
                ints[i] = ints[i] xor `val`
                i += i and -i
            }
        }

        fun query(index: Int): Int {
            var ans = 0
            var i = index + 1
            while (i > 0) {
                ans = ans xor ints[i]
                i -= i and -i
            }
            return ans
        }
    }
}
