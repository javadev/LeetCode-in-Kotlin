package g3301_3400.s3324_find_the_sequence_of_strings_appeared_on_the_screen

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stringSequence() {
        assertThat<List<String>>(
            Solution().stringSequence("abc"),
            equalTo<List<String>>(listOf<String>("a", "aa", "ab", "aba", "abb", "abc")),
        )
    }

    @Test
    fun stringSequence2() {
        assertThat<List<String>>(
            Solution().stringSequence("he"),
            equalTo<List<String>>(
                listOf<String>(
                    "a", "b", "c", "d", "e", "f", "g", "h", "ha", "hb", "hc", "hd",
                    "he",
                ),
            ),
        )
    }
}
