package g3401_3500.s3455_shortest_matching_substring

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestMatchingSubstring() {
        MatcherAssert.assertThat<Int>(
            Solution().shortestMatchingSubstring("abaacbaecebce", "ba*c*ce"),
            CoreMatchers.equalTo<Int>(8),
        )
    }

    @Test
    fun shortestMatchingSubstring2() {
        MatcherAssert.assertThat<Int>(
            Solution().shortestMatchingSubstring("baccbaadbc", "cc*baa*adb"),
            CoreMatchers.equalTo<Int>(-1),
        )
    }

    @Test
    fun shortestMatchingSubstring3() {
        MatcherAssert.assertThat<Int>(Solution().shortestMatchingSubstring("a", "**"), CoreMatchers.equalTo<Int>(0))
    }

    @Test
    fun shortestMatchingSubstring4() {
        MatcherAssert.assertThat<Int>(
            Solution().shortestMatchingSubstring("madlogic", "*adlogi*"),
            CoreMatchers.equalTo<Int>(6),
        )
    }
}
