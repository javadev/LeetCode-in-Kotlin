package g3901_4000.s3989_maximum_consistent_columns_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxConsistentColumns() {
        assertThat<Int>(
            Solution().maxConsistentColumns(arrayOf<IntArray>(intArrayOf(-2, 0, 3)), 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxConsistentColumns2() {
        assertThat<Int>(
            Solution().maxConsistentColumns(arrayOf<IntArray>(intArrayOf(1, -1, 1), intArrayOf(2, 2, 2)), 1),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxConsistentColumns3() {
        assertThat<Int>(
            Solution().maxConsistentColumns(arrayOf<IntArray>(intArrayOf(-5, 5)), 9),
            equalTo<Int>(1),
        )
    }
}
