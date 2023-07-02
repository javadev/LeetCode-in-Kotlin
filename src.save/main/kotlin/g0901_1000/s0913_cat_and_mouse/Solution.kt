package g0901_1000.s0913_cat_and_mouse

// #Hard #Dynamic_Programming #Math #Graph #Memoization #Topological_Sort #Game_Theory
// #2023_04_16_Time_211_ms_(100.00%)_Space_37.1_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun catMouseGame(graph: Array<IntArray>): Int {
        val n = graph.size
        val states = Array(n) {
            Array(n) {
                IntArray(
                    2
                )
            }
        }
        val degree = Array(n) {
            Array(n) {
                IntArray(
                    2
                )
            }
        }
        for (m in 0 until n) {
            for (c in 0 until n) {
                degree[m][c][MOUSE] = graph[m].size
                degree[m][c][CAT] = graph[c].size
                for (node in graph[c]) {
                    if (node == 0) {
                        --degree[m][c][CAT]
                        break
                    }
                }
            }
        }
        val q: Queue<IntArray> = LinkedList()
        for (i in 1 until n) {
            states[0][i][MOUSE] = MOUSE_WIN
            states[0][i][CAT] = MOUSE_WIN
            states[i][i][MOUSE] = CAT_WIN
            states[i][i][CAT] = CAT_WIN
            q.offer(intArrayOf(0, i, MOUSE, MOUSE_WIN))
            q.offer(intArrayOf(i, i, MOUSE, CAT_WIN))
            q.offer(intArrayOf(0, i, CAT, MOUSE_WIN))
            q.offer(intArrayOf(i, i, CAT, CAT_WIN))
        }
        while (q.isNotEmpty()) {
            val state = q.poll()
            val mouse = state[0]
            val cat = state[1]
            val turn = state[2]
            val result = state[3]
            if (mouse == 1 && cat == 2 && turn == MOUSE) {
                return result
            }
            val prevTurn = 1 - turn
            for (prev in graph[if (prevTurn == MOUSE) mouse else cat]) {
                val prevMouse = if (prevTurn == MOUSE) prev else mouse
                val prevCat = if (prevTurn == CAT) prev else cat
                if (prevCat != 0 && states[prevMouse][prevCat][prevTurn] == DRAW &&
                    (
                        prevTurn == MOUSE && result == MOUSE_WIN || prevTurn == CAT && result == CAT_WIN ||
                            --degree[prevMouse][prevCat][prevTurn] == 0
                        )
                ) {
                    states[prevMouse][prevCat][prevTurn] = result
                    q.offer(intArrayOf(prevMouse, prevCat, prevTurn, result))
                }
            }
        }
        return DRAW
    }

    companion object {
        private const val DRAW = 0
        private const val MOUSE_WIN = 1
        private const val CAT_WIN = 2
        private const val MOUSE = 0
        private const val CAT = 1
    }
}
