package g3401_3500.s3492_maximum_containers_on_a_ship

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxContainers() {
        assertThat<Int>(Solution().maxContainers(2, 3, 15), equalTo<Int>(4))
    }

    @Test
    fun maxContainers2() {
        assertThat<Int>(Solution().maxContainers(3, 5, 20), equalTo<Int>(4))
    }
}
