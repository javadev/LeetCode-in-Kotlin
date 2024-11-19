package g2201_2300.s2286_booking_concert_tickets_in_groups

// #Hard #Binary_Search #Design #Segment_Tree #Binary_Indexed_Tree
// #2023_06_28_Time_1292_ms_(100.00%)_Space_98.3_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

@Suppress("NAME_SHADOWING")
class BookMyShow(n: Int, private val m: Int) {
    private val n: Int

    // max number of seats in a row for some segment of the rows
    private val max: IntArray

    // total number of seats for some segment of the rows
    private val total: LongArray

    // number of rows with zero free places on the left and on the right
    // using this to quickly skip already zero rows
    // actual nodes are placed in [1,this.n], the first and last element only shows there the first
    // non-zero row
    private val numZerosRight: IntArray
    private val numZerosLeft: IntArray

    init {
        // make n to be a power of 2 (for simplicity)
        this.n = nextPow2(n)
        // segment tree for max number of seats in a row
        max = IntArray(this.n * 2 - 1)
        // total number of seats for a segment of the rows
        total = LongArray(this.n * 2 - 1)
        numZerosRight = IntArray(this.n + 2)
        numZerosLeft = IntArray(this.n + 2)
        // initialize max and total, for max we firstly set values to m
        // segments of size 1 are placed starting from this.n - 1
        max.fill(m, this.n - 1, this.n + n - 1)
        total.fill(m.toLong(), this.n - 1, this.n + n - 1)
        // calculate values of max and total for segments based on values of their children
        var i = this.n - 2
        var i1 = i * 2 + 1
        var i2 = i * 2 + 2
        while (i >= 0) {
            max[i] = Math.max(max[i1], max[i2])
            total[i] = total[i1] + total[i2]
            i--
            i1 -= 2
            i2 -= 2
        }
    }

    fun gather(k: Int, maxRow: Int): IntArray {
        // find most left row with enough free places
        val mostLeft = mostLeft(0, 0, n, k, maxRow + 1)
        if (mostLeft == -1) {
            return IntArray(0)
        }
        // get corresponding segment tree node
        var v = n - 1 + mostLeft
        val ans = intArrayOf(mostLeft, m - max[v])
        // update max and total for this node
        max[v] -= k
        total[v] -= k.toLong()
        // until this is a root of segment tree we update its parent
        while (v != 0) {
            v = (v - 1) / 2
            max[v] = Math.max(max[v * 2 + 1], max[v * 2 + 2])
            total[v] = total[v * 2 + 1] + total[v * 2 + 2]
        }
        return ans
    }

    private fun mostLeft(v: Int, l: Int, r: Int, k: Int, qr: Int): Int {
        if (l >= qr || max[v] < k) {
            return -1
        }
        if (l == r - 1) {
            return l
        }
        val mid = (l + r) / 2
        val left = mostLeft(v * 2 + 1, l, mid, k, qr)
        return if (left != -1) {
            left
        } else {
            mostLeft(v * 2 + 2, mid, r, k, qr)
        }
    }

    fun scatter(k: Int, maxRow: Int): Boolean {
        // find total number of free places in the rows [0; maxRow+1)
        var k = k
        val sum = total(0, 0, n, maxRow + 1)
        if (sum < k) {
            return false
        }
        var i = 0
        // to don't update parent for both of its children we use a queue
        val deque: Deque<Int> = ArrayDeque()
        while (k != 0) {
            i += numZerosRight[i] + 1
            var v = n - 1 + i - 1
            val spent = Math.min(k, max[v])
            k -= spent
            max[v] -= spent
            total[v] -= spent.toLong()
            if (max[v] == 0) {
                // update numZerosRight and numZerosLeft
                numZerosRight[i - numZerosLeft[i] - 1] += numZerosRight[i] + 1
                numZerosLeft[i + numZerosRight[i] + 1] += numZerosLeft[i] + 1
            }
            if (v != 0) {
                v = (v - 1) / 2
                // if we already have the parent node in the queue we don't need to update it
                if (deque.isEmpty() || deque.peekLast() != v) {
                    deque.addLast(v)
                }
            }
        }
        // update max and total
        while (deque.isNotEmpty()) {
            var v = deque.pollFirst()
            max[v] = Math.max(max[v * 2 + 1], max[v * 2 + 2])
            total[v] = total[v * 2 + 1] + total[v * 2 + 2]
            if (v != 0) {
                v = (v - 1) / 2
                // if we already have the parent node in the queue we don't need to update it
                if (deque.isEmpty() || deque.peekLast() != v) {
                    deque.addLast(v)
                }
            }
        }
        return true
    }

    // find sum of [ql, qr)
    private fun total(v: Int, l: Int, r: Int, qr: Int): Long {
        if (l >= qr) {
            return 0
        }
        if (r <= qr) {
            return total[v]
        }
        val mid = (l + r) / 2
        return total(v * 2 + 1, l, mid, qr) + total(v * 2 + 2, mid, r, qr)
    }

    companion object {
        private fun nextPow2(n: Int): Int {
            return if (n and n - 1 == 0) {
                n
            } else {
                Integer.highestOneBit(n) shl 1
            }
        }
    }
}
/*
 * Your BookMyShow object will be instantiated and called as such:
 * var obj = BookMyShow(n, m)
 * var param_1 = obj.gather(k,maxRow)
 * var param_2 = obj.scatter(k,maxRow)
 */
