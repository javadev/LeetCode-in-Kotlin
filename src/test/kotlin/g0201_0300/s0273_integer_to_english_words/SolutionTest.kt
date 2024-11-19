package g0201_0300.s0273_integer_to_english_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberToWords() {
        assertThat(Solution().numberToWords(123), equalTo("One Hundred Twenty Three"))
    }

    @Test
    fun numberToWords2() {
        assertThat(
            Solution().numberToWords(12345),
            equalTo("Twelve Thousand Three Hundred Forty Five"),
        )
    }

    @Test
    fun numberToWords3() {
        assertThat(
            Solution().numberToWords(1234567),
            equalTo("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
        )
    }
}
