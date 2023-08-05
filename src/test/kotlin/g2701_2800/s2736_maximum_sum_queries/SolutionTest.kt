package g2701_2800.s2736_maximum_sum_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSumQueries() {
        assertThat(
            Solution().maximumSumQueries(
                intArrayOf(4, 3, 1, 2), intArrayOf(2, 4, 9, 5),
                arrayOf(
                    intArrayOf(4, 1),
                    intArrayOf(1, 3), intArrayOf(2, 5)
                )
            ),
            equalTo(intArrayOf(6, 10, 7))
        )
    }

    @Test
    fun maximumSumQueries2() {
        assertThat(
            Solution().maximumSumQueries(
                intArrayOf(3, 2, 5), intArrayOf(2, 3, 4),
                arrayOf(
                    intArrayOf(4, 4),
                    intArrayOf(3, 2), intArrayOf(1, 1)
                )
            ),
            equalTo(intArrayOf(9, 9, 9))
        )
    }

    @Test
    fun maximumSumQueries3() {
        assertThat(
            Solution().maximumSumQueries(
                intArrayOf(2, 1), intArrayOf(2, 3),
                arrayOf(intArrayOf(3, 3))
            ),
            equalTo(intArrayOf(-1))
        )
    }
}
