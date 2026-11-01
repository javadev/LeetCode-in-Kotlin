package g3901_4000.s3906_count_good_integers_on_a_grid_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodIntegersOnPath() {
        assertThat<Long>(
            Solution().countGoodIntegersOnPath(8L, 10L, "DDDRRR"),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun countGoodIntegersOnPath2() {
        assertThat<Long>(
            Solution().countGoodIntegersOnPath(123456789L, 123456790L, "DDRRDR"),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun countGoodIntegersOnPath3() {
        assertThat<Long>(
            Solution()
                .countGoodIntegersOnPath(1288561398769758L, 1288561398769758L, "RRRDDD"),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun countGoodIntegersOnPath4() {
        assertThat<Long>(
            Solution()
                .countGoodIntegersOnPath(1111111111111111L, 1111111111111111L, "RDRDRD"),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun countGoodIntegersOnPath5() {
        assertThat<Long>(
            Solution().countGoodIntegersOnPath(1L, 9L, "DRDRDR"),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun countGoodIntegersOnPath6() {
        assertThat<Long>(
            Solution().countGoodIntegersOnPath(1L, 99L, "RRRDDD"),
            equalTo<Long>(99L),
        )
    }

    @Test
    fun countGoodIntegersOnPath7() {
        assertThat<Long>(
            Solution().countGoodIntegersOnPath(1L, 99L, "DDDRRR"),
            equalTo<Long>(54L),
        )
    }

    @Test
    fun countGoodIntegersOnPath8() {
        assertThat<Long>(
            Solution()
                .countGoodIntegersOnPath(9000000000000000L, 9000000000000000L, "RRRDDD"),
            equalTo<Long>(0L),
        )
    }
}
