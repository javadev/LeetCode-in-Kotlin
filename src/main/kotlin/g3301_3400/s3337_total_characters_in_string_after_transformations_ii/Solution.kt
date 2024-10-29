package g3301_3400.s3337_total_characters_in_string_after_transformations_ii

// #Hard #String #Hash_Table #Dynamic_Programming #Math #Counting
// #2024_10_29_Time_581_ms_(33.33%)_Space_57.4_MB_(33.33%)

class Solution {
    fun lengthAfterTransformations(s: String, t: Int, nums: List<Int>): Int {
        // Initialize transformation matrix M
        val matrix = Array<IntArray?>(ALPHABET_SIZE) { IntArray(ALPHABET_SIZE) }
        for (i in 0 until ALPHABET_SIZE) {
            val transforms: Int = nums[i]
            for (j in 0 until transforms) {
                matrix[i]!![(i + j + 1) % ALPHABET_SIZE] =
                    matrix[i]!![(i + j + 1) % ALPHABET_SIZE] + 1
            }
        }
        // Initialize count array based on string `s`
        val count = IntArray(ALPHABET_SIZE)
        for (ch in s.toCharArray()) {
            count[ch.code - 'a'.code]++
        }
        // Apply matrix exponentiation to get M^t
        val matrixT = power(matrix, t)
        // Calculate final character counts after t transformations
        val finalCount = IntArray(ALPHABET_SIZE)
        for (i in 0 until ALPHABET_SIZE) {
            for (j in 0 until ALPHABET_SIZE) {
                finalCount[j] = ((finalCount[j] + (matrixT[i]!![j].toLong() * count[i]) % MOD) % MOD).toInt()
            }
        }
        // Calculate total length
        var totalLength = 0
        for (cnt in finalCount) {
            totalLength = (totalLength + cnt) % MOD
        }
        return totalLength
    }

    // Matrix multiplication function
    private fun multiply(a: Array<IntArray?>, b: Array<IntArray?>): Array<IntArray?> {
        val matrixC = Array<IntArray?>(ALPHABET_SIZE) { IntArray(ALPHABET_SIZE) }
        for (i in 0 until ALPHABET_SIZE) {
            for (j in 0 until ALPHABET_SIZE) {
                for (k in 0 until ALPHABET_SIZE) {
                    matrixC[i]!![j] = ((matrixC[i]!![j] + (a[i]!![k].toLong() * b[k]!![j]) % MOD) % MOD).toInt()
                }
            }
        }
        return matrixC
    }

    // Matrix exponentiation function
    private fun power(matrix: Array<IntArray?>, exp: Int): Array<IntArray?> {
        var matrix = matrix
        var exp = exp
        var result = Array<IntArray?>(ALPHABET_SIZE) { IntArray(ALPHABET_SIZE) }
        for (i in 0 until ALPHABET_SIZE) {
            // Identity matrix
            result[i]!![i] = 1
        }
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = multiply(result, matrix)
            }
            matrix = multiply(matrix, matrix)
            exp /= 2
        }
        return result
    }

    companion object {
        private const val MOD = 1000000007
        private const val ALPHABET_SIZE = 26
    }
}
