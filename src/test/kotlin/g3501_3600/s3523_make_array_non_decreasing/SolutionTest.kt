package g3501_3600.s3523_make_array_non_decreasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumPossibleSize() {
        assertThat<Int>(
            Solution().maximumPossibleSize(intArrayOf(4, 2, 5, 3, 5)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maximumPossibleSize2() {
        assertThat<Int>(
            Solution().maximumPossibleSize(intArrayOf(1, 2, 3)),
            equalTo<Int>(3),
        )
    }
}
