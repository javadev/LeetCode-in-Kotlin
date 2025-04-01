package g3501_3600.s3501_maximize_active_section_with_trade_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxActiveSectionsAfterTrade() {
        assertThat<List<Int>>(
            Solution().maxActiveSectionsAfterTrade("01", arrayOf<IntArray>(intArrayOf(0, 1))),
            equalTo<List<Int>>(listOf<Int>(1)),
        )
    }

    @Test
    fun maxActiveSectionsAfterTrade2() {
        assertThat<List<Int>>(
            Solution()
                .maxActiveSectionsAfterTrade(
                    "0100",
                    arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3)),
                ),
            equalTo<List<Int>>(listOf<Int>(4, 3, 1, 1)),
        )
    }

    @Test
    fun maxActiveSectionsAfterTrade3() {
        assertThat<List<Int>>(
            Solution()
                .maxActiveSectionsAfterTrade(
                    "1000100",
                    arrayOf<IntArray>(intArrayOf(1, 5), intArrayOf(0, 6), intArrayOf(0, 4)),
                ),
            equalTo<List<Int>>(listOf<Int>(6, 7, 2)),
        )
    }

    @Test
    fun maxActiveSectionsAfterTrade4() {
        assertThat<List<Int>>(
            Solution()
                .maxActiveSectionsAfterTrade(
                    "01010",
                    arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(1, 4), intArrayOf(1, 3)),
                ),
            equalTo<List<Int>>(listOf<Int>(4, 4, 2)),
        )
    }

    @Test
    fun maxActiveSectionsAfterTrade5() {
        assertThat<List<Int>>(
            Solution()
                .maxActiveSectionsAfterTrade(
                    "10110111",
                    arrayOf<IntArray>(intArrayOf(3, 7), intArrayOf(4, 6), intArrayOf(0, 6)),
                ),
            equalTo<List<Int>>(listOf<Int>(6, 6, 8)),
        )
    }
}
