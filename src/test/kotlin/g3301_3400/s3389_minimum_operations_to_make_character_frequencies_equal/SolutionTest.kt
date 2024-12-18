package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeStringGood() {
        assertThat<Int>(Solution().makeStringGood("acab"), equalTo<Int>(1))
    }

    @Test
    fun makeStringGood2() {
        assertThat<Int?>(Solution().makeStringGood("wddw"), equalTo<Int>(0))
    }

    @Test
    fun makeStringGood3() {
        assertThat<Int>(Solution().makeStringGood("aaabc"), equalTo<Int>(2))
    }
}
