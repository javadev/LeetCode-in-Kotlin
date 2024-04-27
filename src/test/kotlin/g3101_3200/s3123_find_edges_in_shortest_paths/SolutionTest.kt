package g3101_3200.s3123_find_edges_in_shortest_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAnswer() {
        assertThat(
            Solution()
                .findAnswer(
                    6,
                    arrayOf(
                        intArrayOf(0, 1, 4),
                        intArrayOf(0, 2, 1),
                        intArrayOf(1, 3, 2),
                        intArrayOf(1, 4, 3),
                        intArrayOf(1, 5, 1),
                        intArrayOf(2, 3, 1),
                        intArrayOf(3, 5, 3),
                        intArrayOf(4, 5, 2)
                    )
                ),
            equalTo(booleanArrayOf(true, true, true, false, true, true, true, false))
        )
    }

    @Test
    fun findAnswer2() {
        assertThat(
            Solution()
                .findAnswer(
                    4,
                    arrayOf(intArrayOf(2, 0, 1), intArrayOf(0, 1, 1), intArrayOf(0, 3, 4), intArrayOf(3, 2, 2))
                ),
            equalTo(booleanArrayOf(true, false, false, true))
        )
    }
}
