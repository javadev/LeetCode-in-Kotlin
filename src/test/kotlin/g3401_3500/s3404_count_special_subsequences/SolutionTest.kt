package g3401_3500.s3404_count_special_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubsequences() {
        assertThat<Long>(
            Solution().numberOfSubsequences(intArrayOf(1, 2, 3, 4, 3, 6, 1)),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun numberOfSubsequences2() {
        assertThat<Long>(
            Solution().numberOfSubsequences(intArrayOf(3, 4, 3, 4, 3, 4, 3, 4)),
            equalTo<Long>(3L),
        )
    }
}
