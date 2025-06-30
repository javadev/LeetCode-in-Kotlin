package g3501_3600.s3599_partition_array_to_minimize_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minXor() {
        assertThat<Int>(Solution().minXor(intArrayOf(1, 2, 3), 2), equalTo<Int>(1))
    }

    @Test
    fun minXor2() {
        assertThat<Int>(Solution().minXor(intArrayOf(2, 3, 3, 2), 3), equalTo<Int>(2))
    }

    @Test
    fun minXor3() {
        assertThat<Int>(Solution().minXor(intArrayOf(1, 1, 2, 3, 1), 2), equalTo<Int>(0))
    }
}
