package g1701_1800.s1787_make_the_xor_of_all_segments_equal_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minChanges() {
        assertThat(Solution().minChanges(intArrayOf(1, 2, 0, 3, 0), 1), equalTo(3))
    }

    @Test
    fun minChanges2() {
        assertThat(Solution().minChanges(intArrayOf(3, 4, 5, 2, 1, 7, 3, 4, 7), 3), equalTo(3))
    }

    @Test
    fun minChanges3() {
        assertThat(Solution().minChanges(intArrayOf(1, 2, 4, 1, 2, 5, 1, 2, 6), 3), equalTo(3))
    }
}
