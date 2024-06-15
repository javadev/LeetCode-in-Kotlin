package g3101_3200.s3178_find_the_child_who_has_the_ball_after_k_seconds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfChild() {
        assertThat(Solution().numberOfChild(3, 5), equalTo(1))
    }

    @Test
    fun numberOfChild2() {
        assertThat(Solution().numberOfChild(5, 6), equalTo(2))
    }

    @Test
    fun numberOfChild3() {
        assertThat(Solution().numberOfChild(4, 2), equalTo(2))
    }
}
