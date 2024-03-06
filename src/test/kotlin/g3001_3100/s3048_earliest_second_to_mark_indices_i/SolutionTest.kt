package g3001_3100.s3048_earliest_second_to_mark_indices_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun earliestSecondToMarkIndices() {
        assertThat(
            Solution()
                .earliestSecondToMarkIndices(
                    intArrayOf(2, 2, 0), intArrayOf(2, 2, 2, 2, 3, 2, 2, 1)
                ),
            equalTo(8)
        )
    }

    @Test
    fun earliestSecondToMarkIndices2() {
        assertThat(
            Solution()
                .earliestSecondToMarkIndices(
                    intArrayOf(1, 3), intArrayOf(1, 1, 1, 2, 1, 1, 1)
                ),
            equalTo(6)
        )
    }

    @Test
    fun earliestSecondToMarkIndices3() {
        assertThat(
            Solution().earliestSecondToMarkIndices(intArrayOf(0, 1), intArrayOf(2, 2, 2)),
            equalTo(-1)
        )
    }
}
