package g3101_3200.s3160_find_the_number_of_distinct_colors_among_the_balls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun queryResults() {
        assertThat(
            Solution().queryResults(4, arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(1, 3), intArrayOf(3, 4))),
            equalTo(intArrayOf(1, 2, 2, 3)),
        )
    }

    @Test
    fun queryResults2() {
        assertThat(
            Solution()
                .queryResults(
                    4,
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 5)),
                ),
            equalTo(intArrayOf(1, 2, 2, 3, 4)),
        )
    }

    @Test
    fun queryResults3() {
        assertThat(
            Solution()
                .queryResults(
                    1,
                    arrayOf(intArrayOf(0, 2), intArrayOf(1, 10), intArrayOf(0, 10), intArrayOf(0, 3), intArrayOf(1, 5)),
                ),
            equalTo(intArrayOf(1, 2, 1, 2, 2)),
        )
    }
}
