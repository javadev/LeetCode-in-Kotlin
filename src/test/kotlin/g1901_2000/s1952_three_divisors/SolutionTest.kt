package g1901_2000.s1952_three_divisors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isThree() {
        assertThat(Solution().isThree(2), equalTo(false))
    }

    @Test
    fun isThree2() {
        assertThat(Solution().isThree(4), equalTo(true))
    }
}
