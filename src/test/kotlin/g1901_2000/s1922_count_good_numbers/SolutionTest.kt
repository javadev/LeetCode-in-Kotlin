package g1901_2000.s1922_count_good_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodNumbers() {
        assertThat(Solution().countGoodNumbers(1), equalTo(5))
    }

    @Test
    fun countGoodNumbers2() {
        assertThat(Solution().countGoodNumbers(4), equalTo(400))
    }

    @Test
    fun countGoodNumbers3() {
        assertThat(Solution().countGoodNumbers(50), equalTo(564908303))
    }
}
