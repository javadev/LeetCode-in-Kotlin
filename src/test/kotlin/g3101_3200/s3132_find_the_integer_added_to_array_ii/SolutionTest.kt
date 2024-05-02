package g3101_3200.s3132_find_the_integer_added_to_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAddedInteger() {
        assertThat(
            Solution()
                .minimumAddedInteger(intArrayOf(4, 20, 16, 12, 8), intArrayOf(14, 18, 10)),
            equalTo(-2)
        )
    }

    @Test
    fun minimumAddedInteger2() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(3, 5, 5, 3), intArrayOf(7, 7)),
            equalTo(2)
        )
    }
}
