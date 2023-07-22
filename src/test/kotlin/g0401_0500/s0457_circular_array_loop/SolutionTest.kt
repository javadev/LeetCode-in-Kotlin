package g0401_0500.s0457_circular_array_loop

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun circularArrayLoop() {
        assertThat(Solution().circularArrayLoop(intArrayOf(2, -1, 1, 2, 2)), equalTo(true))
    }

    @Test
    fun circularArrayLoop2() {
        assertThat(Solution().circularArrayLoop(intArrayOf(-1, 2)), equalTo(false))
    }

    @Test
    fun circularArrayLoop3() {
        assertThat(Solution().circularArrayLoop(intArrayOf(-2, 1, -1, -2, -2)), equalTo(false))
    }
}
