package g3801_3900.s3881_direction_assignments_with_exactly_k_visible_people

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countVisiblePeople() {
        assertThat<Int>(Solution().countVisiblePeople(3, 1, 0), equalTo<Int>(2))
    }

    @Test
    fun countVisiblePeople2() {
        assertThat<Int>(Solution().countVisiblePeople(3, 2, 1), equalTo<Int>(4))
    }

    @Test
    fun countVisiblePeople3() {
        assertThat<Int>(Solution().countVisiblePeople(1, 0, 0), equalTo<Int>(2))
    }
}
