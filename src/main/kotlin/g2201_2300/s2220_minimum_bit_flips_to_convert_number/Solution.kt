package g2201_2300.s2220_minimum_bit_flips_to_convert_number

// #Easy #Bit_Manipulation
@Suppress("NAME_SHADOWING")
class Solution {
    private fun decToBinary(n: Int): Int {
        var n = n
        val binaryNum = IntArray(32)
        var i = 0
        while (n > 0) {
            binaryNum[i] = n % 2
            n = n / 2
            i++
        }
        var answer = 0
        for (j in i - 1 downTo 0) {
            if (binaryNum[j] == 1) {
                answer++
            }
        }
        return answer
    }

    fun minBitFlips(start: Int, goal: Int): Int {
        val answer = start xor goal
        return decToBinary(answer)
    }
}
