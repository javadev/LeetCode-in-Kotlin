package g2901_3000.s2903_find_indices_with_index_and_value_difference_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findIndices() {
        assertThat(
            Solution().findIndices(intArrayOf(5, 1, 4, 1), 2, 4),
            equalTo(intArrayOf(0, 3)),
        )
    }

    @Test
    fun findIndices2() {
        assertThat(Solution().findIndices(intArrayOf(2, 1), 0, 0), equalTo(intArrayOf(0, 0)))
    }

    @Test
    fun findIndices3() {
        assertThat(
            Solution().findIndices(intArrayOf(1, 2, 3), 2, 4),
            equalTo(intArrayOf(-1, -1)),
        )
    }
}
