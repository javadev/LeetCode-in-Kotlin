package g1901_2000.s1905_count_sub_islands

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubIslands() {
        assertThat(
            Solution()
                .countSubIslands(
                    arrayOf(
                        intArrayOf(1, 1, 1, 0, 0), intArrayOf(0, 1, 1, 1, 1),
                        intArrayOf(0, 0, 0, 0, 0), intArrayOf(1, 0, 0, 0, 0), intArrayOf(1, 1, 0, 1, 1)
                    ),
                    arrayOf(
                        intArrayOf(1, 1, 1, 0, 0), intArrayOf(0, 0, 1, 1, 1),
                        intArrayOf(0, 1, 0, 0, 0), intArrayOf(1, 0, 1, 1, 0), intArrayOf(0, 1, 0, 1, 0)
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun countSubIslands2() {
        assertThat(
            Solution()
                .countSubIslands(
                    arrayOf(
                        intArrayOf(1, 0, 1, 0, 1), intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(0, 0, 0, 0, 0), intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 0, 1, 0, 1)
                    ),
                    arrayOf(
                        intArrayOf(0, 0, 0, 0, 0), intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(0, 1, 0, 1, 0), intArrayOf(0, 1, 0, 1, 0), intArrayOf(1, 0, 0, 0, 1)
                    )
                ),
            equalTo(2)
        )
    }
}
