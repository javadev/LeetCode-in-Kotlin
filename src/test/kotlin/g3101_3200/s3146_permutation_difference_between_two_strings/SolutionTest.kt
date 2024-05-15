package g3101_3200.s3146_permutation_difference_between_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPermutationDifference() {
        assertThat(Solution().findPermutationDifference("abc", "bac"), equalTo(2))
    }

    @Test
    fun findPermutationDifference2() {
        assertThat(Solution().findPermutationDifference("abcde", "edbac"), equalTo(12))
    }
}
