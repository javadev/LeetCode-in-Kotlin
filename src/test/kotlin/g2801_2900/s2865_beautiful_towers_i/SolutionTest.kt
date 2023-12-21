package g2801_2900.s2865_beautiful_towers_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSumOfHeights() {
        assertThat(
            Solution().maximumSumOfHeights(mutableListOf(5, 3, 4, 1, 1)),
            equalTo(13L)
        )
    }

    @Test
    fun maximumSumOfHeights2() {
        assertThat(
            Solution().maximumSumOfHeights(mutableListOf(6, 5, 3, 9, 2, 7)), equalTo(22L)
        )
    }

    @Test
    fun maximumSumOfHeights3() {
        assertThat(
            Solution().maximumSumOfHeights(mutableListOf(3, 2, 5, 5, 2, 3)), equalTo(18L)
        )
    }
}
