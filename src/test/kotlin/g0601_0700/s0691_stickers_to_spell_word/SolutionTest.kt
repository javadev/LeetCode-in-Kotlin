package g0601_0700.s0691_stickers_to_spell_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minStickers() {
        assertThat(
            Solution().minStickers(arrayOf("with", "example", "science"), "thehat"),
            equalTo(3)
        )
    }

    @Test
    fun minStickers2() {
        assertThat(
            Solution().minStickers(arrayOf("notice", "possible"), "basicbasic"),
            equalTo(-1)
        )
    }
}
