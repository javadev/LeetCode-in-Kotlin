package g2201_2300.s2251_number_of_flowers_in_full_bloom

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fullBloomFlowers() {
        assertThat(
            Solution()
                .fullBloomFlowers(
                    arrayOf(intArrayOf(1, 6), intArrayOf(3, 7), intArrayOf(9, 12), intArrayOf(4, 13)),
                    intArrayOf(2, 3, 7, 11),
                ),
            equalTo(intArrayOf(1, 2, 2, 2)),
        )
    }

    @Test
    fun fullBloomFlowers2() {
        assertThat(
            Solution().fullBloomFlowers(arrayOf(intArrayOf(1, 10), intArrayOf(3, 3)), intArrayOf(3, 3, 2)),
            equalTo(intArrayOf(2, 2, 1)),
        )
    }
}
