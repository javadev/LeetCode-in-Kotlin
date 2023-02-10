package g0601_0700.s0632_smallest_range_covering_elements_from_k_lists

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestRange() {
        assertThat(
            Solution()
                .smallestRange(
                    listOf(
                        listOf(4, 10, 15, 24, 26),
                        listOf(0, 9, 12, 20),
                        listOf(5, 18, 22, 30)
                    )
                ),
            equalTo(intArrayOf(24, 20))
        )
    }

    @Test
    fun smallestRange2() {
        assertThat(
            Solution()
                .smallestRange(
                    listOf(
                        listOf(1, 2, 3),
                        listOf(1, 2, 3),
                        listOf(1, 2, 3)
                    )
                ),
            equalTo(intArrayOf(1, 1))
        )
    }
}
