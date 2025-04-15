package g3501_3600.s3516_find_closest_person

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findClosest() {
        assertThat<Int>(Solution().findClosest(2, 7, 4), equalTo<Int>(1))
    }

    @Test
    fun findClosest2() {
        assertThat<Int>(Solution().findClosest(2, 5, 6), equalTo<Int>(2))
    }

    @Test
    fun findClosest3() {
        assertThat<Int>(Solution().findClosest(1, 5, 3), equalTo<Int>(0))
    }
}
