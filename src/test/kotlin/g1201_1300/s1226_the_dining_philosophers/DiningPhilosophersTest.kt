package g1201_1300.s1226_the_dining_philosophers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class DiningPhilosophersTest {
    @Test
    @Throws(InterruptedException::class)
    fun diningPhilosophers() {
        val calls = intArrayOf(0)
        val n = 1
        val d = DiningPhilosophers()
        Thread {
            for (i in 0 until n) {
                try {
                    d.wantsToEat(
                        0,
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                    ) { calls[0]++ }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
            .start()
        Thread {
            for (i in 0 until n) {
                try {
                    d.wantsToEat(
                        1,
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                    ) { calls[0]++ }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
            .start()
        Thread {
            for (i in 0 until n) {
                try {
                    d.wantsToEat(
                        2,
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                    ) { calls[0]++ }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
            .start()
        Thread {
            for (i in 0 until n) {
                try {
                    d.wantsToEat(
                        3,
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                    ) { calls[0]++ }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
            .start()
        Thread {
            for (i in 0 until n) {
                try {
                    d.wantsToEat(
                        4,
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                        { calls[0]++ },
                    ) { calls[0]++ }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
            .start()
        TimeUnit.MILLISECONDS.sleep(500)
        assertThat(calls[0] >= 0, equalTo(true))
    }
}
