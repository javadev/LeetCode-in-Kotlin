package g1201_1300.s1226_the_dining_philosophers

import java.util.concurrent.Semaphore

// #Medium #Concurrency
class DiningPhilosophers {
    private val forks = arrayOfNulls<Semaphore>(5)
    private val eating = Semaphore(4)

    init {
        for (i in 0..4) {
            forks[i] = Semaphore(1)
        }
    }

    // call the run() method of any runnable to execute its code
    @Throws(InterruptedException::class)
    fun wantsToEat(
        philosopher: Int,
        pickLeftFork: Runnable,
        pickRightFork: Runnable,
        eat: Runnable,
        putLeftFork: Runnable,
        putRightFork: Runnable
    ) {
        eating.acquire()
        forks[philosopher]!!.acquire()
        forks[(philosopher + 1) % 5]!!.acquire()
        pickLeftFork.run()
        pickRightFork.run()
        eat.run()
        putLeftFork.run()
        putRightFork.run()
        forks[philosopher]!!.release()
        forks[(philosopher + 1) % 5]!!.release()
        eating.release()
    }
}
