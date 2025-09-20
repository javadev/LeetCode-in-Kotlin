package g3601_3700.s3681_maximum_xor_of_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxXorSubsequences() {
        assertThat<Int>(
            Solution().maxXorSubsequences(intArrayOf(1, 2, 3)),
            equalTo<Int>(3)
        )
    }

    @Test
    fun maxXorSubsequences2() {
        assertThat<Int>(Solution().maxXorSubsequences(intArrayOf(5, 2)), equalTo<Int>(7))
    }
}
