package g3001_3100.s3002_maximum_size_of_a_set_after_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSetSize() {
        assertThat(
            Solution().maximumSetSize(intArrayOf(1, 2, 1, 2), intArrayOf(1, 1, 1, 1)),
            equalTo(2)
        )
    }

    @Test
    fun maximumSetSize2() {
        assertThat(
            Solution()
                .maximumSetSize(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(2, 3, 2, 3, 2, 3)),
            equalTo(5)
        )
    }

    @Test
    fun maximumSetSize3() {
        assertThat(
            Solution()
                .maximumSetSize(intArrayOf(1, 1, 2, 2, 3, 3), intArrayOf(4, 4, 5, 5, 6, 6)),
            equalTo(6)
        )
    }
}
