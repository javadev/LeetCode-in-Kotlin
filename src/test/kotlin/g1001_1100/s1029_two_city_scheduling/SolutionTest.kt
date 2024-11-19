package g1001_1100.s1029_two_city_scheduling

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoCitySchedCost() {
        assertThat(
            Solution()
                .twoCitySchedCost(
                    arrayOf(
                        intArrayOf(10, 20),
                        intArrayOf(30, 200),
                        intArrayOf(400, 50),
                        intArrayOf(30, 20),
                    ),
                ),
            equalTo(110),
        )
    }

    @Test
    fun twoCitySchedCost2() {
        assertThat(
            Solution()
                .twoCitySchedCost(
                    arrayOf(
                        intArrayOf(259, 770),
                        intArrayOf(448, 54),
                        intArrayOf(926, 667),
                        intArrayOf(184, 139),
                        intArrayOf(840, 118),
                        intArrayOf(577, 469),
                    ),
                ),
            equalTo(1859),
        )
    }

    @Test
    fun twoCitySchedCost3() {
        assertThat(
            Solution()
                .twoCitySchedCost(
                    arrayOf(
                        intArrayOf(515, 563),
                        intArrayOf(451, 713),
                        intArrayOf(537, 709),
                        intArrayOf(343, 819),
                        intArrayOf(855, 779),
                        intArrayOf(457, 60),
                        intArrayOf(650, 359),
                        intArrayOf(631, 42),
                    ),
                ),
            equalTo(3086),
        )
    }
}
