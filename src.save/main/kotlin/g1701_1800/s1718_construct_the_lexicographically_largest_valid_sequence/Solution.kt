package g1701_1800.s1718_construct_the_lexicographically_largest_valid_sequence

// #Medium #Array #Backtracking #2023_06_16_Time_140_ms_(100.00%)_Space_33.2_MB_(100.00%)

class Solution {
    fun constructDistancedSequence(n: Int): IntArray {
        val result = IntArray(n * 2 - 1)
        val visited = BooleanArray(n + 1)
        backtracking(0, result, visited, n)
        return result
    }

    private fun backtracking(index: Int, result: IntArray, visited: BooleanArray, n: Int): Boolean {
        if (index == result.size) {
            return true
        }
        if (result[index] != 0) {
            return backtracking(index + 1, result, visited, n)
        } else {
            for (i in n downTo 1) {
                if (visited[i]) {
                    continue
                }
                visited[i] = true
                result[index] = i
                if (i == 1) {
                    if (backtracking(index + 1, result, visited, n)) {
                        return true
                    }
                } else if (index + i < result.size && result[index + i] == 0) {
                    result[i + index] = i
                    if (backtracking(index + 1, result, visited, n)) {
                        return true
                    }
                    result[index + i] = 0
                }
                result[index] = 0
                visited[i] = false
            }
        }
        return false
    }
}
