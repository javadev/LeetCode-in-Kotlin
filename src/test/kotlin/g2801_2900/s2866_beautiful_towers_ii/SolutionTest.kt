package g2801_2900.s2866_beautiful_towers_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSumOfHeights() {
        MatcherAssert.assertThat(
            Solution().maximumSumOfHeights(mutableListOf(5, 3, 4, 1, 1)),
            CoreMatchers.equalTo(13L)
        )
    }

    @Test
    fun maximumSumOfHeights2() {
        MatcherAssert.assertThat(
            Solution().maximumSumOfHeights(mutableListOf(6, 5, 3, 9, 2, 7)), CoreMatchers.equalTo(22L)
        )
    }

    @Test
    fun maximumSumOfHeights3() {
        MatcherAssert.assertThat(
            Solution().maximumSumOfHeights(mutableListOf(3, 2, 5, 5, 2, 3)), CoreMatchers.equalTo(18L)
        )
    }
}
