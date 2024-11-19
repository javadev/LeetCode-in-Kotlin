package g2601_2700.s2657_find_the_prefix_common_array_of_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findThePrefixCommonArray() {
        assertThat(
            Solution().findThePrefixCommonArray(intArrayOf(1, 3, 2, 4), intArrayOf(3, 1, 2, 4)),
            equalTo(intArrayOf(0, 2, 3, 4)),
        )
    }

    @Test
    fun findThePrefixCommonArray2() {
        assertThat(
            Solution().findThePrefixCommonArray(intArrayOf(2, 3, 1), intArrayOf(3, 1, 2)),
            equalTo(intArrayOf(0, 1, 3)),
        )
    }
}
