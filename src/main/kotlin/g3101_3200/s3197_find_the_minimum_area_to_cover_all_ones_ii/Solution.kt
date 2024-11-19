package g3101_3200.s3197_find_the_minimum_area_to_cover_all_ones_ii

// #Hard #Array #Matrix #Enumeration #2024_06_29_Time_216_ms_(100.00%)_Space_40.1_MB_(80.00%)

import kotlin.math.min

class Solution {
    // rectangle unit count
    private lateinit var ruc: Array<IntArray>
    private var height = 0
    private var width = 0

    // r0, c0 incl., r1, c1 excl.
    private fun unitsInRectangle(r0: Int, c0: Int, r1: Int, c1: Int): Int {
        return ruc[r1][c1] - ruc[r0][c1] - ruc[r1][c0] + ruc[r0][c0]
    }

    private fun minArea(r0: Int, c0: Int, r1: Int, c1: Int): Int {
        if (unitsInRectangle(r0, c0, r1, c1) == 0) {
            return 0
        }
        var minRow = r0
        while (unitsInRectangle(r0, c0, minRow + 1, c1) == 0) {
            minRow++
        }
        var maxRow = r1 - 1
        while (unitsInRectangle(maxRow, c0, r1, c1) == 0) {
            maxRow--
        }
        var minCol = c0
        while (unitsInRectangle(r0, c0, r1, minCol + 1) == 0) {
            minCol++
        }
        var maxCol = c1 - 1
        while (unitsInRectangle(r0, maxCol, r1, c1) == 0) {
            maxCol--
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1)
    }

    private fun minSum2(r0: Int, c0: Int, r1: Int, c1: Int, splitVertical: Boolean): Int {
        var min = Int.MAX_VALUE
        if (splitVertical) {
            for (c in c0 + 1 until c1) {
                val a1 = minArea(r0, c0, r1, c)
                if (a1 == 0) {
                    continue
                }
                val a2 = minArea(r0, c, r1, c1)
                if (a2 != 0) {
                    min = min(min, (a1 + a2))
                }
            }
        } else {
            for (r in r0 + 1 until r1) {
                val a1 = minArea(r0, c0, r, c1)
                if (a1 == 0) {
                    continue
                }
                val a2 = minArea(r, c0, r1, c1)
                if (a2 != 0) {
                    min = min(min, (a1 + a2))
                }
            }
        }
        return min
    }

    private fun minSum3(
        firstSplitVertical: Boolean,
        takeLower: Boolean,
        secondSplitVertical: Boolean,
    ): Int {
        var min = Int.MAX_VALUE
        if (firstSplitVertical) {
            for (c in 1 until width) {
                var a1: Int
                var a2: Int
                if (takeLower) {
                    a1 = minArea(0, 0, height, c)
                    if (a1 == 0) {
                        continue
                    }
                    a2 = minSum2(0, c, height, width, secondSplitVertical)
                } else {
                    a1 = minArea(0, c, height, width)
                    if (a1 == 0) {
                        continue
                    }
                    a2 = minSum2(0, 0, height, c, secondSplitVertical)
                }
                if (a2 != Int.MAX_VALUE) {
                    min = min(min, (a1 + a2))
                }
            }
        } else {
            for (r in 1 until height) {
                var a1: Int
                var a2: Int
                if (takeLower) {
                    a1 = minArea(0, 0, r, width)
                    if (a1 == 0) {
                        continue
                    }
                    a2 = minSum2(r, 0, height, width, secondSplitVertical)
                } else {
                    a1 = minArea(r, 0, height, width)
                    if (a1 == 0) {
                        continue
                    }
                    a2 = minSum2(0, 0, r, width, secondSplitVertical)
                }
                if (a2 != Int.MAX_VALUE) {
                    min = min(min, (a1 + a2))
                }
            }
        }
        return min
    }

    fun minimumSum(grid: Array<IntArray>): Int {
        height = grid.size
        width = grid[0].size
        ruc = Array(height + 1) { IntArray(width + 1) }
        for (i in 0 until height) {
            val gRow = grid[i]
            val cRow0 = ruc[i]
            val cRow1 = ruc[i + 1]
            var c = 0
            for (j in 0 until width) {
                c += gRow[j]
                cRow1[j + 1] = cRow0[j + 1] + c
            }
        }
        var min = Int.MAX_VALUE
        min = min(min, minSum3(true, true, true))
        min = min(min, minSum3(true, true, false))
        min = min(min, minSum3(true, false, false))
        min = min(min, minSum3(false, true, true))
        min = min(min, minSum3(false, true, false))
        min = min(min, minSum3(false, false, true))
        return min
    }
}
