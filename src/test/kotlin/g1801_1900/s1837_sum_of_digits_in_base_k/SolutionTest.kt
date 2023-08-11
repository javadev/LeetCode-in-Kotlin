package g1801_1900.s1837_sum_of_digits_in_base_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumBase() {
        assertThat(Solution().sumBase(34, 6), equalTo(9))
    }

    @Test
    fun sumBase2() {
        assertThat(Solution().sumBase(10, 10), equalTo(1))
    }
}
