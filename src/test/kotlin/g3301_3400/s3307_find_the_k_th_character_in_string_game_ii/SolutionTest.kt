package g3301_3400.s3307_find_the_k_th_character_in_string_game_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthCharacter() {
        assertThat<Char>(
            Solution().kthCharacter(5, intArrayOf(0, 0, 0)),
            equalTo<Char>('a'),
        )
    }

    @Test
    fun kthCharacter2() {
        assertThat<Char>(
            Solution().kthCharacter(10, intArrayOf(0, 1, 0, 1)),
            equalTo<Char>('b'),
        )
    }
}
