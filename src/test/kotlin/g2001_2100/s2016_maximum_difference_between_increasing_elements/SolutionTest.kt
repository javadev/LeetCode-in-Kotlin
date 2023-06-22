package g2001_2100.s2016_maximum_difference_between_increasing_elements

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumDifference() {
        MatcherAssert.assertThat(Solution().maximumDifference(intArrayOf(7, 1, 5, 4)), CoreMatchers.equalTo(4))
    }

    @Test
    fun maximumDifference2() {
        MatcherAssert.assertThat(Solution().maximumDifference(intArrayOf(9, 4, 3, 2)), CoreMatchers.equalTo(-1))
    }

    @Test
    fun maximumDifference3() {
        MatcherAssert.assertThat(Solution().maximumDifference(intArrayOf(1, 5, 2, 10)), CoreMatchers.equalTo(9))
    }
}
