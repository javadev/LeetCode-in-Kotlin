package g0801_0900.s0881_boats_to_save_people

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numRescueBoats() {
        assertThat(Solution().numRescueBoats(intArrayOf(1, 2), 3), equalTo(1))
    }

    @Test
    fun numRescueBoats2() {
        assertThat(Solution().numRescueBoats(intArrayOf(3, 2, 2, 1), 3), equalTo(3))
    }

    @Test
    fun numRescueBoats3() {
        assertThat(Solution().numRescueBoats(intArrayOf(3, 5, 3, 4), 5), equalTo(4))
    }
}
