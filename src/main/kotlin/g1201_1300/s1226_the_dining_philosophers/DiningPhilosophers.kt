package g1201_1300.s1226_the_dining_philosophers

// #Medium #Concurrency #2023_06_09_Time_12_ms_(95.88%)_Space_44.9_MB_(15.29%)

@Suppress("UNUSED_PARAMETER")
class DiningPhilosophers {
    private var leftFork = Any()
    private var rightFork = Any()

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
        synchronized(leftFork) {
            synchronized(rightFork) {
                pickLeftFork.run()
                pickRightFork.run()
                eat.run()
                putRightFork.run()
                putLeftFork.run()
            }
        }
    }
}
