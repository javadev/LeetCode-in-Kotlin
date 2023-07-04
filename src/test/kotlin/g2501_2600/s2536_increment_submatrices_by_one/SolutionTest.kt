package g2501_2600.s2536_increment_submatrices_by_one

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rangeAddQueries() {
        assertThat(
            Solution().rangeAddQueries(3, arrayOf(intArrayOf(1, 1, 2, 2), intArrayOf(0, 0, 1, 1))),
            equalTo(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 2, 1), intArrayOf(0, 1, 1)))
        )
    }

    @Test
    fun rangeAddQueries2() {
        assertThat(
            Solution().rangeAddQueries(2, arrayOf(intArrayOf(0, 0, 1, 1))),
            equalTo(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1)))
        )
    }
}
