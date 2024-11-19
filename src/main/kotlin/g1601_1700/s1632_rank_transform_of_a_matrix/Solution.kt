package g1601_1700.s1632_rank_transform_of_a_matrix

// #Hard #Array #Greedy #Matrix #Graph #Union_Find #Topological_Sort
// #2023_06_17_Time_807_ms_(100.00%)_Space_96.5_MB_(100.00%)

class Solution {
    fun matrixRankTransform(matrix: Array<IntArray>): Array<IntArray> {
        val rowCount = matrix.size
        val colCount = matrix[0].size
        val nums = LongArray(rowCount * colCount)
        var numsIdx = 0
        val rows = IntArray(rowCount)
        val cols = IntArray(colCount)
        for (r in rowCount - 1 downTo 0) {
            for (c in colCount - 1 downTo 0) {
                nums[numsIdx++] = matrix[r][c].toLong() shl 32 or (r.toLong() shl 16) or c.toLong()
            }
        }
        nums.sort()
        var nIdx = 0
        while (nIdx < numsIdx) {
            val num = nums[nIdx] and -0x100000000L
            var endIdx = nIdx + 1
            while (endIdx < numsIdx && nums[endIdx] and -0x100000000L == num) {
                endIdx++
            }
            doGroup(matrix, nums, nIdx, endIdx, rows, cols)
            nIdx = endIdx
        }
        return matrix
    }

    private fun doGroup(
        matrix: Array<IntArray>,
        nums: LongArray,
        startIdx: Int,
        endIdx: Int,
        rows: IntArray,
        cols: IntArray,
    ) {
        if (startIdx + 1 == endIdx) {
            val r = nums[startIdx].toInt() shr 16 and 0xFFFF
            val c = nums[startIdx].toInt() and 0xFFFF
            cols[c] = rows[r].coerceAtLeast(cols[c]) + 1
            rows[r] = cols[c]
            matrix[r][c] = rows[r]
        } else {
            val rowCount = matrix.size
            val ufind = IntArray(rowCount + matrix[0].size)
            ufind.fill(-1)
            for (nIdx in startIdx until endIdx) {
                val r = nums[nIdx].toInt() shr 16 and 0xFFFF
                val c = nums[nIdx].toInt() and 0xFFFF
                val pr = getIdx(ufind, r)
                val pc = getIdx(ufind, rowCount + c)
                if (pr != pc) {
                    ufind[pr] = ufind[pr].coerceAtMost(ufind[pc])
                        .coerceAtMost(
                            -rows[r]
                                .coerceAtLeast(cols[c]) - 1,
                        )
                    ufind[pc] = pr
                }
            }
            for (nIdx in startIdx until endIdx) {
                val r = nums[nIdx].toInt() shr 16 and 0xFFFF
                val c = nums[nIdx].toInt() and 0xFFFF
                cols[c] = -ufind[getIdx(ufind, r)]
                rows[r] = cols[c]
                matrix[r][c] = rows[r]
            }
        }
    }

    private fun getIdx(ufind: IntArray, idx: Int): Int {
        return if (ufind[idx] < 0) {
            idx
        } else {
            ufind[idx] = getIdx(ufind, ufind[idx])
            ufind[idx]
        }
    }
}
