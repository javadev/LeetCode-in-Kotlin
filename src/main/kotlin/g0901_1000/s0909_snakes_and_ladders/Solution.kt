package g0901_1000.s0909_snakes_and_ladders

// #Medium #Array #Breadth_First_Search #Matrix
// #2023_04_15_Time_203_ms_(100.00%)_Space_36_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private var size = 0
    fun snakesAndLadders(board: Array<IntArray>): Int {
        val queue: Queue<Int> = LinkedList()
        size = board.size
        val target = size * size
        val visited = BooleanArray(target)
        queue.add(1)
        visited[0] = true
        var step = 0
        while (!queue.isEmpty()) {
            val queueSize = queue.size
            for (i in 0 until queueSize) {
                val previousLabel = queue.poll()
                if (previousLabel == target) {
                    return step
                }
                for (currentLabel in previousLabel + 1..Math.min(target, previousLabel + 6)) {
                    if (visited[currentLabel - 1]) {
                        continue
                    }
                    visited[currentLabel - 1] = true
                    val position = indexToPosition(currentLabel)
                    if (board[position[0]][position[1]] == -1) {
                        queue.add(currentLabel)
                    } else {
                        queue.add(board[position[0]][position[1]])
                    }
                }
            }
            step++
        }
        return -1
    }

    private fun indexToPosition(index: Int): IntArray {
        val vertical = size - 1 - (index - 1) / size
        val horizontal: Int = if ((size - vertical) % 2 == 1) {
            (index - 1) % size
        } else {
            size - 1 - (index - 1) % size
        }
        return intArrayOf(vertical, horizontal)
    }
}
