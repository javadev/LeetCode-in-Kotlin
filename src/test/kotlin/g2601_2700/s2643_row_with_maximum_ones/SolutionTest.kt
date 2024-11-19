package g2601_2700.s2643_row_with_maximum_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rowAndMaximumOnes() {
        assertThat(
            Solution().rowAndMaximumOnes(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))),
            equalTo(
                intArrayOf(0, 1),
            ),
        )
    }

    @Test
    fun rowAndMaximumOnes2() {
        assertThat(
            Solution().rowAndMaximumOnes(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))),
            equalTo(
                intArrayOf(1, 2),
            ),
        )
    }

    @Test
    fun rowAndMaximumOnes3() {
        assertThat(
            Solution().rowAndMaximumOnes(arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(0, 0))),
            equalTo(
                intArrayOf(1, 2),
            ),
        )
    }
}
