package g1301_1400.s1356_sort_integers_by_the_number_of_1_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortByBits() {
        assertThat(
            Solution().sortByBits(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)),
            equalTo(intArrayOf(0, 1, 2, 4, 8, 3, 5, 6, 7))
        )
    }

    @Test
    fun sortByBits2() {
        assertThat(
            Solution().sortByBits(intArrayOf(1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1)),
            equalTo(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024))
        )
    }
}
