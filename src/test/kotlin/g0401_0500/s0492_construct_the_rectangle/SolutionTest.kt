package g0401_0500.s0492_construct_the_rectangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructRectangle() {
        assertThat(Solution().constructRectangle(4), equalTo(intArrayOf(2, 2)))
    }

    @Test
    fun constructRectangle2() {
        assertThat(Solution().constructRectangle(37), equalTo(intArrayOf(37, 1)))
    }

    @Test
    fun constructRectangle3() {
        assertThat(Solution().constructRectangle(122122), equalTo(intArrayOf(427, 286)))
    }
}
