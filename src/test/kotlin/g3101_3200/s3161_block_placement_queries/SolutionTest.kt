package g3101_3200.s3161_block_placement_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun results() {
        assertThat(
            Solution().getResults(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3, 3),
                    intArrayOf(2, 3, 1),
                    intArrayOf(2, 2, 2),
                ),
            ),
            equalTo(listOf(false, true, true)),
        )
    }

    @Test
    fun results2() {
        assertThat(
            Solution()
                .getResults(
                    arrayOf(
                        intArrayOf(1, 7),
                        intArrayOf(2, 7, 6),
                        intArrayOf(1, 2),
                        intArrayOf(2, 7, 5),
                        intArrayOf(2, 7, 6),
                    ),
                ),
            equalTo(listOf(true, true, false)),
        )
    }

    @Test
    fun results3() {
        assertThat(
            Solution()
                .getResults(
                    arrayOf(
                        intArrayOf(1, 4),
                        intArrayOf(1, 9),
                        intArrayOf(2, 15, 4),
                        intArrayOf(2, 11, 6),
                        intArrayOf(2, 13, 10),
                    ),
                ),
            equalTo(listOf(true, false, false)),
        )
    }
}
