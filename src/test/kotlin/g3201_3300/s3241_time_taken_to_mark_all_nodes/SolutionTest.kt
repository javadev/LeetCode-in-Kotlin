package g3201_3300.s3241_time_taken_to_mark_all_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun timeTaken() {
        assertThat(
            Solution().timeTaken(arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))),
            equalTo(intArrayOf(2, 4, 3))
        )
    }

    @Test
    fun timeTaken2() {
        assertThat(
            Solution().timeTaken(arrayOf(intArrayOf(0, 1))),
            equalTo(intArrayOf(1, 2))
        )
    }

    @Test
    fun timeTaken3() {
        assertThat(
            Solution().timeTaken(arrayOf(intArrayOf(2, 4), intArrayOf(0, 1), intArrayOf(2, 3), intArrayOf(0, 2))),
            equalTo(intArrayOf(4, 6, 3, 5, 5))
        )
    }
}
