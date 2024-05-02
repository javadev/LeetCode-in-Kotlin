package g3101_3200.s3133_minimum_array_end

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minEnd() {
        assertThat(Solution().minEnd(3, 4), equalTo(6L))
    }

    @Test
    fun minEnd2() {
        assertThat(Solution().minEnd(2, 7), equalTo(15L))
    }
}
