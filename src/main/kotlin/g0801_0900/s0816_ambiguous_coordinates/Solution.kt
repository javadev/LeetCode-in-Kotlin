package g0801_0900.s0816_ambiguous_coordinates

// #Medium #String #Backtracking #2023_03_22_Time_231_ms_(100.00%)_Space_36.2_MB_(100.00%)

@Suppress("kotlin:S107")
class Solution {
    fun ambiguousCoordinates(s: String): List<String> {
        val sc = s.toCharArray()
        val result: MutableList<String> = ArrayList()
        val sb = StringBuilder()
        for (commaPos in 2 until sc.size - 1) {
            if (isValidNum(sc, 1, commaPos - 1)) {
                if (isValidNum(sc, commaPos, sc.size - 2)) {
                    buildNumbs(result, sb, sc, commaPos - 1, 0, commaPos, sc.size - 2, 0)
                }
                for (dp2Idx in commaPos + 1 until sc.size - 1) {
                    if (isValidDPNum(sc, commaPos, sc.size - 2, dp2Idx)) {
                        buildNumbs(result, sb, sc, commaPos - 1, 0, commaPos, sc.size - 2, dp2Idx)
                    }
                }
            }
            for (dp1Idx in 2 until commaPos) {
                if (isValidDPNum(sc, 1, commaPos - 1, dp1Idx)) {
                    if (isValidNum(sc, commaPos, sc.size - 2)) {
                        buildNumbs(result, sb, sc, commaPos - 1, dp1Idx, commaPos, sc.size - 2, 0)
                    }
                    for (dp2Idx in commaPos + 1 until sc.size - 1) {
                        if (isValidDPNum(sc, commaPos, sc.size - 2, dp2Idx)) {
                            buildNumbs(
                                result,
                                sb,
                                sc,
                                commaPos - 1,
                                dp1Idx,
                                commaPos,
                                sc.size - 2,
                                dp2Idx
                            )
                        }
                    }
                }
            }
        }
        return result
    }

    private fun isValidNum(sc: CharArray, startIdx: Int, lastIdx: Int): Boolean {
        return sc[startIdx] != '0' || lastIdx - startIdx == 0
    }

    private fun isValidDPNum(sc: CharArray, startIdx: Int, lastIdx: Int, dpIdx: Int): Boolean {
        return (sc[startIdx] != '0' || dpIdx - startIdx == 1) && sc[lastIdx] != '0'
    }

    private fun buildNumbs(
        result: MutableList<String>,
        sb: StringBuilder,
        sc: CharArray,
        last1Idx: Int,
        dp1Idx: Int,
        start2Idx: Int,
        last2Idx: Int,
        dp2Idx: Int
    ) {
        sb.setLength(0)
        sb.append('(')
        if (dp1Idx == 0) {
            sb.append(sc, 1, last1Idx - 1 + 1)
        } else {
            sb.append(sc, 1, dp1Idx - 1).append('.').append(sc, dp1Idx, last1Idx - dp1Idx + 1)
        }
        sb.append(',').append(' ')
        if (dp2Idx == 0) {
            sb.append(sc, start2Idx, last2Idx - start2Idx + 1)
        } else {
            sb.append(sc, start2Idx, dp2Idx - start2Idx)
                .append('.')
                .append(sc, dp2Idx, last2Idx - dp2Idx + 1)
        }
        sb.append(')')
        result.add(sb.toString())
    }
}
