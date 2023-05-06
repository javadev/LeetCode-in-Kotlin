package g0901_1000.s0975_odd_even_jump

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun oddEvenJumps() {
        assertThat(Solution().oddEvenJumps(intArrayOf(10, 13, 12, 14, 15)), equalTo(2))
    }

    @Test
    fun oddEvenJumps2() {
        assertThat(Solution().oddEvenJumps(intArrayOf(2, 3, 1, 1, 4)), equalTo(3))
    }

    @Test
    fun oddEvenJumps3() {
        assertThat(Solution().oddEvenJumps(intArrayOf(5, 1, 3, 4, 2)), equalTo(3))
    }
}
