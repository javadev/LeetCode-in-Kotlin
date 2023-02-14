package g0601_0700.s0668_kth_smallest_number_in_multiplication_table

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthNumber() {
        assertThat(Solution().findKthNumber(3, 3, 5), equalTo(3))
    }

    @Test
    fun findKthNumber2() {
        assertThat(Solution().findKthNumber(2, 3, 6), equalTo(6))
    }
}
