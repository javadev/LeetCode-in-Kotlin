package g0201_0300.s0287_find_the_duplicate_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDuplicate() {
        assertThat(Solution().findDuplicate(intArrayOf(1, 3, 4, 2, 2)), equalTo(2))
    }

    @Test
    fun findDuplicate2() {
        assertThat(Solution().findDuplicate(intArrayOf(3, 1, 3, 4, 2)), equalTo(3))
    }

    @Test
    fun findDuplicate3() {
        assertThat(Solution().findDuplicate(intArrayOf(1, 1)), equalTo(1))
    }

    @Test
    fun findDuplicate4() {
        assertThat(Solution().findDuplicate(intArrayOf(1, 1, 2)), equalTo(1))
    }
}
