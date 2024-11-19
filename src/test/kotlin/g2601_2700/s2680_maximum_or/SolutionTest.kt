package g2601_2700.s2680_maximum_or

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumOr() {
        assertThat(
            Solution().maximumOr(intArrayOf(12, 9), 1),
            equalTo(30),
        )
    }

    @Test
    fun maximumOr2() {
        assertThat(
            Solution().maximumOr(intArrayOf(8, 1, 2), 2),
            equalTo(35),
        )
    }
}
