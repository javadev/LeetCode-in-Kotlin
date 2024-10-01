package g3201_3300.s3300_minimum_element_after_replacement_with_digit_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minElement() {
        assertThat<Int>(Solution().minElement(intArrayOf(10, 12, 13, 14)), equalTo<Int>(1))
    }

    @Test
    fun minElement2() {
        assertThat<Int>(Solution().minElement(intArrayOf(1, 2, 3, 4)), equalTo<Int>(1))
    }

    @Test
    fun minElement3() {
        assertThat<Int>(Solution().minElement(intArrayOf(999, 19, 199)), equalTo<Int>(10))
    }
}
