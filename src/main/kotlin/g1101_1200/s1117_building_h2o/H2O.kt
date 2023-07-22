package g1101_1200.s1117_building_h2o

// #Medium #Concurrency #2023_05_31_Time_20_ms_(45.16%)_Space_44.8_MB_(67.49%)

import java.util.concurrent.Semaphore

class H2O {
    private val hSemaphore: Semaphore
    private val oSemaphore: Semaphore

    init {
        hSemaphore = Semaphore(2)
        oSemaphore = Semaphore(2)
    }

    @Throws(InterruptedException::class)
    fun hydrogen(releaseHydrogen: Runnable) {
        hSemaphore.acquire()
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run()
        oSemaphore.release()
    }

    @Throws(InterruptedException::class)
    fun oxygen(releaseOxygen: Runnable) {
        oSemaphore.acquire(2)
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run()
        hSemaphore.release(2)
    }

    class HydrogenRunnable(private val h2O: H2O) : Runnable {
        override fun run() {
            try {
                h2O.hydrogen { print('H') }
            } catch (ignored: InterruptedException) {
                // ignored
            }
        }
    }

    class OxygenRunnable(private val h2O: H2O) : Runnable {
        override fun run() {
            try {
                h2O.oxygen { print('O') }
            } catch (ignored: InterruptedException) {
                // ignored
            }
        }
    }
}
