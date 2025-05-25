package g3501_3600.s3563_lexicographically_smallest_string_after_adjacent_removals

import kotlin.math.abs

// #Hard #2025_05_25_Time_146_ms_(98.77%)_Space_45.52_MB_(90.12%)

class Solution {
    private fun checkPair(char1: Char, char2: Char): Boolean {
        val diffVal = abs(char1.code - char2.code)
        return diffVal == 1 || (char1 == 'a' && char2 == 'z') || (char1 == 'z' && char2 == 'a')
    }

    fun lexicographicallySmallestString(sIn: String): String? {
        val nVal = sIn.length
        if (nVal == 0) {
            return ""
        }
        val remTable = Array<BooleanArray?>(nVal) { BooleanArray(nVal) }
        var len = 2
        while (len <= nVal) {
            for (idx in 0..nVal - len) {
                val j = idx + len - 1
                if (checkPair(sIn[idx], sIn[j])) {
                    if (len == 2) {
                        remTable[idx]!![j] = true
                    } else {
                        if (remTable[idx + 1]!![j - 1]) {
                            remTable[idx]!![j] = true
                        }
                    }
                }
                if (remTable[idx]!![j]) {
                    continue
                }
                var pSplit = idx + 1
                while (pSplit < j) {
                    if (remTable[idx]!![pSplit] && remTable[pSplit + 1]!![j]) {
                        remTable[idx]!![j] = true
                        break
                    }
                    pSplit += 2
                }
            }
            len += 2
        }
        val dpArr: Array<String> = Array<String>(nVal + 1) { "" }
        dpArr[nVal] = ""
        for (idx in nVal - 1 downTo 0) {
            dpArr[idx] = sIn[idx].toString() + dpArr[idx + 1]
            for (kMatch in idx + 1..<nVal) {
                if (checkPair(sIn[idx], sIn[kMatch])) {
                    val middleVanishes: Boolean = if (kMatch - 1 < idx + 1) {
                        true
                    } else {
                        remTable[idx + 1]!![kMatch - 1]
                    }
                    if (middleVanishes) {
                        val candidate = dpArr[kMatch + 1]
                        if (candidate < dpArr[idx]) {
                            dpArr[idx] = candidate
                        }
                    }
                }
            }
        }
        return dpArr[0]
    }
}
