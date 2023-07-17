// #Easy #2023_07_16_Time_51_ms_(94.69%)_Space_43.2_MB_(27.55%)

declare global {
    interface Array<T> {
        last(): T | -1
    }
}

Array.prototype.last = function <T>(): T | -1 { //NOSONAR
    return this.length ? this.at(-1) : -1
}

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */

export {}
