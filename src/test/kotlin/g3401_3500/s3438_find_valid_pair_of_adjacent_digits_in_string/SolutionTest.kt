package g3401_3500.s3438_find_valid_pair_of_adjacent_digits_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findValidPair() {
        assertThat<String>(Solution().findValidPair("2523533"), equalTo<String>("23"))
    }

    @Test
    fun findValidPair2() {
        assertThat<String>(Solution().findValidPair("221"), equalTo<String>("21"))
    }

    @Test
    fun findValidPair3() {
        assertThat<String>(Solution().findValidPair("22"), equalTo<String>(""))
    }
}
