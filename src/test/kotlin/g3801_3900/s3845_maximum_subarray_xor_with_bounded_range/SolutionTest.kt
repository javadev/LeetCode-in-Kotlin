package g3801_3900.s3845_maximum_subarray_xor_with_bounded_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxXor() {
        assertThat<Int>(Solution().maxXor(intArrayOf(5, 4, 5, 6), 2), equalTo<Int>(7))
    }

    @Test
    fun maxXor2() {
        assertThat<Int>(Solution().maxXor(intArrayOf(5, 4, 5, 6), 1), equalTo<Int>(6))
    }
}
