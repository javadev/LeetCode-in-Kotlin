package g0401_0500.s0440_k_th_smallest_in_lexicographical_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthNumber() {
        assertThat(Solution().findKthNumber(13, 2), equalTo(10))
    }

    @Test
    fun findKthNumber2() {
        assertThat(Solution().findKthNumber(1, 1), equalTo(1))
    }
}
