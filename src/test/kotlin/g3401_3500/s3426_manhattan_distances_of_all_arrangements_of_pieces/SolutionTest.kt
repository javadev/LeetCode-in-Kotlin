package g3401_3500.s3426_manhattan_distances_of_all_arrangements_of_pieces

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distanceSum() {
        assertThat<Int>(Solution().distanceSum(2, 2, 2), equalTo<Int>(8))
    }

    @Test
    fun distanceSum2() {
        assertThat<Int>(Solution().distanceSum(1, 4, 3), equalTo<Int>(20))
    }
}
