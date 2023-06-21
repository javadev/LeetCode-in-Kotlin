package g1801_1900.s1884_egg_drop_with_2_eggs_and_n_floors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoEggDrop() {
        assertThat(Solution().twoEggDrop(2), equalTo(2))
    }

    @Test
    fun twoEggDrop2() {
        assertThat(Solution().twoEggDrop(100), equalTo(14))
    }
}
