package g3301_3400.s3354_make_array_elements_equal_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidSelections() {
        assertThat<Int>(
            Solution().countValidSelections(intArrayOf(1, 0, 2, 0, 3)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countValidSelections2() {
        assertThat<Int>(
            Solution().countValidSelections(intArrayOf(2, 3, 4, 0, 4, 1, 0)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countValidSelections3() {
        assertThat<Int>(
            Solution()
                .countValidSelections(intArrayOf(16, 13, 10, 0, 0, 0, 10, 6, 7, 8, 7)),
            equalTo<Int>(3),
        )
    }
}
