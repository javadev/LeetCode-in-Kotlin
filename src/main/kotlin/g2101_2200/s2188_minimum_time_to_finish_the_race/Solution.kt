package g2101_2200.s2188_minimum_time_to_finish_the_race

// #Hard #Array #Dynamic_Programming
class Solution {
    fun minimumFinishTime(tires: Array<IntArray>, changeTime: Int, numLaps: Int): Int {
        var minf = Int.MAX_VALUE
        // find the minimum of f, to deal with special case and stronger constraints later.
        for (tire in tires) {
            minf = Math.min(minf, tire[0])
        }
        // if min-f >= changeTime, we can return early
        if (minf >= changeTime) {
            return minf * numLaps + changeTime * (numLaps - 1)
        }
        // shortest[i] record shortest time that one single tire is worth to go the i-th laps
        // worth to go means the i-th lap time is shorter than changeTime + f
        val shortest = IntArray(numLaps + 1)
        shortest.fill(Int.MAX_VALUE)
        var len = 0
        // traverse all tires, and update the shortest[i]
        // this shortest time is available from [1, len] in the array
        // len is updated in the traverse
        for (tire in tires) {
            val f = tire[0]
            val r = tire[1]
            // index start from 1 to be consistent with numLaps
            var index = 1
            var t = f
            var sum = t
            // use changeTime + minf here, which is a strong constraints than changeTime + f
            while (t <= changeTime + minf && index <= numLaps) {
                shortest[index] = Math.min(shortest[index], sum)
                t = t * r
                sum += t
                index++
            }
            len = Math.max(len, index - 1)
        }
        for (i in 2..numLaps) {
            // for j > Math.min(i/2, len), it's simply recombination of the values of shortest
            // [1:len]
            // it's ok to go furthur for the loop, just repeat the Math.min computation
            for (j in 1..Math.min(i / 2, len)) {
                shortest[i] = Math.min(shortest[i], shortest[j] + shortest[i - j] + changeTime)
            }
        }
        return shortest[numLaps]
    }
}
