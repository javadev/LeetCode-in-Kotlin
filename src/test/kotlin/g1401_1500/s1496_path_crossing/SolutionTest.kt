package g1401_1500.s1496_path_crossing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPathCrossing() {
        assertThat(Solution().isPathCrossing("NES"), equalTo(false))
    }

    @Test
    fun isPathCrossing2() {
        assertThat(Solution().isPathCrossing("NESWW"), equalTo(true))
    }
}
