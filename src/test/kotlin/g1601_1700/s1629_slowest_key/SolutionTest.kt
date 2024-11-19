package g1601_1700.s1629_slowest_key

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun slowestKey() {
        assertThat(Solution().slowestKey(intArrayOf(9, 29, 49, 50), "cbcd"), equalTo('c'))
    }

    @Test
    fun slowestKey2() {
        assertThat(
            Solution().slowestKey(intArrayOf(12, 23, 36, 46, 62), "spuda"),
            equalTo('a'),
        )
    }
}
