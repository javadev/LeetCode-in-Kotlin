package g3001_3100.s3093_longest_common_suffix_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stringIndices() {
        assertThat(
            Solution()
                .stringIndices(
                    arrayOf("abcd", "bcd", "xbcd"),
                    arrayOf("cd", "bcd", "xyz"),
                ),
            equalTo(intArrayOf(1, 1, 1)),
        )
    }

    @Test
    fun stringIndices2() {
        assertThat(
            Solution()
                .stringIndices(
                    arrayOf("abcdefgh", "poiuygh", "ghghgh"),
                    arrayOf("gh", "acbfgh", "acbfegh"),
                ),
            equalTo(intArrayOf(2, 0, 2)),
        )
    }
}
