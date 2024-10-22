package g3301_3400.s3327_check_if_dfs_strings_are_palindromes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAnswer() {
        assertThat<BooleanArray>(
            Solution().findAnswer(intArrayOf(-1, 0, 0, 1, 1, 2), "aababa"),
            equalTo<BooleanArray>(booleanArrayOf(true, true, false, true, true, true))
        )
    }

    @Test
    fun findAnswer2() {
        assertThat<BooleanArray>(
            Solution().findAnswer(intArrayOf(-1, 0, 0, 0, 0), "aabcb"),
            equalTo<BooleanArray>(booleanArrayOf(true, true, true, true, true))
        )
    }
}
