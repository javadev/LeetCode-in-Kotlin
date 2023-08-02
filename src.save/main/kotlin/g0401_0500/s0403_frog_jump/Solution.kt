package g0401_0500.s0403_frog_jump

// #Hard #Array #Dynamic_Programming #2022_11_30_Time_240_ms_(100.00%)_Space_37.1_MB_(100.00%)

import java.util.HashMap
import java.util.HashSet

class Solution {
    // global hashmap to store visited index -> set of jump lengths from that index
    private val visited: HashMap<Int, HashSet<Int>> = HashMap()
    fun canCross(stones: IntArray): Boolean {
        // a mathematical check before going in the recursion
        for (i in 3 until stones.size) {
            if (stones[i] > stones[i - 1] * 2) {
                return false
            }
        }
        // map of values -> index to make sure we get the next index quickly
        val rocks: HashMap<Int, Int> = HashMap()
        for (i in stones.indices) {
            rocks.put(stones[i], i)
        }
        return jump(stones, 0, 1, 0, rocks)
    }

    private fun jump(
        stones: IntArray,
        index: Int,
        jumpLength: Int,
        expectedVal: Int,
        rocks: Map<Int, Int>
    ): Boolean {
        // overshoot and going backwards not allowed
        if (index >= stones.size || jumpLength <= 0) {
            return false
        }
        // reached the last index
        if (index == stones.size - 1) {
            return expectedVal == stones[index]
        }
        // check if this index -> jumpLength pair was seen before, otherwise record it
        val rememberJumps: HashSet<Int> = visited.getOrDefault(index, HashSet())
        if (stones[index] > expectedVal || rememberJumps.contains(jumpLength)) {
            return false
        }
        rememberJumps.add(jumpLength)
        visited.put(index, rememberJumps)
        // check for jumpLength-1, jumpLength, jumpLength+1 for a new expected value
        return (
            jump(
                stones,
                rocks[stones[index] + jumpLength] ?: stones.size,
                jumpLength + 1,
                stones[index] + jumpLength,
                rocks
            ) ||
                jump(
                    stones,
                    rocks[stones[index] + jumpLength] ?: stones.size,
                    jumpLength,
                    stones[index] + jumpLength,
                    rocks
                ) ||
                jump(
                    stones,
                    rocks[stones[index] + jumpLength] ?: stones.size,
                    jumpLength - 1,
                    stones[index] + jumpLength,
                    rocks
                )
            )
    }
}
