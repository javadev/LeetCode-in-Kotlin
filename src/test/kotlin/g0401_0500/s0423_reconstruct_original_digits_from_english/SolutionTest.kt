package g0401_0500.s0423_reconstruct_original_digits_from_english

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun originalDigits() {
        assertThat(Solution().originalDigits("owoztneoer"), equalTo("012"))
    }

    @Test
    fun originalDigits2() {
        assertThat(Solution().originalDigits("fviefuro"), equalTo("45"))
    }
}
