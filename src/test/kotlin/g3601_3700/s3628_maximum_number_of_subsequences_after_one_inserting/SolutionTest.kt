package g3601_3700.s3628_maximum_number_of_subsequences_after_one_inserting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfSubsequences() {
        assertThat<Long>(Solution().numOfSubsequences("LMCT"), equalTo<Long>(2L))
    }

    @Test
    fun numOfSubsequences2() {
        assertThat<Long>(Solution().numOfSubsequences("LCCT"), equalTo<Long>(4L))
    }

    @Test
    fun numOfSubsequences3() {
        assertThat<Long>(Solution().numOfSubsequences("L"), equalTo<Long>(0L))
    }
}
