package g0901_1000.s0961_n_repeated_element_in_size_2n_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatedNTimes() {
        assertThat(Solution().repeatedNTimes(intArrayOf(1, 2, 3, 3)), equalTo(3))
    }

    @Test
    fun repeatedNTimes2() {
        assertThat(Solution().repeatedNTimes(intArrayOf(2, 1, 2, 5, 3, 2)), equalTo(2))
    }

    @Test
    fun repeatedNTimes3() {
        assertThat(Solution().repeatedNTimes(intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)), equalTo(5))
    }
}
