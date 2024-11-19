package g1501_1600.s1531_string_compression_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfOptimalCompression() {
        assertThat(Solution().getLengthOfOptimalCompression("aaabcccd", 2), equalTo(4))
    }

    @Test
    fun lengthOfOptimalCompression2() {
        assertThat(Solution().getLengthOfOptimalCompression("aabbaa", 2), equalTo(2))
    }

    @Test
    fun lengthOfOptimalCompression3() {
        assertThat(
            Solution().getLengthOfOptimalCompression("aaaaaaaaaaa", 0),
            equalTo(3),
        )
    }
}
