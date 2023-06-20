package g1901_2000.s1944_number_of_visible_people_in_a_queue

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canSeePersonsCount() {
        assertThat(
            Solution().canSeePersonsCount(intArrayOf(10, 6, 8, 5, 11, 9)),
            equalTo(intArrayOf(3, 1, 2, 1, 1, 0))
        )
    }

    @Test
    fun canSeePersonsCount2() {
        assertThat(
            Solution().canSeePersonsCount(intArrayOf(5, 1, 2, 3, 10)),
            equalTo(intArrayOf(4, 1, 1, 1, 0))
        )
    }
}
