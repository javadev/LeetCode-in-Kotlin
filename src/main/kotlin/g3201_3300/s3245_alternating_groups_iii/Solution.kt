package g3201_3300.s3245_alternating_groups_iii

// #Hard #Array #Binary_Indexed_Tree #2024_08_07_Time_1072_ms_(100.00%)_Space_97.6_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun go(ind: Int, lst: LST, fs: IntArray, n: Int, ff: LST, c: IntArray) {
        if (ind > 0) {
            val pre = lst.prev(ind - 1)
            var nex = lst.next(pre + 1)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre)
            }
        }
        if (lst.get(ind)) {
            val pre = ind
            var nex = lst.next(ind + 1)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre)
            }
        }
        if (lst.get(ind + 1)) {
            val pre = ind + 1
            var nex = lst.next(ind + 2)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre != -1 && pre < n && --fs[nex - pre] == 0) {
                ff.unsetPos(nex - pre)
            }
        }
        lst.unsetPos(ind)
        lst.unsetPos(ind + 1)
        c[ind] = c[ind] xor 1
        if (ind > 0 && c[ind] != c[ind - 1]) {
            lst.setPos(ind)
        }
        if (ind + 1 < c.size && c[ind + 1] != c[ind]) {
            lst.setPos(ind + 1)
        }
        if (ind > 0) {
            val pre = lst.prev(ind - 1)
            var nex = lst.next(pre + 1)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre != -1 && pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre)
            }
        }
        if (lst.get(ind)) {
            val pre = ind
            var nex = lst.next(ind + 1)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre)
            }
        }
        if (lst.get(ind + 1)) {
            val pre = ind + 1
            var nex = lst.next(ind + 2)
            if (nex == -1) {
                nex = 2 * n
            }
            if (pre < n && ++fs[nex - pre] == 1) {
                ff.setPos(nex - pre)
            }
        }
    }

    fun numberOfAlternatingGroups(colors: IntArray, queries: Array<IntArray>): List<Int> {
        val n = colors.size
        val c = IntArray(2 * n)
        for (i in 0 until 2 * n) {
            c[i] = colors[i % n] xor (if (i % 2 == 0) 0 else 1)
        }
        val lst = LST(2 * n + 3)
        for (i in 1 until 2 * n) {
            if (c[i] != c[i - 1]) {
                lst.setPos(i)
            }
        }
        val fs = IntArray(2 * n + 1)
        val ff = LST(2 * n + 1)
        for (i in 0 until n) {
            if (lst.get(i)) {
                var ne = lst.next(i + 1)
                if (ne == -1) {
                    ne = 2 * n
                }
                fs[ne - i]++
                ff.setPos(ne - i)
            }
        }
        val ans: MutableList<Int> = ArrayList()
        for (q in queries) {
            if (q[0] == 1) {
                if (lst.next(0) == -1) {
                    ans.add(n)
                } else {
                    var lans = 0
                    var i = ff.next(q[1])
                    while (i != -1) {
                        lans += (i - q[1] + 1) * fs[i]
                        i = ff.next(i + 1)
                    }
                    if (c[2 * n - 1] != c[0]) {
                        val f = lst.next(0)
                        if (f >= q[1]) {
                            lans += (f - q[1] + 1)
                        }
                    }
                    ans.add(lans)
                }
            } else {
                val ind = q[1]
                val `val` = q[2]
                if (colors[ind] == `val`) {
                    continue
                }
                colors[ind] = colors[ind] xor 1
                go(ind, lst, fs, n, ff, c)
                go(ind + n, lst, fs, n, ff, c)
            }
        }
        return ans
    }

    private class LST(private val n: Int) {
        private val set: Array<LongArray?>

        init {
            var d = 1
            d = getD(n, d)
            set = arrayOfNulls(d)
            var i = 0
            var m = n ushr 6
            while (i < d) {
                set[i] = LongArray(m + 1)
                i++
                m = m ushr 6
            }
        }

        private fun getD(n: Int, d: Int): Int {
            var d = d
            var m = n
            while (m > 1) {
                m = m ushr 6
                d++
            }
            return d
        }

        fun setPos(pos: Int): LST {
            var pos = pos
            if (pos >= 0 && pos < n) {
                var i = 0
                while (i < set.size) {
                    set[i]!![pos ushr 6] = set[i]!![pos ushr 6] or (1L shl pos)
                    i++
                    pos = pos ushr 6
                }
            }
            return this
        }

        fun unsetPos(pos: Int): LST {
            var pos = pos
            if (pos >= 0 && pos < n) {
                var i = 0
                while (i < set.size && (i == 0 || set[i - 1]!![pos] == 0L)
                ) {
                    set[i]!![pos ushr 6] = set[i]!![pos ushr 6] and (1L shl pos).inv()
                    i++
                    pos = pos ushr 6
                }
            }
            return this
        }

        fun get(pos: Int): Boolean {
            return pos >= 0 && pos < n && set[0]!![pos ushr 6] shl pos.inv() < 0
        }

        fun prev(pos: Int): Int {
            var pos = pos
            var i = 0
            while (i < set.size && pos >= 0) {
                val pre = prev(set[i]!![pos ushr 6], pos and 63)
                if (pre != -1) {
                    pos = pos ushr 6 shl 6 or pre
                    while (i > 0) {
                        pos = pos shl 6 or 63 - java.lang.Long.numberOfLeadingZeros(set[--i]!![pos])
                    }
                    return pos
                }
                i++
                pos = pos ushr 6
                pos--
            }
            return -1
        }

        private fun prev(set: Long, n: Int): Int {
            val h = set shl n.inv()
            if (h == 0L) {
                return -1
            }
            return -java.lang.Long.numberOfLeadingZeros(h) + n
        }

        fun next(pos: Int): Int {
            var pos = pos
            var i = 0
            while (i < set.size && pos ushr 6 < set[i]!!.size) {
                val nex = next(set[i]!![pos ushr 6], pos and 63)
                if (nex != -1) {
                    pos = pos ushr 6 shl 6 or nex
                    while (i > 0) {
                        pos = pos shl 6 or java.lang.Long.numberOfTrailingZeros(set[--i]!![pos])
                    }
                    return pos
                }
                i++
                pos = pos ushr 6
                pos++
            }
            return -1
        }

        override fun toString(): String {
            val list: MutableList<Int> = ArrayList()
            var pos = next(0)
            while (pos != -1) {
                list.add(pos)
                pos = next(pos + 1)
            }
            return list.toString()
        }

        companion object {
            private fun next(set: Long, n: Int): Int {
                val h = set ushr n
                if (h == 0L) {
                    return -1
                }
                return java.lang.Long.numberOfTrailingZeros(h) + n
            }
        }
    }
}
