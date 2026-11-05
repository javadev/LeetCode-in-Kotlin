package g3901_4000.s3979_maximum_valid_pair_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValidPairSum() {
        assertThat<Int>(
            Solution().maxValidPairSum(intArrayOf(1, 3, 5, 2, 8), 2),
            equalTo<Int>(13),
        )
    }

    @Test
    fun maxValidPairSum2() {
        assertThat<Int>(
            Solution().maxValidPairSum(intArrayOf(5, 1, 9), 1),
            equalTo<Int>(14),
        )
    }

    @Test
    fun maxValidPairSum3() {
        assertThat<Int>(
            Solution().maxValidPairSum(intArrayOf(9, 1, 1, 8), 3),
            equalTo<Int>(17),
        )
    }
}
