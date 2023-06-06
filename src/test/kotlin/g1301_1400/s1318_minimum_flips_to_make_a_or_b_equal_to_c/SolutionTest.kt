package g1301_1400.s1318_minimum_flips_to_make_a_or_b_equal_to_c

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat(Solution().minFlips(2, 6, 5), equalTo(3))
    }

    @Test
    fun minFlips2() {
        assertThat(Solution().minFlips(4, 2, 7), equalTo(1))
    }

    @Test
    fun minFlips3() {
        assertThat(Solution().minFlips(1, 2, 3), equalTo(0))
    }
}
