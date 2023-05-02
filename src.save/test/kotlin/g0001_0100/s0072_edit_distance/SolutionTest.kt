package g0001_0100.s0072_edit_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistance() {
        assertThat(Solution().minDistance("horse", "ros"), equalTo(3))
    }

    @Test
    fun minDistance2() {
        assertThat(Solution().minDistance("intention", "execution"), equalTo(5))
    }
}
