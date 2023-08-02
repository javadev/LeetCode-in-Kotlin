package g2401_2500.s2478_number_of_beautiful_partitions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulPartitions() {
        assertThat(Solution().beautifulPartitions("23542185131", 3, 3), equalTo(1))
    }

    @Test
    fun beautifulPartitions2() {
        assertThat(Solution().beautifulPartitions("23542185131", 3, 2), equalTo(3))
    }

    @Test
    fun beautifulPartitions3() {
        assertThat(Solution().beautifulPartitions("3312958", 3, 1), equalTo(1))
    }
}
