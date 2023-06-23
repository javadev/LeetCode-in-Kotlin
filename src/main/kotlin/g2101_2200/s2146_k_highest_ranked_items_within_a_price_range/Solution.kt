package g2101_2200.s2146_k_highest_ranked_items_within_a_price_range

import java.util.LinkedList
import java.util.Queue

// #Medium #Array #Sorting #Breadth_First_Search #Matrix #Heap_Priority_Queue
@Suppress("NAME_SHADOWING")
class Solution {
    internal class Item(var row: Int, var col: Int, var dist: Int, var price: Int)

    fun highestRankedKItems(
        grid: Array<IntArray>,
        pricing: IntArray,
        start: IntArray,
        k: Int
    ): List<List<Int>> {
        var k = k
        val n = grid.size
        val m = grid[0].size
        val bfs: Queue<IntArray> = LinkedList()
        val items = LinkedList<Item>()
        bfs.add(start)
        if (grid[start[0]][start[1]] >= pricing[0] && grid[start[0]][start[1]] <= pricing[1]) {
            items.add(Item(start[0], start[1], 0, grid[start[0]][start[1]]))
        }
        grid[start[0]][start[1]] = -1
        var distance = 0
        while (!bfs.isEmpty()) {
            var size = bfs.size
            distance++
            while (size-- > 0) {
                val loc = bfs.poll()
                val dirX = intArrayOf(0, 1, -1, 0)
                val dirY = intArrayOf(-1, 0, 0, 1)
                for (i in 0..3) {
                    val newX = loc[0] + dirX[i]
                    val newY = loc[1] + dirY[i]
                    if (newX < 0 || newX >= n || newY < 0 || newY >= m ||
                        grid[newX][newY] == -1 || grid[newX][newY] == 0
                    ) {
                        continue
                    }
                    if (grid[newX][newY] >= pricing[0] && grid[newX][newY] <= pricing[1]) {
                        items.add(Item(newX, newY, distance, grid[newX][newY]))
                    }
                    grid[newX][newY] = -1
                    bfs.add(intArrayOf(newX, newY))
                }
            }
        }
        items.sortWith { a: Item, b: Item ->
            val distDiff = a.dist - b.dist
            if (distDiff == 0) {
                val priceDiff = a.price - b.price
                if (priceDiff == 0) {
                    val rowDiff = a.row - b.row
                    if (rowDiff == 0) {
                        return@sortWith a.col - b.col
                    }
                    return@sortWith rowDiff
                }
                return@sortWith priceDiff
            }
            distDiff
        }
        val ans: MutableList<List<Int>> = LinkedList()
        while (k-- > 0 && !items.isEmpty()) {
            val item = items.poll()
            ans.add(listOf(item.row, item.col))
        }
        return ans
    }
}
