package g0901_1000.s0975_odd_even_jump

// #Hard #Array #Dynamic_Programming #Stack #Ordered_Set #Monotonic_Stack
// #2023_05_06_Time_326_ms_(100.00%)_Space_78.1_MB_(14.29%)

class Solution {
    private lateinit var valToPos: IntArray

    fun oddEvenJumps(arr: IntArray): Int {
        val size = arr.size
        val odd = BooleanArray(size)
        val even = BooleanArray(size)
        valToPos = IntArray(100001)
        valToPos.fill(-1)
        valToPos[arr[size - 1]] = size - 1
        even[size - 1] = true
        odd[size - 1] = even[size - 1]
        var count = 1
        for (i in size - 2 downTo 0) {
            val curVal = arr[i]
            val maxS = findMaxS(curVal)
            val minL = findMinL(curVal)
            if (minL != -1 && even[minL]) {
                // System.out.println("find minL is true at: "+minL+" start from "+i);
                odd[i] = even[minL]
                count++
            }
            if (maxS != -1) {
                even[i] = odd[maxS]
            }
            valToPos[arr[i]] = i
        }
        return count
    }

    private fun findMaxS(`val`: Int): Int {
        for (i in `val` downTo 0) {
            if (valToPos[i] != -1) {
                return valToPos[i]
            }
        }
        return -1
    }

    private fun findMinL(`val`: Int): Int {
        for (i in `val`..100000) {
            if (valToPos[i] != -1) {
                return valToPos[i]
            }
        }
        return -1
    }
}
