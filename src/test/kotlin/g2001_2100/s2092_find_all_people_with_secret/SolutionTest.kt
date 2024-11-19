package g2001_2100.s2092_find_all_people_with_secret

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAllPeople() {
        assertThat(
            Solution().findAllPeople(6, arrayOf(intArrayOf(1, 2, 5), intArrayOf(2, 3, 8), intArrayOf(1, 5, 10)), 1),
            equalTo(listOf(0, 1, 2, 3, 5)),
        )
    }

    @Test
    fun findAllPeople2() {
        assertThat(
            Solution().findAllPeople(4, arrayOf(intArrayOf(3, 1, 3), intArrayOf(1, 2, 2), intArrayOf(0, 3, 3)), 3),
            equalTo(listOf(0, 1, 3)),
        )
    }

    @Test
    fun findAllPeople3() {
        assertThat(
            Solution().findAllPeople(5, arrayOf(intArrayOf(3, 4, 2), intArrayOf(1, 2, 1), intArrayOf(2, 3, 1)), 1),
            equalTo(listOf(0, 1, 2, 3, 4)),
        )
    }
}
