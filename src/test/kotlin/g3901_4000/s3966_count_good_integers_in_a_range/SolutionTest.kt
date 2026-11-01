package g3901_4000.s3966_count_good_integers_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodIntegers() {
        assertThat<Long>(Solution().goodIntegers(10, 15, 1), equalTo<Long>(3L))
    }

    @Test
    fun goodIntegers2() {
        assertThat<Long>(Solution().goodIntegers(201, 204, 2), equalTo<Long>(2L))
    }

    @Test
    fun goodIntegers3() {
        assertThat<Long>(Solution().goodIntegers(10, 22, 0), equalTo<Long>(2L))
    }

    @Test
    fun goodIntegers4() {
        assertThat<Long>(Solution().goodIntegers(10, 10, 1), equalTo<Long>(1L))
    }

    @Test
    fun goodIntegers5() {
        assertThat<Long>(Solution().goodIntegers(10, 1000, 9), equalTo<Long>(991L))
    }
}
