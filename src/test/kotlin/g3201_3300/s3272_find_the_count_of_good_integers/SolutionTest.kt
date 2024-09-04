package g3201_3300.s3272_find_the_count_of_good_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodIntegers() {
        assertThat(Solution().countGoodIntegers(3, 5), equalTo(27L))
    }

    @Test
    fun countGoodIntegers2() {
        assertThat(Solution().countGoodIntegers(1, 4), equalTo(2L))
    }

    @Test
    fun countGoodIntegers3() {
        assertThat(Solution().countGoodIntegers(5, 6), equalTo(2468L))
    }
}
