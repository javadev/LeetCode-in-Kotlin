package g0901_1000.s0905_sort_array_by_parity

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortArrayByParity() {
        assertThat(
            compareArray(
                Solution().sortArrayByParity(intArrayOf(3, 1, 2, 4)),
                intArrayOf(2, 4, 3, 1),
            ),
            equalTo(true),
        )
    }

    @Test
    fun sortArrayByParity2() {
        assertThat(Solution().sortArrayByParity(intArrayOf(0)), equalTo(intArrayOf(0)))
    }

    private fun compareArray(arr1: IntArray, arr2: IntArray): Boolean {
        for (i in arr1) {
            var include = false
            for (j in arr2) {
                if (i == j) {
                    include = true
                    break
                }
            }
            if (!include) {
                return false
            }
        }
        return true
    }
}
