package g2401_2500.s2451_odd_string_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun oddString() {
        assertThat(Solution().oddString(arrayOf("adc", "wzy", "abc")), equalTo("abc"))
    }

    @Test
    fun oddString2() {
        assertThat(
            Solution().oddString(arrayOf("aaa", "bob", "ccc", "ddd")),
            equalTo("bob")
        )
    }
}
