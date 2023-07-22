package g1601_1700.s1694_reformat_phone_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reformatNumber() {
        assertThat(Solution().reformatNumber("1-23-45 6"), equalTo("123-456"))
    }

    @Test
    fun reformatNumber2() {
        assertThat(Solution().reformatNumber("123 4-567"), equalTo("123-45-67"))
    }

    @Test
    fun reformatNumber3() {
        assertThat(Solution().reformatNumber("123 4-5678"), equalTo("123-456-78"))
    }
}
