package g2301_2400.s2391_minimum_amount_of_time_to_collect_garbage

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun garbageCollection() {
        assertThat(
            Solution()
                .garbageCollection(arrayOf("G", "P", "GP", "GG"), intArrayOf(2, 4, 3)),
            equalTo(21)
        )
    }

    @Test
    fun garbageCollection2() {
        assertThat(
            Solution()
                .garbageCollection(arrayOf("MMM", "PGM", "GP"), intArrayOf(3, 10)),
            equalTo(37)
        )
    }
}
