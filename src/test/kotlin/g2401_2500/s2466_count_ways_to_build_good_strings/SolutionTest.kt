package g2401_2500.s2466_count_ways_to_build_good_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodStrings() {
        assertThat(Solution().countGoodStrings(3, 3, 1, 1), equalTo(8))
    }

    @Test
    fun countGoodStrings2() {
        assertThat(Solution().countGoodStrings(2, 3, 1, 2), equalTo(5))
    }
}
