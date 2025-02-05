package g3401_3500.s3441_minimum_cost_good_caption

// #Hard #String #Dynamic_Programming #2025_02_05_Time_78_(100.00%)_Space_51.28_(100.00%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minCostGoodCaption(caption: String): String {
        val n = caption.length
        if (n < 3) {
            return ""
        }
        val arr = caption.toCharArray()
        val prefixCost = Array<IntArray?>(n + 1) { IntArray(26) }
        for (i in 0..<n) {
            val orig = arr[i].code - 'a'.code
            for (c in 0..25) {
                prefixCost[i + 1]!![c] = prefixCost[i]!![c] + abs((orig - c))
            }
        }
        val dp = IntArray(n + 1)
        val nextIndex = IntArray(n + 1)
        val nextChar = IntArray(n + 1)
        val blockLen = IntArray(n + 1)
        for (i in 0..<n) {
            dp[i] = INF
            nextIndex[i] = -1
            nextChar[i] = -1
            blockLen[i] = 0
        }
        dp[n] = 0
        for (i in n - 1 downTo 0) {
            for (l in 3..5) {
                if (i + l <= n) {
                    var bestLetter = 0
                    var bestCost: Int = INF
                    for (c in 0..25) {
                        val costBlock = prefixCost[i + l]!![c] - prefixCost[i]!![c]
                        if (costBlock < bestCost) {
                            bestCost = costBlock
                            bestLetter = c
                        }
                    }
                    val costCandidate = dp[i + l] + bestCost
                    if (costCandidate < dp[i]) {
                        dp[i] = costCandidate
                        nextIndex[i] = i + l
                        nextChar[i] = bestLetter
                        blockLen[i] = l
                    } else if (costCandidate == dp[i]) {
                        val cmp =
                            compareSolutions(
                                nextChar[i],
                                blockLen[i],
                                nextIndex[i],
                                bestLetter,
                                l,
                                (i + l),
                                nextIndex,
                                nextChar,
                                blockLen,
                                n,
                            )
                        if (cmp > 0) {
                            nextIndex[i] = i + l
                            nextChar[i] = bestLetter
                            blockLen[i] = l
                        }
                    }
                }
            }
        }
        if (dp[0] >= INF) {
            return ""
        }
        val builder = StringBuilder(n)
        var idx = 0
        while (idx < n) {
            val len = blockLen[idx]
            val c = nextChar[idx]
            (0..<len).forEach { _ ->
                builder.append(('a'.code + c).toChar())
            }
            idx = nextIndex[idx]
        }
        return builder.toString()
    }

    private fun compareSolutions(
        oldLetter: Int,
        oldLen: Int,
        oldNext: Int,
        newLetter: Int,
        newLen: Int,
        newNext: Int,
        nextIndex: IntArray,
        nextChar: IntArray,
        blockLen: IntArray,
        n: Int,
    ): Int {
        var offsetOld = 0
        var offsetNew = 0
        var curOldPos: Int
        var curNewPos: Int
        var letOld = oldLetter
        var letNew = newLetter
        var lenOld = oldLen
        var lenNew = newLen
        var nxtOld = oldNext
        var nxtNew = newNext
        while (true) {
            if (letOld != letNew) {
                return if (letOld < letNew) -1 else 1
            }
            val remainOld = lenOld - offsetOld
            val remainNew = lenNew - offsetNew
            val step = min(remainOld.toDouble(), remainNew.toDouble()).toInt()
            offsetOld += step
            offsetNew += step
            if (offsetOld == lenOld && offsetNew == lenNew) {
                if (nxtOld == n && nxtNew == n) {
                    return 0
                }
                if (nxtOld == n) {
                    return -1
                }
                if (nxtNew == n) {
                    return 1
                }
                curOldPos = nxtOld
                letOld = nextChar[curOldPos]
                lenOld = blockLen[curOldPos]
                nxtOld = nextIndex[curOldPos]
                offsetOld = 0
                curNewPos = nxtNew
                letNew = nextChar[curNewPos]
                lenNew = blockLen[curNewPos]
                nxtNew = nextIndex[curNewPos]
                offsetNew = 0
            } else if (offsetOld == lenOld) {
                if (nxtOld == n) {
                    return -1
                }
                curOldPos = nxtOld
                letOld = nextChar[curOldPos]
                lenOld = blockLen[curOldPos]
                nxtOld = nextIndex[curOldPos]
                offsetOld = 0
            } else if (offsetNew == lenNew) {
                if (nxtNew == n) {
                    return 1
                }
                curNewPos = nxtNew
                letNew = nextChar[curNewPos]
                lenNew = blockLen[curNewPos]
                nxtNew = nextIndex[curNewPos]
                offsetNew = 0
            }
        }
    }

    companion object {
        private const val INF = Int.Companion.MAX_VALUE / 2
    }
}
