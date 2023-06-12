package g1501_1600.s1531_string_compression_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val lengthOfOptimalCompression: Unit
        get() {
            assertThat(Solution().getLengthOfOptimalCompression("aaabcccd", 2), equalTo(4))
        }

    @get:Test
    val lengthOfOptimalCompression2: Unit
        get() {
            assertThat(Solution().getLengthOfOptimalCompression("aabbaa", 2), equalTo(2))
        }

    @get:Test
    val lengthOfOptimalCompression3: Unit
        get() {
            assertThat(
                Solution().getLengthOfOptimalCompression("aaaaaaaaaaa", 0),
                equalTo(3)
            )
        }
}
