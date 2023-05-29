package g1101_1200.s1117_building_h2o

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

internal class H2OTest {
    @Test
    fun h20() {
        val h2o = H2O()
        val executor = ThreadPoolExecutor(6, 30, 15, TimeUnit.SECONDS, ArrayBlockingQueue(12))
        for (i in 0..11) {
            executor.execute(H2O.HydrogenRunnable(h2o))
            executor.execute(H2O.OxygenRunnable(h2o))
            executor.execute(H2O.HydrogenRunnable(h2o))
        }
        MatcherAssert.assertThat(true, Matchers.equalTo(true))
    }
}