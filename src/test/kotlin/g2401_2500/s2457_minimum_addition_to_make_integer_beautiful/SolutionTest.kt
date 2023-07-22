package g2401_2500.s2457_minimum_addition_to_make_integer_beautiful

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeIntegerBeautiful() {
        assertThat(Solution().makeIntegerBeautiful(16, 6), equalTo(4L))
    }

    @Test
    fun makeIntegerBeautiful2() {
        assertThat(Solution().makeIntegerBeautiful(467, 6), equalTo(33L))
    }

    @Test
    fun makeIntegerBeautiful3() {
        assertThat(Solution().makeIntegerBeautiful(1, 1), equalTo(0L))
    }
}
