package g3401_3500.s3455_shortest_matching_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestMatchingSubstring() {
        assertThat<Int>(
            Solution().shortestMatchingSubstring("abaacbaecebce", "ba*c*ce"),
            equalTo<Int>(8),
        )
    }

    @Test
    fun shortestMatchingSubstring2() {
        assertThat<Int>(
            Solution().shortestMatchingSubstring("baccbaadbc", "cc*baa*adb"),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun shortestMatchingSubstring3() {
        assertThat<Int>(Solution().shortestMatchingSubstring("a", "**"), equalTo<Int>(0))
    }

    @Test
    fun shortestMatchingSubstring4() {
        assertThat<Int>(
            Solution().shortestMatchingSubstring("madlogic", "*adlogi*"),
            equalTo<Int>(6),
        )
    }
}
