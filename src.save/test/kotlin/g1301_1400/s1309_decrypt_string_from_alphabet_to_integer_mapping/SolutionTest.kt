package g1301_1400.s1309_decrypt_string_from_alphabet_to_integer_mapping

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun freqAlphabets() {
        assertThat(Solution().freqAlphabets("10#11#12"), equalTo("jkab"))
    }

    @Test
    fun freqAlphabets2() {
        assertThat(Solution().freqAlphabets("1326#"), equalTo("acz"))
    }
}
