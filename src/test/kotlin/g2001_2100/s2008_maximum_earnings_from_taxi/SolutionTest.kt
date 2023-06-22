package g2001_2100.s2008_maximum_earnings_from_taxi

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTaxiEarnings() {
        assertThat(
            Solution().maxTaxiEarnings(5, arrayOf(intArrayOf(2, 5, 4), intArrayOf(1, 5, 1))), equalTo(7L)
        )
    }

    @Test
    fun maxTaxiEarnings2() {
        assertThat(
            Solution()
                .maxTaxiEarnings(
                    20,
                    arrayOf(
                        intArrayOf(1, 6, 1),
                        intArrayOf(3, 10, 2),
                        intArrayOf(10, 12, 3),
                        intArrayOf(11, 12, 2),
                        intArrayOf(12, 15, 2),
                        intArrayOf(13, 18, 1)
                    )
                ),
            equalTo(20L)
        )
    }
}
