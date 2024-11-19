package g1001_1100.s1023_camelcase_matching

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun camelMatch() {
        assertThat(
            Solution()
                .camelMatch(
                    arrayOf(
                        "FooBar",
                        "FooBarTest",
                        "FootBall",
                        "FrameBuffer",
                        "ForceFeedBack",
                    ),
                    "FB",
                ),
            equalTo(listOf(true, false, true, true, false)),
        )
    }

    @Test
    fun camelMatch2() {
        assertThat(
            Solution()
                .camelMatch(
                    arrayOf(
                        "FooBar",
                        "FooBarTest",
                        "FootBall",
                        "FrameBuffer",
                        "ForceFeedBack",
                    ),
                    "FoBa",
                ),
            equalTo(listOf(true, false, true, false, false)),
        )
    }

    @Test
    fun camelMatch3() {
        assertThat(
            Solution()
                .camelMatch(
                    arrayOf(
                        "FooBar",
                        "FooBarTest",
                        "FootBall",
                        "FrameBuffer",
                        "ForceFeedBack",
                    ),
                    "FoBaT",
                ),
            equalTo(listOf(false, true, false, false, false)),
        )
    }
}
