package g3901_4000.s3983_subsequence_after_one_replacement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeSubsequence() {
        assertThat<Boolean>(
            Solution().canMakeSubsequence("cat", "chat"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun canMakeSubsequence2() {
        assertThat<Boolean>(
            Solution().canMakeSubsequence("plane", "apple"),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun canMakeSubsequence3() {
        assertThat<Boolean>(
            Solution().canMakeSubsequence("abc", "abc"),
            equalTo<Boolean>(true),
        )
    }
}
