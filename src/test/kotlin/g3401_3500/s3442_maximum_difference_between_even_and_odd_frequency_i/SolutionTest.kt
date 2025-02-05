package g3401_3500.s3442_maximum_difference_between_even_and_odd_frequency_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDifference() {
        assertThat<Int>(Solution().maxDifference("aaaaabbc"), equalTo<Int>(3))
    }

    @Test
    fun maxDifference2() {
        assertThat<Int>(Solution().maxDifference("abcabcab"), equalTo<Int>(1))
    }
}
