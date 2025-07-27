package g3601_3700.s3630_partition_array_for_maximum_xor_and_and

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeXorAndXor() {
        assertThat<Long>(Solution().maximizeXorAndXor(intArrayOf(2, 3)), equalTo<Long>(5L))
    }

    @Test
    fun maximizeXorAndXor2() {
        assertThat<Long>(
            Solution().maximizeXorAndXor(intArrayOf(1, 3, 2)),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun maximizeXorAndXor3() {
        assertThat<Long>(
            Solution().maximizeXorAndXor(intArrayOf(2, 3, 6, 7)),
            equalTo<Long>(15L),
        )
    }
}
