package g3701_3800.s3720_lexicographically_smallest_permutation_greater_than_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexGreaterPermutation() {
        assertThat<String>(
            Solution().lexGreaterPermutation("abc", "bba"),
            equalTo<String>("bca"),
        )
    }

    @Test
    fun lexGreaterPermutation2() {
        assertThat<String>(
            Solution().lexGreaterPermutation("leet", "code"),
            equalTo<String>("eelt"),
        )
    }

    @Test
    fun lexGreaterPermutation3() {
        assertThat<String>(
            Solution().lexGreaterPermutation("baba", "bbaa"),
            equalTo<String>(""),
        )
    }
}
