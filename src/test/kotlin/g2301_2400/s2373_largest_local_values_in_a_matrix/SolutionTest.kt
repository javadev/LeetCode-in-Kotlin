package g2301_2400.s2373_largest_local_values_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestLocal() {
        assertThat(
            Solution()
                .largestLocal(
                    arrayOf(
                        intArrayOf(9, 9, 8, 1),
                        intArrayOf(5, 6, 2, 6),
                        intArrayOf(8, 2, 6, 4),
                        intArrayOf(6, 2, 2, 2)
                    )
                ),
            equalTo(arrayOf(intArrayOf(9, 9), intArrayOf(8, 6)))
        )
    }

    @Test
    fun largestLocal2() {
        assertThat(
            Solution()
                .largestLocal(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 2, 1, 1),
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1, 1)
                    )
                ),
            equalTo(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2), intArrayOf(2, 2, 2)))
        )
    }
}
