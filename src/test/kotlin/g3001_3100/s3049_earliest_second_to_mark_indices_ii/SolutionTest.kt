package g3001_3100.s3049_earliest_second_to_mark_indices_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestSecondToMarkIndices() {
        assertThat(
            Solution()
                .earliestSecondToMarkIndices(
                    intArrayOf(3, 2, 3), intArrayOf(1, 3, 2, 2, 2, 2, 3)
                ),
            equalTo(6)
        )
    }

    @Test
    fun earliestSecondToMarkIndices2() {
        assertThat(
            Solution()
                .earliestSecondToMarkIndices(
                    intArrayOf(0, 0, 1, 2), intArrayOf(1, 2, 1, 2, 1, 2, 1, 2)
                ),
            equalTo(7)
        )
    }

    @Test
    fun earliestSecondToMarkIndices3() {
        assertThat(
            Solution()
                .earliestSecondToMarkIndices(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)),
            equalTo(-1)
        )
    }
}
