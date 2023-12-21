package g2801_2900.s2900_longest_unequal_adjacent_groups_subsequence_i

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val wordsInLongestSubsequence: Unit
        get() {
            MatcherAssert.assertThat(
                Solution()
                    .getWordsInLongestSubsequence(
                        3, arrayOf("e", "a", "b"), intArrayOf(0, 0, 1)
                    ),
                CoreMatchers.equalTo(mutableListOf("e", "b"))
            )
        }

    @get:Test
    val wordsInLongestSubsequence2: Unit
        get() {
            MatcherAssert.assertThat(
                Solution()
                    .getWordsInLongestSubsequence(
                        4, arrayOf("a", "b", "c", "d"), intArrayOf(1, 0, 1, 1)
                    ),
                CoreMatchers.equalTo(mutableListOf("a", "b", "c"))
            )
        }
}
