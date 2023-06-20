package g1901_2000.s1980_find_unique_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDifferentBinaryString() {
        assertThat(
            Solution().findDifferentBinaryString(arrayOf("01", "10")), equalTo("00")
        )
    }

    @Test
    fun findDifferentBinaryString2() {
        assertThat(
            Solution().findDifferentBinaryString(arrayOf("00", "01")), equalTo("10")
        )
    }

    @Test
    fun findDifferentBinaryString3() {
        assertThat(
            Solution().findDifferentBinaryString(arrayOf("111", "011", "001")),
            equalTo("000")
        )
    }
}
