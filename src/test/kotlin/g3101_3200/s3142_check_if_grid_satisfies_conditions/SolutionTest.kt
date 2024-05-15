package g3101_3200.s3142_check_if_grid_satisfies_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun satisfiesConditions() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 0, 2), intArrayOf(1, 0, 2))),
            equalTo(true)
        )
    }

    @Test
    fun satisfiesConditions2() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 0, 0))),
            equalTo(false)
        )
    }
}
