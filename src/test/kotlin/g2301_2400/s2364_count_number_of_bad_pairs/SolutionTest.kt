package g2301_2400.s2364_count_number_of_bad_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBadPairs() {
        assertThat(Solution().countBadPairs(intArrayOf(4, 1, 3, 3)), equalTo(5L))
    }

    @Test
    fun countBadPairs2() {
        assertThat(Solution().countBadPairs(intArrayOf(1, 2, 3, 4, 5)), equalTo(0L))
    }
}
