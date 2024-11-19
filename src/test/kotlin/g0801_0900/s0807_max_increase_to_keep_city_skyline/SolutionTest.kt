package g0801_0900.s0807_max_increase_to_keep_city_skyline

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxIncreaseKeepingSkyline() {
        assertThat(
            Solution()
                .maxIncreaseKeepingSkyline(
                    arrayOf(
                        intArrayOf(3, 0, 8, 4),
                        intArrayOf(2, 4, 5, 7),
                        intArrayOf(9, 2, 6, 3),
                        intArrayOf(0, 3, 1, 0),
                    ),
                ),
            equalTo(35),
        )
    }

    @Test
    fun maxIncreaseKeepingSkyline2() {
        assertThat(
            Solution()
                .maxIncreaseKeepingSkyline(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))),
            equalTo(0),
        )
    }
}
