package g0501_0600.s0526_beautiful_arrangement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countArrangement() {
        assertThat(Solution().countArrangement(2), equalTo(2))
    }

    @Test
    fun countArrangement2() {
        assertThat(Solution().countArrangement(1), equalTo(1))
    }
}
