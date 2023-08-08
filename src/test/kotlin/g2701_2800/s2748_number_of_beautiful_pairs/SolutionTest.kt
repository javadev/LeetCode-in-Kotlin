package g2701_2800.s2748_number_of_beautiful_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBeautifulPairs() {
        assertThat(Solution().countBeautifulPairs(intArrayOf(2, 5, 1, 4)), equalTo(5))
    }

    @Test
    fun countBeautifulPairs2() {
        assertThat(Solution().countBeautifulPairs(intArrayOf(11, 21, 12)), equalTo(2))
    }
}
