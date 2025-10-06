package g3701_3800.s3701_compute_alternating_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alternatingSum() {
        assertThat<Int>(
            Solution().alternatingSum(intArrayOf(1, 3, 5, 7)),
            equalTo<Int>(-4),
        )
    }

    @Test
    fun alternatingSum2() {
        assertThat<Int>(Solution().alternatingSum(intArrayOf(100)), equalTo<Int>(100))
    }
}
