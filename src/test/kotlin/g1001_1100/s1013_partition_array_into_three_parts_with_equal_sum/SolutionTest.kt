package g1001_1100.s1013_partition_array_into_three_parts_with_equal_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canThreePartsEqualSum() {
        assertThat(
            Solution().canThreePartsEqualSum(intArrayOf(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1)),
            equalTo(true),
        )
    }

    @Test
    fun canThreePartsEqualSum2() {
        assertThat(
            Solution().canThreePartsEqualSum(intArrayOf(0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1)),
            equalTo(false),
        )
    }

    @Test
    fun canThreePartsEqualSum3() {
        assertThat(
            Solution().canThreePartsEqualSum(intArrayOf(3, 3, 6, 5, -2, 2, 5, 1, -9, 4)),
            equalTo(true),
        )
    }
}
