package g3201_3300.s3213_construct_string_with_minimum_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(
            Solution()
                .minimumCost(
                    "abcdef",
                    arrayOf("abdef", "abc", "d", "def", "ef"),
                    intArrayOf(100, 1, 1, 10, 5),
                ),
            equalTo(7),
        )
    }

    @Test
    fun minimumCost2() {
        assertThat(
            Solution()
                .minimumCost(
                    "aaaa",
                    arrayOf("z", "zz", "zzz"),
                    intArrayOf(1, 10, 100),
                ),
            equalTo(-1),
        )
    }
}
