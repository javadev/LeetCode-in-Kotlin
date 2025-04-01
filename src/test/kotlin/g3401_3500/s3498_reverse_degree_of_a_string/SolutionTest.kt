package g3401_3500.s3498_reverse_degree_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseDegree() {
        assertThat<Int>(Solution().reverseDegree("abc"), equalTo<Int>(148))
    }

    @Test
    fun reverseDegree2() {
        assertThat<Int>(Solution().reverseDegree("zaza"), equalTo<Int>(160))
    }
}
