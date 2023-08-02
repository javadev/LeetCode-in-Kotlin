package g1301_1400.s1337_the_k_weakest_rows_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kWeakestRows() {
        val mat = arrayOf(
            intArrayOf(1, 1, 0, 0, 0), intArrayOf(1, 1, 1, 1, 0), intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0), intArrayOf(1, 1, 1, 1, 1)
        )
        assertThat(Solution().kWeakestRows(mat, 3), equalTo(intArrayOf(2, 0, 3)))
    }

    @Test
    fun kWeakestRows2() {
        val mat = arrayOf(
            intArrayOf(1, 0, 0, 0), intArrayOf(1, 1, 1, 1), intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 0)
        )
        assertThat(Solution().kWeakestRows(mat, 2), equalTo(intArrayOf(0, 2)))
    }
}
