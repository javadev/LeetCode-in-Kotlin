package g0101_0200.s0127_word_ladder

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun ladderLength() {
        assertThat(
            Solution()
                .ladderLength(
                    "hit",
                    "cog",
                    listOf("hot", "dot", "dog", "lot", "log", "cog"),
                ),
            equalTo(5),
        )
    }

    @Test
    fun ladderLength2() {
        assertThat(
            Solution()
                .ladderLength(
                    "hit",
                    "cog",
                    listOf("hot", "dot", "dog", "lot", "log"),
                ),
            equalTo(0),
        )
    }
}
