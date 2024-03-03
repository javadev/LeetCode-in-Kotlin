package g3001_3100.s3046_split_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPossibleToSplit: Unit
        get() {
            assertThat(
                Solution().isPossibleToSplit(intArrayOf(1, 1, 2, 2, 3, 4)),
                equalTo(true)
            )
        }

    @get:Test
    val isPossibleToSplit2: Unit
        get() {
            assertThat(Solution().isPossibleToSplit(intArrayOf(1, 1, 1, 1)), equalTo(false))
        }
}
