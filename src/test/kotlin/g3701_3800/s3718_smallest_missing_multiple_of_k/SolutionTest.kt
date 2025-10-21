package g3701_3800.s3718_smallest_missing_multiple_of_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun missingMultiple() {
        assertThat<Int>(
            Solution().missingMultiple(intArrayOf(8, 2, 3, 4, 6), 2),
            equalTo<Int>(10),
        )
    }

    @Test
    fun missingMultiple2() {
        assertThat<Int>(
            Solution().missingMultiple(intArrayOf(1, 4, 7, 10, 15), 5),
            equalTo<Int>(5),
        )
    }
}
