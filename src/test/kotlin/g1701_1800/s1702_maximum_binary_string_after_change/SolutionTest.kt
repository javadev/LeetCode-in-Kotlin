package g1701_1800.s1702_maximum_binary_string_after_change

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBinaryString() {
        assertThat(Solution().maximumBinaryString("000110"), equalTo("111011"))
    }

    @Test
    fun maximumBinaryString2() {
        assertThat(Solution().maximumBinaryString("01"), equalTo("01"))
    }
}
