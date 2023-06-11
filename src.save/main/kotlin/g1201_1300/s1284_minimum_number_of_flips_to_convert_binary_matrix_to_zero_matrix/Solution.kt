package g1201_1300.s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix

// #Hard #Array #Breadth_First_Search #Matrix #Bit_Manipulation
// #2023_06_08_Time_131_ms_(100.00%)_Space_34.3_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Queue

class Solution {
    private lateinit var visited: MutableSet<Int>

    private fun isValid(x: Int, y: Int, r: Int, c: Int): Boolean {
        return x >= 0 && y >= 0 && x < r && y < c
    }

    private fun next(n: Int, r: Int, c: Int): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        val dx = intArrayOf(0, 0, 0, 1, -1)
        val dy = intArrayOf(0, 1, -1, 0, 0)
        for (i in 0 until r) {
            for (j in 0 until c) {
                var newMask = n
                for (k in dx.indices) {
                    val nx = i + dx[k]
                    val ny = j + dy[k]
                    if (isValid(nx, ny, r, c)) {
                        newMask = newMask xor (1 shl nx * 3 + ny)
                    }
                }
                if (visited.add(newMask)) {
                    ans.add(newMask)
                }
            }
        }
        return ans
    }

    fun minFlips(mat: Array<IntArray>): Int {
        var mask = 0
        val r = mat.size
        val c = mat[0].size
        if (r == 1 && c == 1) {
            return if (mat[0][0] == 0) 0 else 1
        }
        for (i in 0 until r) {
            for (j in 0 until c) {
                mask = mask or (mat[i][j] shl i * 3 + j)
            }
        }
        if (mask == 0) {
            return 0
        }
        visited = HashSet()
        val q: Queue<Int> = ArrayDeque()
        var count = 1
        q.add(mask)
        visited.add(mask)
        while (q.isNotEmpty()) {
            val qSize = q.size
            for (i in 0 until qSize) {
                val currMask = q.poll()
                val nextStates = next(currMask, r, c)
                for (nextState in nextStates) {
                    if (nextState == 0) {
                        return count
                    }
                    q.add(nextState)
                }
            }
            count++
        }
        return -1
    }
}
