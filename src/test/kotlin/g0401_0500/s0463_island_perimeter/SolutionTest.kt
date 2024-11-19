package g0401_0500.s0463_island_perimeter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun islandPerimeter() {
        assertThat(
            Solution()
                .islandPerimeter(
                    arrayOf(
                        intArrayOf(0, 1, 0, 0),
                        intArrayOf(1, 1, 1, 0),
                        intArrayOf(0, 1, 0, 0),
                        intArrayOf(1, 1, 0, 0),
                    ),
                ),
            equalTo(16),
        )
    }

    @Test
    fun islandPerimeter2() {
        assertThat(Solution().islandPerimeter(arrayOf(intArrayOf(1))), equalTo(4))
    }

    @Test
    fun islandPerimeter3() {
        assertThat(Solution().islandPerimeter(arrayOf(intArrayOf(1, 0))), equalTo(4))
    }
}
