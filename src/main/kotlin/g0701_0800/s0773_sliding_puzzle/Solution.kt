package g0701_0800.s0773_sliding_puzzle

// #Hard #Array #Breadth_First_Search #Matrix
// #2023_03_10_Time_166_ms_(100.00%)_Space_35_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private class Node(var board: String, var depth: Int, var y: Int, var x: Int)
    fun slidingPuzzle(board: Array<IntArray>): Int {
        val targetStr = "123450"
        val sb = StringBuilder()
        var y = 0
        var x = 0
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 0) {
                    y = i
                    x = j
                }
                sb.append(board[i][j])
            }
        }
        val seen: MutableSet<String> = HashSet()
        val q: Queue<Node> = LinkedList()
        q.add(Node(sb.toString(), 0, y, x))
        val dir = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        while (q.isNotEmpty()) {
            val next = q.poll()
            val s = next.board
            if (!seen.contains(s)) {
                if (s == targetStr) {
                    return next.depth
                }
                val nextDepth = next.depth + 1
                y = next.y
                x = next.x
                for (vector in dir) {
                    val nextY = y + vector[0]
                    val nextX = x + vector[1]
                    if (0 <= nextY && nextY < board.size && 0 <= nextX && nextX < board[0].size) {
                        val newBoard = swap(s, y, x, nextY, nextX)
                        q.add(Node(newBoard, nextDepth, nextY, nextX))
                    }
                }
                seen.add(s)
            }
        }
        return -1
    }

    private fun swap(board: String, y1: Int, x1: Int, y2: Int, x2: Int): String {
        val arr = board.toCharArray()
        val t = board[y1 * 3 + x1]
        arr[y1 * 3 + x1] = board[y2 * 3 + x2]
        arr[y2 * 3 + x2] = t
        return String(arr)
    }
}
