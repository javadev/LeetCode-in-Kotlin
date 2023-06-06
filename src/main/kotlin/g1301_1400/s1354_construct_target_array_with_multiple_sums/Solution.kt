package g1301_1400.s1354_construct_target_array_with_multiple_sums

// #Hard #Array #Heap_Priority_Queue
class Solution {
    fun isPossible(target: IntArray): Boolean {
        var sum = target[0].toLong()
        var maxIndex = 0
        for (i in 1 until target.size) {
            sum += target[i].toLong()
            if (target[i] > target[maxIndex]) {
                maxIndex = i
            }
        }
        val remainingSum = sum - target[maxIndex]
        if (target[maxIndex] == 1 || remainingSum == 1L) {
            return true
        }
        if (remainingSum >= target[maxIndex] || remainingSum == 0L || target[maxIndex] % remainingSum == 0L) {
            return false
        }
        target[maxIndex] %= remainingSum.toInt()
        return isPossible(target)
    }
}
