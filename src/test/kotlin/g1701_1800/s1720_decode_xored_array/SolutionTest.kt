package g1701_1800.s1720_decode_xored_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decode() {
        assertThat(Solution().decode(intArrayOf(1, 2, 3), 1), equalTo(intArrayOf(1, 0, 2, 1)))
    }

    @Test
    fun decode2() {
        assertThat(
                Solution().decode(intArrayOf(6, 2, 7, 3), 4),
                equalTo(intArrayOf(4, 2, 0, 7, 4)))
    }
}
