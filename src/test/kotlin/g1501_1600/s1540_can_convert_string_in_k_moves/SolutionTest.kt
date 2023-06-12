package g1501_1600.s1540_can_convert_string_in_k_moves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canConvertString() {
        assertThat(Solution().canConvertString("input", "ouput", 9), equalTo(true))
    }

    @Test
    fun canConvertString2() {
        assertThat(Solution().canConvertString("abc", "bcd", 10), equalTo(false))
    }

    @Test
    fun canConvertString3() {
        assertThat(Solution().canConvertString("aab", "bbb", 27), equalTo(true))
    }
}
