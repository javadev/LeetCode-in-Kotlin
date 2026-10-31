package g3701_3800.s3790_smallest_all_ones_multiple

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAllOneMultiple() {
        assertThat<Int>(Solution().minAllOneMultiple(3), equalTo<Int>(3))
    }

    @Test
    fun minAllOneMultiple2() {
        assertThat<Int>(Solution().minAllOneMultiple(7), equalTo<Int>(6))
    }

    @Test
    fun minAllOneMultiple3() {
        assertThat<Int>(Solution().minAllOneMultiple(2), equalTo<Int>(-1))
    }
}
