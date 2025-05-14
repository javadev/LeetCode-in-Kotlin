package g3301_3400.s3337_total_characters_in_string_after_transformations_ii

// #Hard #String #Hash_Table #Dynamic_Programming #Math #Counting
// #2025_05_14_Time_302_ms_(100.00%)_Space_54.72_MB_(100.00%)

class Solution {
    fun lengthAfterTransformations(s: String, t: Int, nums: List<Int>): Int {
        val localT = buildTransformationMatrix(nums)
        val tPower = matrixPower(localT, t)
        val freq = IntArray(26)
        for (c in s.toCharArray()) {
            freq[c.code - 'a'.code]++
        }
        var result: Long = 0
        for (i in 0..25) {
            var sum: Long = 0
            for (j in 0..25) {
                sum = (sum + freq[j].toLong() * tPower[j][i]) % MOD
            }
            result = (result + sum) % MOD
        }
        return result.toInt()
    }

    private fun buildTransformationMatrix(numsList: List<Int>): Array<IntArray> {
        val localT = Array(26) { IntArray(26) }
        for (i in 0..25) {
            val steps: Int = numsList[i]
            for (j in 1..steps) {
                localT[i][(i + j) % 26] = localT[i][(i + j) % 26] + 1
            }
        }
        return localT
    }

    private fun matrixPower(matrix: Array<IntArray>, power: Int): Array<IntArray> {
        var matrix = matrix
        var power = power
        val size = matrix.size
        var result = Array(size) { IntArray(size) }
        for (i in 0..<size) {
            result[i][i] = 1
        }
        while (power > 0) {
            if ((power and 1) == 1) {
                result = multiplyMatrices(result, matrix)
            }
            matrix = multiplyMatrices(matrix, matrix)
            power = power shr 1
        }
        return result
    }

    private fun multiplyMatrices(a: Array<IntArray>, b: Array<IntArray>): Array<IntArray> {
        val size = a.size
        val result = Array(size) { IntArray(size) }
        for (i in 0..<size) {
            for (k in 0..<size) {
                if (a[i][k] == 0) {
                    continue
                }
                for (j in 0..<size) {
                    result[i][j] = ((result[i][j] + a[i][k].toLong() * b[k][j]) % MOD).toInt()
                }
            }
        }
        return result
    }

    companion object {
        private const val MOD = 1000000007
    }
}
