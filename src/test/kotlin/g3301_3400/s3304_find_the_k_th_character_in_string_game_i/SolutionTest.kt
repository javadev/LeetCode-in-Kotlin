package g3301_3400.s3304_find_the_k_th_character_in_string_game_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthCharacter() {
        assertThat<Char>(Solution().kthCharacter(5), equalTo<Char>('b'))
    }

    @Test
    fun kthCharacter2() {
        assertThat<Char>(Solution().kthCharacter(10), equalTo<Char>('c'))
    }
}
