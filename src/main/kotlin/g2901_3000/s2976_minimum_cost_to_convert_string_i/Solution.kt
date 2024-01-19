package g2901_3000.s2976_minimum_cost_to_convert_string_i

// #Medium #Array #String #Graph #Shortest_Path
// #2024_01_19_Time_421_ms_(85.29%)_Space_46_MB_(61.76%)

import kotlin.math.min

class Solution {
    fun minimumCost(
        inputText: String,
        desiredText: String,
        fromLetters: CharArray,
        toLetters: CharArray,
        transformationCost: IntArray
    ): Long {
        val alphabetSize = 26
        val transformationMatrix = Array(alphabetSize) { IntArray(alphabetSize) }
        for (idx in 0 until alphabetSize) {
            transformationMatrix[idx].fill(Int.MAX_VALUE)
            transformationMatrix[idx][idx] = 0
        }
        var i = 0
        while (i < fromLetters.size) {
            val origChar = fromLetters[i].code - 'a'.code
            val newChar = toLetters[i].code - 'a'.code
            val changeCost = transformationCost[i]
            transformationMatrix[origChar][newChar] =
                min(transformationMatrix[origChar][newChar], changeCost)
            i++
        }
        var k = 0
        do {
            for (row in 0 until alphabetSize) {
                for (col in 0 until alphabetSize) {
                    if (transformationMatrix[row][k] != Int.MAX_VALUE &&
                        transformationMatrix[k][col] != Int.MAX_VALUE
                    ) {
                        transformationMatrix[row][col] = min(
                            transformationMatrix[row][col],
                            (
                                transformationMatrix[row][k] +
                                    transformationMatrix[k][col]
                                )
                        )
                    }
                }
            }
            k++
        } while (k < alphabetSize)
        var totalCost: Long = 0
        for (pos in 0 until inputText.length) {
            val startChar = inputText[pos].code - 'a'.code
            val endChar = desiredText[pos].code - 'a'.code
            if (startChar == endChar) {
                continue
            }
            if (transformationMatrix[startChar][endChar] == Int.MAX_VALUE) {
                return -1
            } else {
                totalCost += transformationMatrix[startChar][endChar].toLong()
            }
        }
        return totalCost
    }
}
