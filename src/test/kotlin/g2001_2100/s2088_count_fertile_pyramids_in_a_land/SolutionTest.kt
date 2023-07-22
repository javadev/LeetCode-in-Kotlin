package g2001_2100.s2088_count_fertile_pyramids_in_a_land

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPyramids() {
        assertThat(
            Solution().countPyramids(arrayOf(intArrayOf(0, 1, 1, 0), intArrayOf(1, 1, 1, 1))), equalTo(2)
        )
    }

    @Test
    fun countPyramids2() {
        assertThat(
            Solution().countPyramids(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))),
            equalTo(2)
        )
    }

    @Test
    fun countPyramids3() {
        assertThat(
            Solution()
                .countPyramids(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1, 0),
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(0, 1, 0, 0, 1)
                    )
                ),
            equalTo(13)
        )
    }
}
