package g2301_2400.s2325_decode_the_message

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decodeMessage() {
        assertThat(
            Solution()
                .decodeMessage(
                    "the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"
                ),
            equalTo("this is a secret")
        )
    }

    @Test
    fun decodeMessage2() {
        assertThat(
            Solution()
                .decodeMessage(
                    "eljuxhpwnyrdgtqkviszcfmabo",
                    "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
                ),
            equalTo("the five boxing wizards jump quickly")
        )
    }
}
