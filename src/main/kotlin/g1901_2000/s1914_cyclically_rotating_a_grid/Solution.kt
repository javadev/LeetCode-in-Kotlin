package g1901_2000.s1914_cyclically_rotating_a_grid

// #Medium #Array #Matrix #Simulation
class Solution {
    fun rotateGrid(grid: Array<IntArray>, k: Int): Array<IntArray> {
        rotateInternal(grid, 0, grid[0].size - 1, 0, grid.size - 1, k)
        return grid
    }

    private fun rotateInternal(grid: Array<IntArray>, left: Int, right: Int, up: Int, bottom: Int, k: Int) {
        if (left > right || up > bottom) {
            return
        }
        val loopLen = (right - left + 1) * 2 + (bottom - up + 1) * 2 - 4
        val realK = k % loopLen
        if (realK != 0) {
            rotateLayer(grid, left, right, up, bottom, realK)
        }
        rotateInternal(grid, left + 1, right - 1, up + 1, bottom - 1, k)
    }

    private fun rotateLayer(grid: Array<IntArray>, left: Int, right: Int, up: Int, bottom: Int, k: Int) {
        val startPoint = intArrayOf(up, left)
        val loopLen = (right - left + 1) * 2 + (bottom - up + 1) * 2 - 4
        val arr = IntArray(loopLen)
        var idx = 0
        var currPoint: IntArray? = startPoint
        var startPointAfterRotation: IntArray? = null
        while (idx < arr.size) {
            arr[idx] = grid[currPoint!![0]][currPoint[1]]
            idx++
            currPoint = getNextPosCC(left, right, up, bottom, currPoint)
            if (idx == k) {
                startPointAfterRotation = currPoint
            }
        }
        idx = 0
        currPoint = startPointAfterRotation
        if (currPoint != null) {
            while (idx < arr.size) {
                grid[currPoint!![0]][currPoint[1]] = arr[idx]
                idx++
                currPoint = getNextPosCC(left, right, up, bottom, currPoint)
            }
        }
    }

    private fun getNextPosCC(left: Int, right: Int, up: Int, bottom: Int, curr: IntArray?): IntArray {
        val x = curr!![0]
        val y = curr[1]
        return if (x == up && y > left) {
            intArrayOf(x, y - 1)
        } else if (y == left && x < bottom) {
            intArrayOf(x + 1, y)
        } else if (x == bottom && y < right) {
            intArrayOf(x, y + 1)
        } else {
            intArrayOf(x - 1, y)
        }
    }
}
