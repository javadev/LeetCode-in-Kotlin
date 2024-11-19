package g2201_2300.s2213_longest_substring_of_one_repeating_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestRepeating() {
        assertThat(
            Solution().longestRepeating("babacc", "bcb", intArrayOf(1, 3, 3)),
            equalTo(intArrayOf(3, 3, 4)),
        )
    }

    @Test
    fun longestRepeating2() {
        assertThat(
            Solution().longestRepeating("abyzz", "aa", intArrayOf(2, 1)),
            equalTo(intArrayOf(2, 3)),
        )
    }
}
