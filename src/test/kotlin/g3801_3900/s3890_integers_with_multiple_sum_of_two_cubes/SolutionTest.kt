package g3801_3900.s3890_integers_with_multiple_sum_of_two_cubes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findGoodIntegers() {
        assertThat<MutableList<Int>>(
            Solution().findGoodIntegers(4104),
            equalTo<MutableList<Int>>(mutableListOf<Int>(1729, 4104)),
        )
    }

    @Test
    fun findGoodIntegers2() {
        assertThat<MutableList<Int>>(
            Solution().findGoodIntegers(578),
            equalTo<MutableList<out Any>>(mutableListOf<Any>()),
        )
    }
}
