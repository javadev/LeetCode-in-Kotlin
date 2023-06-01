package g0801_0900.s0898_bitwise_ors_of_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarrayBitwiseORs() {
        assertThat(Solution().subarrayBitwiseORs(intArrayOf(0)), equalTo(1))
    }

    @Test
    fun subarrayBitwiseORs2() {
        assertThat(Solution().subarrayBitwiseORs(intArrayOf(1, 1, 2)), equalTo(3))
    }

    @Test
    fun subarrayBitwiseORs3() {
        assertThat(Solution().subarrayBitwiseORs(intArrayOf(1, 2, 4)), equalTo(6))
    }
}
