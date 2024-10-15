package g3301_3400.s3314_construct_the_minimum_bitwise_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minBitwiseArray() {
        assertThat<IntArray?>(
            Solution().minBitwiseArray(mutableListOf<Int>(2, 3, 5, 7)),
            equalTo<IntArray?>(intArrayOf(-1, 1, 4, 3))
        )
    }

    @Test
    fun minBitwiseArray2() {
        assertThat<IntArray?>(
            Solution().minBitwiseArray(mutableListOf<Int>(11, 13, 31)),
            equalTo<IntArray?>(intArrayOf(9, 12, 15))
        )
    }
}
