package g3401_3500.s3445_maximum_difference_between_even_and_odd_frequency_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDifference() {
        assertThat<Int>(Solution().maxDifference("12233", 4), equalTo<Int>(-1))
    }

    @Test
    fun maxDifference2() {
        assertThat<Int>(Solution().maxDifference("1122211", 3), equalTo<Int>(1))
    }

    @Test
    fun maxDifference3() {
        assertThat<Int>(Solution().maxDifference("110", 3), equalTo<Int>(-1))
    }
}
