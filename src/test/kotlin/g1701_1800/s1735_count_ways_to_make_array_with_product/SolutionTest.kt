package g1701_1800.s1735_count_ways_to_make_array_with_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToFillArray() {
        assertThat(
            Solution().waysToFillArray(arrayOf(intArrayOf(2, 6), intArrayOf(5, 1), intArrayOf(73, 660))),
            equalTo(intArrayOf(4, 1, 50734910)),
        )
    }

    @Test
    fun waysToFillArray2() {
        assertThat(
            Solution()
                .waysToFillArray(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(3, 3),
                        intArrayOf(4, 4),
                        intArrayOf(5, 5),
                    ),
                ),
            equalTo(intArrayOf(1, 2, 3, 10, 5)),
        )
    }
}
