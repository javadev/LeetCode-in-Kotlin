package g0701_0800.s0784_letter_case_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun letterCasePermutation() {
        assertThat(
            Solution().letterCasePermutation("a1b2"),
            equalTo(listOf("a1b2", "a1B2", "A1b2", "A1B2"))
        )
    }

    @Test
    fun letterCasePermutation2() {
        assertThat(
            Solution().letterCasePermutation("3z4"), equalTo(listOf("3z4", "3Z4"))
        )
    }

    @Test
    fun letterCasePermutation3() {
        assertThat(Solution().letterCasePermutation("C"), equalTo(listOf("C", "c")))
    }
}
