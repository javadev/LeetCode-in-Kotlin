package g1601_1700.s1652_defuse_the_bomb

// #Easy #Array
class Solution {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val result = IntArray(code.size)
        val len = code.size
        if (k == 0) {
            for (i in code.indices) {
                result[i] = 0
            }
        } else if (k > 0) {
            var kSum = 0
            for (i in 1..k) {
                kSum += code[i]
            }
            result[0] = kSum
            for (i in 1 until len) {
                kSum -= code[i]
                kSum += code[(i + k) % len]
                result[i] = kSum
            }
        } else {
            var kSum = 0
            val kVal = Math.abs(k)
            for (i in len - 1 downTo len - kVal) {
                kSum += code[i]
            }
            result[0] = kSum
            for (i in 1 until len) {
                kSum -= code[(len - kVal + i - 1) % len]
                kSum += code[i - 1]
                result[i] = kSum
            }
        }
        return result
    }
}
