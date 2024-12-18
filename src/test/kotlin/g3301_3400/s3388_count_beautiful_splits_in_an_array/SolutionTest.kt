package g3301_3400.s3388_count_beautiful_splits_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulSplits() {
        assertThat<Int>(
            Solution().beautifulSplits(intArrayOf(1, 1, 2, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun beautifulSplits2() {
        assertThat<Int?>(
            Solution().beautifulSplits(intArrayOf(1, 2, 3, 4)),
            equalTo<Int?>(0),
        )
    }
}
