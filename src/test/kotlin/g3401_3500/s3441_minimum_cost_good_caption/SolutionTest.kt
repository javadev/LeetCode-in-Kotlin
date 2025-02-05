package g3401_3500.s3441_minimum_cost_good_caption

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostGoodCaption() {
        assertThat<String>(Solution().minCostGoodCaption("cdcd"), equalTo<String>("cccc"))
    }

    @Test
    fun minCostGoodCaption2() {
        assertThat<String>(Solution().minCostGoodCaption("aca"), equalTo<String>("aaa"))
    }

    @Test
    fun minCostGoodCaption3() {
        assertThat<String>(Solution().minCostGoodCaption("bc"), equalTo<String>(""))
    }

    @Test
    fun minCostGoodCaption4() {
        assertThat<String>(
            Solution().minCostGoodCaption("antwfdps"),
            equalTo<String>("nnnnnppp"),
        )
    }

    @Test
    fun minCostGoodCaption5() {
        assertThat<String>(
            Solution().minCostGoodCaption("qzlhsvlf"),
            equalTo<String>("qqqlllll"),
        )
    }

    @Test
    fun minCostGoodCaption6() {
        assertThat<String>(
            Solution().minCostGoodCaption("qeopwomhpq"),
            equalTo<String>("oooooooppp"),
        )
    }
}
