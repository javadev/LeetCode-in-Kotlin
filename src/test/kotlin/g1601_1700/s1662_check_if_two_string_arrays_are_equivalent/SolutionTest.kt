package g1601_1700.s1662_check_if_two_string_arrays_are_equivalent

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrayStringsAreEqual() {
        assertThat(
            Solution()
                .arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")),
            equalTo(true)
        )
    }

    @Test
    fun arrayStringsAreEqual2() {
        assertThat(
            Solution()
                .arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c")),
            equalTo(false)
        )
    }

    @Test
    fun arrayStringsAreEqual3() {
        assertThat(
            Solution()
                .arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")),
            equalTo(true)
        )
    }
}
