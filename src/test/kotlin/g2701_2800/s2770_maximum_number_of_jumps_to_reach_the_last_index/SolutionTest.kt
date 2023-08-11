package g2701_2800.s2770_maximum_number_of_jumps_to_reach_the_last_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumJumps() {
        assertThat(Solution().maximumJumps(intArrayOf(1, 3, 6, 4, 1, 2), 2), equalTo(3))
    }

    @Test
    fun maximumJumps2() {
        assertThat(Solution().maximumJumps(intArrayOf(1, 3, 6, 4, 1, 2), 3), equalTo(5))
    }

    @Test
    fun maximumJumps3() {
        assertThat(Solution().maximumJumps(intArrayOf(1, 3, 6, 4, 1, 2), 0), equalTo(-1))
    }
}
