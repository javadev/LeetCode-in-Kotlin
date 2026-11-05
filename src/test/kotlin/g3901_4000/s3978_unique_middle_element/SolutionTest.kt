package g3901_4000.s3978_unique_middle_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isMiddleElementUnique() {
        assertThat<Boolean>(
            Solution().isMiddleElementUnique(intArrayOf(1, 2, 3)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isMiddleElementUnique2() {
        assertThat<Boolean>(
            Solution().isMiddleElementUnique(intArrayOf(1, 2, 2)),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun isMiddleElementUnique3() {
        assertThat<Boolean>(
            Solution().isMiddleElementUnique(intArrayOf(7)),
            equalTo<Boolean>(true),
        )
    }
}
