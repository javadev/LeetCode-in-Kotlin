package g1801_1900.s1894_find_the_student_that_will_replace_the_chalk

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun chalkReplacer() {
        assertThat(Solution().chalkReplacer(intArrayOf(5, 1, 5), 22), equalTo(0))
    }

    @Test
    fun chalkReplacer2() {
        assertThat(Solution().chalkReplacer(intArrayOf(3, 4, 1, 2), 25), equalTo(1))
    }

    @Test
    fun chalkReplacer3() {
        assertThat(Solution().chalkReplacer(intArrayOf(1, 2, -1, -2), 25), equalTo(0))
    }
}
