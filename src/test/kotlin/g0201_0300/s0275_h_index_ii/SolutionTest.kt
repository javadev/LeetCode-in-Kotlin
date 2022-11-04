package g0201_0300.s0275_h_index_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hIndex() {
        assertThat(Solution().hIndex(intArrayOf(0, 1, 3, 5, 6)), equalTo(3))
    }

    @Test
    fun hIndex2() {
        assertThat(Solution().hIndex(intArrayOf(1, 2, 100)), equalTo(2))
    }
}
