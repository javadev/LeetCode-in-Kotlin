package g3801_3900.s3894_traffic_signal_color

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trafficSignal() {
        assertThat<String>(Solution().trafficSignal(60), equalTo<String>("Red"))
    }

    @Test
    fun trafficSignal2() {
        assertThat<String>(Solution().trafficSignal(5), equalTo<String>("Invalid"))
    }

    @Test
    fun trafficSignal3() {
        assertThat<String>(Solution().trafficSignal(0), equalTo<String>("Green"))
    }

    @Test
    fun trafficSignal4() {
        assertThat<String>(Solution().trafficSignal(30), equalTo<String>("Orange"))
    }

    @Test
    fun trafficSignal5() {
        assertThat<String>(Solution().trafficSignal(100), equalTo<String>("Invalid"))
    }
}
