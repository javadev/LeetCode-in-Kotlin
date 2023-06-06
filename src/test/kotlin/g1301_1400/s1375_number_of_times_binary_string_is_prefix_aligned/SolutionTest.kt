package g1301_1400.s1375_number_of_times_binary_string_is_prefix_aligned

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTimesAllBlue() {
        assertThat(Solution().numTimesAllBlue(intArrayOf(3, 2, 4, 1, 5)), equalTo(2))
    }

    @Test
    fun numTimesAllBlue2() {
        assertThat(Solution().numTimesAllBlue(intArrayOf(4, 1, 2, 3)), equalTo(1))
    }
}
