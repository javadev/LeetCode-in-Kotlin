package g2101_2200.s2161_partition_array_according_to_given_pivot

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pivotArray() {
        MatcherAssert.assertThat(
            Solution().pivotArray(intArrayOf(9, 12, 5, 10, 14, 3, 10), 10),
            CoreMatchers.equalTo(intArrayOf(9, 5, 3, 10, 10, 12, 14))
        )
    }

    @Test
    fun pivotArray2() {
        MatcherAssert.assertThat(
            Solution().pivotArray(intArrayOf(-3, 4, 3, 2), 2),
            CoreMatchers.equalTo(intArrayOf(-3, 2, 4, 3))
        )
    }
}
