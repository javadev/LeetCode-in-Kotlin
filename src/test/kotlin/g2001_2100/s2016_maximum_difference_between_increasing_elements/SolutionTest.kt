package g2001_2100.s2016_maximum_difference_between_increasing_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumDifference() {
        assertThat(Solution().maximumDifference(intArrayOf(7, 1, 5, 4)), equalTo(4))
    }

    @Test
    fun maximumDifference2() {
        assertThat(Solution().maximumDifference(intArrayOf(9, 4, 3, 2)), equalTo(-1))
    }

    @Test
    fun maximumDifference3() {
        assertThat(Solution().maximumDifference(intArrayOf(1, 5, 2, 10)), equalTo(9))
    }
}
