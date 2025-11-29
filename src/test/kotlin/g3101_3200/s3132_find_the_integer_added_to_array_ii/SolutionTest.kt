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
            equalTo(-2),
        )
    }

    @Test
    fun minimumAddedInteger2() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(3, 5, 5, 3), intArrayOf(7, 7)),
            equalTo(2),
        )
    }

    @Test
    fun minimumAddedInteger3() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(10, 2, 8, 7, 5, 6, 7, 10), intArrayOf(5, 8, 5, 3, 8, 4)),
            equalTo(-2),
        )
    }

    @Test
    fun minimumAddedInteger4() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(2, 5, 7, 8), intArrayOf(9, 10)),
            equalTo(2),
        )
    }

    @Test
    fun minimumAddedInteger5() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(2, 2, 2, 4, 4), intArrayOf(6, 6, 8)),
            equalTo(4),
        )
    }

    @Test
    fun minimumAddedInteger6() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(5, 5, 5, 5), intArrayOf(5, 5)),
            equalTo(0),
        )
    }

    @Test
    fun minimumAddedInteger7() {
        assertThat(
            Solution().minimumAddedInteger(
                intArrayOf(1_000_000, 2_000_000, 3_000_000, 4_000_000),
                intArrayOf(3_000_002, 4_000_002),
            ),
            equalTo(2),
        )
    }

    @Test
    fun minimumAddedInteger8() {
        assertThat(
            Solution().minimumAddedInteger(intArrayOf(10, 20, 30, 40), intArrayOf(35, 45)),
            equalTo(5),
        )
    }
}
