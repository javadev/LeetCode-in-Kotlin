package g1201_1300.s1224_maximum_equal_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxEqualFreq() {
        assertThat(Solution().maxEqualFreq(intArrayOf(2, 2, 1, 1, 5, 3, 3, 5)), equalTo(7))
    }

    @Test
    fun maxEqualFreq2() {
        assertThat(
            Solution().maxEqualFreq(intArrayOf(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5)),
            equalTo(13),
        )
    }
}
