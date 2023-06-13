package g1401_1500.s1496_path_crossing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPathCrossing: Unit
        get() {
            assertThat(Solution().isPathCrossing("NES"), equalTo(false))
        }

    @get:Test
    val isPathCrossing2: Unit
        get() {
            assertThat(Solution().isPathCrossing("NESWW"), equalTo(true))
        }
}
