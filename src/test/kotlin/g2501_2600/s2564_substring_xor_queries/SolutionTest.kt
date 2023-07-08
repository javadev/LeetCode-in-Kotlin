package g2501_2600.s2564_substring_xor_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun substringXorQueries() {
        assertThat(
            Solution().substringXorQueries("101101", arrayOf(intArrayOf(0, 5), intArrayOf(1, 2))),
            equalTo(arrayOf(intArrayOf(0, 2), intArrayOf(2, 3)))
        )
    }

    @Test
    fun substringXorQueries2() {
        assertThat(
            Solution().substringXorQueries("0101", arrayOf(intArrayOf(12, 8))),
            equalTo(arrayOf(intArrayOf(-1, -1)))
        )
    }

    @Test
    fun substringXorQueries3() {
        assertThat(
            Solution().substringXorQueries("1", arrayOf(intArrayOf(4, 5))),
            equalTo(arrayOf(intArrayOf(0, 0)))
        )
    }
}
