package g1201_1300.s1239_maximum_length_of_a_concatenated_string_with_unique_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLength() {
        assertThat(Solution().maxLength(mutableListOf("un", "iq", "ue")), equalTo(4))
    }

    @Test
    fun maxLength2() {
        assertThat(Solution().maxLength(mutableListOf("cha", "r", "act", "ers")), equalTo(6))
    }

    @Test
    fun maxLength3() {
        assertThat(
            Solution().maxLength(listOf("abcdefghijklmnopqrstuvwxyz")),
            equalTo(26),
        )
    }
}
