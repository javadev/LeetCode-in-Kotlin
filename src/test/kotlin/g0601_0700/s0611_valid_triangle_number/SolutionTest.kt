package g0601_0700.s0611_valid_triangle_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun triangleNumber() {
        assertThat(Solution().triangleNumber(intArrayOf(2, 2, 3, 4)), equalTo(3))
    }

    @Test
    fun triangleNumber2() {
        assertThat(Solution().triangleNumber(intArrayOf(4, 2, 3, 4)), equalTo(4))
    }
}
