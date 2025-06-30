package g3501_3600.s3598_longest_common_prefix_between_adjacent_strings_after_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonPrefix() {
        assertThat<IntArray>(
            Solution()
                .longestCommonPrefix(arrayOf<String>("jump", "run", "run", "jump", "run")),
            equalTo<IntArray>(intArrayOf(3, 0, 0, 3, 3)),
        )
    }

    @Test
    fun longestCommonPrefix2() {
        assertThat<IntArray>(
            Solution().longestCommonPrefix(arrayOf<String>("dog", "racer", "car")),
            equalTo<IntArray>(intArrayOf(0, 0, 0)),
        )
    }
}
