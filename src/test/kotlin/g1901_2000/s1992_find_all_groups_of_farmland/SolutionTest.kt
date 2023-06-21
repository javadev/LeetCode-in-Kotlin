package g1901_2000.s1992_find_all_groups_of_farmland

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findFarmland() {
        assertThat(
            Solution().findFarmland(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 1), intArrayOf(0, 1, 1))),
            equalTo(arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(1, 1, 2, 2)))
        )
    }

    @Test
    fun findFarmland2() {
        assertThat(
            Solution().findFarmland(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))),
            equalTo(arrayOf(intArrayOf(0, 0, 1, 1)))
        )
    }

    @Test
    fun findFarmland3() {
        assertThat(Solution().findFarmland(arrayOf(intArrayOf(0))), equalTo(arrayOf()))
    }

    @Test
    fun findFarmland4() {
        assertThat(Solution().findFarmland(arrayOf()), equalTo(arrayOf()))
    }
}
