package g2201_2300.s2261_k_divisible_elements_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDistinct() {
        assertThat(Solution().countDistinct(intArrayOf(2, 3, 3, 2, 2), 2, 2), equalTo(11))
    }

    @Test
    fun countDistinct2() {
        assertThat(Solution().countDistinct(intArrayOf(1, 2, 3, 4), 4, 1), equalTo(10))
    }
}
