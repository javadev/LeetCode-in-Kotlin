package g0401_0500.s0407_trapping_rain_water_ii

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2022_12_03_Time_500_ms_(100.00%)_Space_64.7_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    private class Cell(val row: Int, val col: Int, val value: Int) : Comparable<Cell?> {
        override operator fun compareTo(other: Cell?): Int {
            return value - other!!.value
        }
    }

    private var water = 0
    private lateinit var visited1: Array<BooleanArray>
    fun trapRainWater(heightMap: Array<IntArray>): Int {
        if (heightMap.size == 0) {
            return 0
        }
        val walls = PriorityQueue<Cell>()
        water = 0
        visited1 = Array(heightMap.size) { BooleanArray(heightMap[0].size) }
        val rows = heightMap.size
        val cols = heightMap[0].size
        // build wall
        for (c in 0 until cols) {
            walls.add(Cell(0, c, heightMap[0][c]))
            walls.add(Cell(rows - 1, c, heightMap[rows - 1][c]))
            visited1[0][c] = true
            visited1[rows - 1][c] = true
        }
        for (r in 1 until rows - 1) {
            walls.add(Cell(r, 0, heightMap[r][0]))
            walls.add(Cell(r, cols - 1, heightMap[r][cols - 1]))
            visited1[r][0] = true
            visited1[r][cols - 1] = true
        }
        // end build wall
        while (!walls.isEmpty()) {
            val min = walls.poll()
            visit(heightMap, min, walls)
        }
        return water
    }

    private fun visit(height: Array<IntArray>, start: Cell, walls: PriorityQueue<Cell>) {
        fill(height, start.row + 1, start.col, walls, start.value)
        fill(height, start.row - 1, start.col, walls, start.value)
        fill(height, start.row, start.col + 1, walls, start.value)
        fill(height, start.row, start.col - 1, walls, start.value)
    }

    private fun fill(height: Array<IntArray>, row: Int, col: Int, walls: PriorityQueue<Cell>, min: Int) {
        if (row >= 0 && col >= 0 && row < height.size && col < height[0].size &&
            !visited1[row][col]
        ) {
            if (height[row][col] >= min) {
                walls.add(Cell(row, col, height[row][col]))
                visited1[row][col] = true
            } else {
                water += min - height[row][col]
                visited1[row][col] = true
                fill(height, row + 1, col, walls, min)
                fill(height, row - 1, col, walls, min)
                fill(height, row, col + 1, walls, min)
                fill(height, row, col - 1, walls, min)
            }
        }
    }
}
