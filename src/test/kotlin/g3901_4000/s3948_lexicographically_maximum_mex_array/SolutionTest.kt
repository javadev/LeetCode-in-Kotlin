package g3901_4000.s3948_lexicographically_maximum_mex_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumMEX() {
        assertThat<IntArray>(
            Solution().maximumMEX(intArrayOf(0, 1, 0)),
            equalTo<IntArray>(intArrayOf(2, 1)),
        )
    }

    @Test
    fun maximumMEX2() {
        assertThat<IntArray>(
            Solution().maximumMEX(intArrayOf(1, 0, 2)),
            equalTo<IntArray>(intArrayOf(3)),
        )
    }

    @Test
    fun maximumMEX3() {
        assertThat<IntArray>(
            Solution().maximumMEX(intArrayOf(3, 1)),
            equalTo<IntArray>(intArrayOf(0, 0)),
        )
    }

    @Test
    fun maximumMEX4() {
        assertThat<IntArray>(
            Solution().maximumMEX(intArrayOf(0)),
            equalTo<IntArray>(intArrayOf(1)),
        )
    }
}
