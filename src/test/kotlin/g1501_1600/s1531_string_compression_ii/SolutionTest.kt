package g1501_1600.s1531_string_compression_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val lengthOfOptimalCompression: Unit
        get() {
            MatcherAssert.assertThat(Solution().getLengthOfOptimalCompression("aaabcccd", 2), CoreMatchers.equalTo(4))
        }

    @get:Test
    val lengthOfOptimalCompression2: Unit
        get() {
            MatcherAssert.assertThat(Solution().getLengthOfOptimalCompression("aabbaa", 2), CoreMatchers.equalTo(2))
        }

    @get:Test
    val lengthOfOptimalCompression3: Unit
        get() {
            MatcherAssert.assertThat(
                Solution().getLengthOfOptimalCompression("aaaaaaaaaaa", 0),
                CoreMatchers.equalTo(3)
            )
        }
}
