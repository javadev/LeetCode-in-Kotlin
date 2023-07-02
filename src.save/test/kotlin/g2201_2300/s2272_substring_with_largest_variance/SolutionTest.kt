package g2201_2300.s2272_substring_with_largest_variance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestVariance() {
        assertThat(Solution().largestVariance("aababbb"), equalTo(3))
    }

    @Test
    fun largestVariance2() {
        assertThat(Solution().largestVariance("abcde"), equalTo(0))
    }
}
