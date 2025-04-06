package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii

// #Hard #2025_04_06_Time_291_ms_(100.00%)_Space_84.49_MB_(100.00%)

class Solution {
    fun minimumPairRemoval(nums: IntArray): Int {
        val n = nums.size
        val lst = LST(n)
        lst.setRange(n)
        var dec = 0
        val a = LongArray(nums.size)
        for (i in 0..<n) {
            a[i] = nums[i].toLong()
        }
        for (i in 0..<n - 1) {
            if (a[i] > a[i + 1]) {
                dec++
            }
        }
        val h = MinHeapL(n)
        for (i in 0..<n - 1) {
            h.add(i, (a[i + 1] + a[i]), i.toLong())
        }
        var step = 0
        while (dec > 0) {
            step++
            val arg = h.argmin()
            h.remove(arg)
            val r = lst.next(arg + 1)
            assert(r != -1)
            h.remove(r)
            val ll = lst.prev(arg - 1)
            val rr = lst.next(r + 1)
            if (a[arg] > a[r]) {
                dec--
            }
            if (ll >= 0 && a[ll] > a[arg]) {
                dec--
            }
            if (rr != -1 && a[r] > a[rr]) {
                dec--
            }
            a[arg] += a[r]
            a[r] = 0
            lst.unset(r)
            if (ll >= 0) {
                if (a[ll] > a[arg]) {
                    dec++
                }
                h.update(ll, (a[ll] + a[arg]), ll.toLong())
            }
            if (rr != -1) {
                if (a[arg] > a[rr]) {
                    dec++
                }
                h.update(arg, (a[arg] + a[rr]), arg.toLong())
            }
        }
        return step
    }

    class MinHeapL(m: Int) {
        var hi: LongArray
        var lo: LongArray
        var map: IntArray
        var imap: IntArray
        var n: Int
        var pos: Int

        init {
            n = Integer.highestOneBit((m + 1) shl 1)
            hi = LongArray(n)
            lo = LongArray(n)
            map = IntArray(n)
            imap = IntArray(n)
            hi.fill(INF)
            lo.fill(INF)
            map.fill(-1)
            imap.fill(-1)
            pos = 1
        }

        fun add(ind: Int, hiValue: Long, loValue: Long) {
            if (imap[ind] < 0) {
                hi[pos] = hiValue
                lo[pos] = loValue
                map[pos] = ind
                imap[ind] = pos
                pos++
                up(pos - 1)
            }
        }

        fun update(ind: Int, hiValue: Long, loValue: Long) {
            if (imap[ind] < 0) {
                hi[pos] = hiValue
                lo[pos] = loValue
                map[pos] = ind
                imap[ind] = pos
                pos++
                up(pos - 1)
            } else {
                val p = imap[ind]
                hi[p] = hiValue
                lo[p] = loValue
                up(p)
                down(p)
            }
        }

        fun remove(ind: Int): Long {
            if (pos == 1) {
                return INF
            }
            if (imap[ind] == -1) {
                return INF
            }
            val rem = imap[ind]
            val ret = hi[rem]
            pos--
            hi[rem] = hi[pos]
            lo[rem] = lo[pos]
            val movedInd = map[pos]
            map[rem] = movedInd
            imap[movedInd] = rem
            hi[pos] = INF
            lo[pos] = INF
            map[pos] = -1
            imap[ind] = -1
            up(rem)
            down(rem)
            return ret
        }

        fun min(): Long {
            return hi[1]
        }

        fun argmin(): Int {
            return map[1]
        }

        fun size(): Int {
            return pos - 1
        }

        fun get(ind: Int): Long {
            return hi[imap[ind]]
        }

        private fun up(cur: Int) {
            var c = cur
            var p = c ushr 1
            while (p >= 1) {
                if (compare(p, c) > 0) {
                    swap(p, c)
                } else {
                    break
                }
                c = p
                p = c ushr 1
            }
        }

        private fun down(cur: Int) {
            var c = cur
            while (2 * c < pos) {
                var child = 2 * c
                if (child + 1 < pos && compare(child, child + 1) > 0) {
                    child++
                }
                if (compare(c, child) > 0) {
                    swap(c, child)
                    c = child
                } else {
                    break
                }
            }
        }

        private fun compare(i: Int, j: Int): Int {
            if (hi[i] != hi[j]) {
                return hi[i].compareTo(hi[j])
            } else {
                return lo[i].compareTo(lo[j])
            }
        }

        private fun swap(i: Int, j: Int) {
            val tmpHi = hi[i]
            hi[i] = hi[j]
            hi[j] = tmpHi
            val tmpLo = lo[i]
            lo[i] = lo[j]
            lo[j] = tmpLo
            val tmpMap = map[i]
            map[i] = map[j]
            map[j] = tmpMap
            imap[map[i]] = i
            imap[map[j]] = j
        }

        companion object {
            val INF: Long = Long.Companion.MAX_VALUE
        }
    }

    private class LST(var n: Int) {
        var set: Array<LongArray?>

        init {
            var d = 1
            run {
                var m = n
                while (m > 1) {
                    m = m ushr 6
                    d++
                }
            }

            set = arrayOfNulls<LongArray>(d)
            var i = 0
            var m = n ushr 6
            while (i < d) {
                set[i] = LongArray(m + 1)
                i++
                m = m ushr 6
            }
        }

        fun setRange(r: Int) {
            var r = r
            var i = 0
            while (i < set.size) {
                for (j in 0..<(r ushr 6)) {
                    set[i]!![j] = -1L
                }
                if ((r and 63) != 0) {
                    set[i]!![r ushr 6] = set[i]!![r ushr 6] or (1L shl r) - 1
                }
                i++
                r = r + 63 ushr 6
            }
        }

        fun unset(pos: Int) {
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
        }

        fun prev(pos: Int): Int {
            var pos = pos
            var i = 0
            while (i < set.size && pos >= 0) {
                val pre = prevValue(set[i]!![pos ushr 6], pos and 63)
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

        fun next(pos: Int): Int {
            var pos = pos
            var i = 0
            while (i < set.size && pos ushr 6 < set[i]!!.size) {
                val nex = nextValue(set[i]!![pos ushr 6], pos and 63)
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

        fun prevValue(set: Long, n: Int): Int {
            val h = set shl n.inv()
            if (h == 0L) {
                return -1
            }
            return -java.lang.Long.numberOfLeadingZeros(h) + n
        }

        fun nextValue(set: Long, n: Int): Int {
            val h = set ushr n
            if (h == 0L) {
                return -1
            }
            return java.lang.Long.numberOfTrailingZeros(h) + n
        }

        override fun toString(): String {
            val list: MutableList<Int?> = ArrayList<Int?>()
            var pos = next(0)
            while (pos != -1) {
                list.add(pos)
                pos = next(pos + 1)
            }
            return list.toString()
        }
    }
}
