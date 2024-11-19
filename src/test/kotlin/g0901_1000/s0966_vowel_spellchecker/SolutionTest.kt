package g0901_1000.s0966_vowel_spellchecker

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun spellchecker() {
        assertThat(
            Solution()
                .spellchecker(
                    arrayOf("KiTe", "kite", "hare", "Hare"),
                    arrayOf(
                        "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti",
                        "keet", "keto",
                    ),
                ),
            equalTo(
                arrayOf(
                    "kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe",
                ),
            ),
        )
    }

    @Test
    fun spellchecker2() {
        assertThat(
            Solution().spellchecker(arrayOf("yellow"), arrayOf("YellOw")),
            equalTo(arrayOf("yellow")),
        )
    }
}
