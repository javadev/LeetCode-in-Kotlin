package g0201_0300.s0274_h_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hIndex() {
        assertThat(Solution().hIndex(intArrayOf(3, 0, 6, 1, 5)), equalTo(3))
    }

    @Test
    fun hIndex2() {
        assertThat(Solution().hIndex(intArrayOf(1, 3, 1)), equalTo(1))
    }
}
