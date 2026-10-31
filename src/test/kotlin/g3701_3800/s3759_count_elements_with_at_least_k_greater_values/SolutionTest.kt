package g3701_3800.s3759_count_elements_with_at_least_k_greater_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countElements() {
        assertThat<Int>(Solution().countElements(intArrayOf(3, 1, 2), 1), equalTo<Int>(2))
    }

    @Test
    fun countElements2() {
        assertThat<Int>(Solution().countElements(intArrayOf(5, 5, 5), 2), equalTo<Int>(0))
    }

    @Test
    fun countElements3() {
        assertThat<Int>(Solution().countElements(intArrayOf(5, 5, 5), 0), equalTo<Int>(3))
    }
}
