package g3801_3900.s3811_number_of_alternating_xor_partitions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alternatingXOR() {
        assertThat<Int>(
            Solution().alternatingXOR(intArrayOf(2, 3, 1, 4), 1, 5),
            equalTo<Int>(1),
        )
    }

    @Test
    fun alternatingXOR2() {
        assertThat<Int>(
            Solution().alternatingXOR(intArrayOf(1, 0, 0), 1, 0),
            equalTo<Int>(3),
        )
    }

    @Test
    fun alternatingXOR3() {
        assertThat<Int>(Solution().alternatingXOR(intArrayOf(7), 1, 7), equalTo<Int>(0))
    }
}
