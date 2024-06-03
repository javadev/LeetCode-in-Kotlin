package g3101_3200.s3163_string_compression_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun compressedString() {
        assertThat(Solution().compressedString("abcde"), equalTo("1a1b1c1d1e"))
    }

    @Test
    fun compressedString2() {
        assertThat(Solution().compressedString("aaaaaaaaaaaaaabb"), equalTo("9a5a2b"))
    }
}
