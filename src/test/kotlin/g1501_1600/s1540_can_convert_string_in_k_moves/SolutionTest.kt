package g1501_1600.s1540_can_convert_string_in_k_moves

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canConvertString() {
        MatcherAssert.assertThat(Solution().canConvertString("input", "ouput", 9), CoreMatchers.equalTo(true))
    }

    @Test
    fun canConvertString2() {
        MatcherAssert.assertThat(Solution().canConvertString("abc", "bcd", 10), CoreMatchers.equalTo(false))
    }

    @Test
    fun canConvertString3() {
        MatcherAssert.assertThat(Solution().canConvertString("aab", "bbb", 27), CoreMatchers.equalTo(true))
    }
}
