package g2201_2300.s2271_maximum_white_tiles_covered_by_a_carpet

import java.util.Arrays

// #Medium #Array #Sorting #Greedy #Binary_Search #Prefix_Sum
class Solution {
    fun maximumWhiteTiles(tiles: Array<IntArray>, carpetLength: Int): Int {
        Arrays.sort(tiles, { x: IntArray, y: IntArray -> x[0].compareTo(y[0]) })
        var currentCover = Math.min(tiles[0][1] - tiles[0][0] + 1, carpetLength)
        var maxCover = currentCover
        var head = 1
        var tail = 0
        while (tail < tiles.size && head < tiles.size && maxCover < carpetLength) {
            if (tiles[head][1] - tiles[tail][0] + 1 <= carpetLength) {
                currentCover += tiles[head][1] - tiles[head][0] + 1
                maxCover = Math.max(maxCover, currentCover)
                ++head
            } else {
                val possiblePartialCoverOverCurrentHead = carpetLength - (tiles[head][0] - tiles[tail][0])
                maxCover = Math.max(maxCover, currentCover + possiblePartialCoverOverCurrentHead)
                currentCover = currentCover - (tiles[tail][1] - tiles[tail][0] + 1)
                ++tail
            }
        }
        return maxCover
    }
}
