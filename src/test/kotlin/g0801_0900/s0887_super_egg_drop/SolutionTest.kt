package g0801_0900.s0887_super_egg_drop

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun superEggDrop() {
        assertThat(Solution().superEggDrop(1, 2), equalTo(2))
    }

    @Test
    fun superEggDrop2() {
        assertThat(Solution().superEggDrop(2, 6), equalTo(3))
    }

    @Test
    fun superEggDrop3() {
        assertThat(Solution().superEggDrop(3, 14), equalTo(4))
    }
}
