package g2301_2400.s2301_match_substring_after_replacement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matchReplacement() {
        assertThat(
            Solution()
                .matchReplacement(
                    "fool3e7bar",
                    "leet",
                    arrayOf(charArrayOf('e', '3'), charArrayOf('t', '7'), charArrayOf('t', '8')),
                ),
            equalTo(true),
        )
    }

    @Test
    fun matchReplacement2() {
        assertThat(
            Solution().matchReplacement("fooleetbar", "f00l", arrayOf(charArrayOf('o', '0'))),
            equalTo(false),
        )
    }

    @Test
    fun matchReplacement3() {
        assertThat(
            Solution()
                .matchReplacement(
                    "Fool33tbaR",
                    "leetd",
                    arrayOf(
                        charArrayOf('e', '3'),
                        charArrayOf('t', '7'),
                        charArrayOf('t', '8'),
                        charArrayOf('d', 'b'),
                        charArrayOf('p', 'b'),
                    ),
                ),
            equalTo(true),
        )
    }
}
