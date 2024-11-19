package g0201_0300.s0238_product_of_array_except_self

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun productExceptSelf() {
        assertThat(
            Solution().productExceptSelf(intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(24, 12, 8, 6)),
        )
    }

    @Test
    fun productExceptSelf2() {
        assertThat(
            Solution().productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)),
            equalTo(intArrayOf(0, 0, 9, 0, 0)),
        )
    }
}
