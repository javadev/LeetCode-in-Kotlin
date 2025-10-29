package g3701_3800.s3725_count_ways_to_choose_coprime_integers_from_rows

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCoprime() {
        assertThat<Int>(
            Solution().countCoprime(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo<Int>(3),
        )
    }

    @Test
    fun countCoprime2() {
        assertThat<Int>(
            Solution().countCoprime(arrayOf<IntArray>(intArrayOf(2, 2), intArrayOf(2, 2))),
            equalTo<Int>(0),
        )
    }
}
