package g3401_3500.s3485_longest_common_prefix_of_k_strings_after_removal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonPrefix() {
        assertThat<IntArray>(
            Solution()
                .longestCommonPrefix(arrayOf<String>("jump", "run", "run", "jump", "run"), 2),
            equalTo<IntArray>(intArrayOf(3, 4, 4, 3, 4)),
        )
    }

    @Test
    fun longestCommonPrefix2() {
        assertThat<IntArray>(
            Solution().longestCommonPrefix(arrayOf<String>("dog", "racer", "car"), 2),
            equalTo<IntArray>(intArrayOf(0, 0, 0)),
        )
    }

    @Test
    fun longestCommonPrefix3() {
        assertThat<IntArray>(
            Solution().longestCommonPrefix(arrayOf<String>("cdbff"), 1),
            equalTo<IntArray>(intArrayOf(0)),
        )
    }
}
