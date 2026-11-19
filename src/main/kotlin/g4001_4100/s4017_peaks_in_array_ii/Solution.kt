package g4001_4100.s4017_peaks_in_array_ii

// #Hard #Array #Divide_and_Conquer #Segment_Tree #Senior_Staff #Weekly_Contest_514
// #2026_11_19_Time_139_ms_(92.31%)_Space_193.66_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private lateinit var cnt: IntArray
    private lateinit var first: IntArray
    private lateinit var last: IntArray
    private lateinit var inner: LongArray
    private var qCnt = 0
    private var qFirst = 0
    private var qLast = 0
    private var qInner: Long = 0

    fun countOfPeaks(nums: IntArray, queries: Array<IntArray>): LongArray {
        val n = nums.size
        var type1Count = 0
        for (q in queries) {
            if (q[0] == 1) {
                type1Count++
            }
        }
        val ans = LongArray(type1Count)
        if (n < 3) {
            return ans
        }
        val m = n - 2
        cnt = IntArray(4 * m)
        first = IntArray(4 * m)
        last = IntArray(4 * m)
        inner = LongArray(4 * m)
        build(1, 1, m, nums)
        var ansIdx = 0
        for (q in queries) {
            if (q[0] == 1) {
                val l = q[1]
                val r = q[2]
                if (r - l + 1 < 3) {
                    ans[ansIdx++] = 0L
                } else {
                    qCnt = 0
                    qFirst = -1
                    qLast = -1
                    qInner = 0L
                    query(1, 1, m, l + 1, r - 1)
                    if (qCnt == 0) {
                        ans[ansIdx++] = 0L
                    } else {
                        val totalSub = tri(r.toLong() - l + 1)
                        val leftLen = qFirst.toLong() - l + 1
                        val rightLen = r.toLong() - qLast + 1
                        val nonPeak = (tri(leftLen) - 1L) + qInner + tri(rightLen)
                        ans[ansIdx++] = totalSub - nonPeak
                    }
                }
            } else {
                val idx = q[1]
                nums[idx] = q[2]
                val start = max(1, idx - 1)
                val end = min(m, idx + 1)
                for (pos in start..end) {
                    update(1, 1, m, pos, isPeak(nums, pos))
                }
            }
        }
        return ans
    }

    private fun isPeak(nums: IntArray, i: Int): Boolean = nums[i] > nums[i - 1] && nums[i] > nums[i + 1]

    private fun tri(len: Long): Long = len * (len + 1L) / 2L

    private fun build(node: Int, tl: Int, tr: Int, nums: IntArray) {
        if (tl == tr) {
            if (isPeak(nums, tl)) {
                cnt[node] = 1
                first[node] = tl
                last[node] = tl
            } else {
                first[node] = -1
                last[node] = -1
            }
            return
        }
        val mid = (tl + tr) ushr 1
        build(node shl 1, tl, mid, nums)
        build(node shl 1 or 1, mid + 1, tr, nums)
        pull(node)
    }

    private fun update(node: Int, tl: Int, tr: Int, pos: Int, peak: Boolean) {
        if (tl == tr) {
            if (peak) {
                cnt[node] = 1
                first[node] = tl
                last[node] = tl
            } else {
                cnt[node] = 0
                first[node] = -1
                last[node] = -1
            }
            inner[node] = 0L
            return
        }
        val mid = (tl + tr) ushr 1
        if (pos <= mid) {
            update(node shl 1, tl, mid, pos, peak)
        } else {
            update(node shl 1 or 1, mid + 1, tr, pos, peak)
        }
        pull(node)
    }

    private fun pull(node: Int) {
        val lc = node shl 1
        val rc = node shl 1 or 1
        if (cnt[lc] == 0) {
            cnt[node] = cnt[rc]
            first[node] = first[rc]
            last[node] = last[rc]
            inner[node] = inner[rc]
        } else if (cnt[rc] == 0) {
            cnt[node] = cnt[lc]
            first[node] = first[lc]
            last[node] = last[lc]
            inner[node] = inner[lc]
        } else {
            cnt[node] = cnt[lc] + cnt[rc]
            first[node] = first[lc]
            last[node] = last[rc]
            val gap = first[rc].toLong() - last[lc] + 1L
            inner[node] = inner[lc] + inner[rc] + tri(gap) - 1L
        }
    }

    private fun query(node: Int, tl: Int, tr: Int, ql: Int, qr: Int) {
        if (ql <= tl && tr <= qr) {
            if (cnt[node] == 0) {
                return
            }
            if (qCnt == 0) {
                qCnt = cnt[node]
                qFirst = first[node]
                qLast = last[node]
                qInner = inner[node]
            } else {
                val gap = first[node].toLong() - qLast + 1L
                qInner += inner[node] + tri(gap) - 1L
                qCnt += cnt[node]
                qLast = last[node]
            }
            return
        }
        val mid = (tl + tr) ushr 1
        if (ql <= mid) {
            query(node shl 1, tl, mid, ql, qr)
        }
        if (qr > mid) {
            query(node shl 1 or 1, mid + 1, tr, ql, qr)
        }
    }
}
