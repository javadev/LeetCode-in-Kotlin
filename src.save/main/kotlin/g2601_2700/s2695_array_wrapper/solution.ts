// #Easy #2023_07_29_Time_40_ms_(100.00%)_Space_45_MB_(48.83%)

class ArrayWrapper {
    nums: number[]
    constructor(nums: number[]) {
        this.nums = nums
    }

    valueOf() {
        return this.nums.reduce((n, a) => n + a, 0)
    }

    toString() {
        return '[' + this.nums.join(',') + ']'
    }
}

/*
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */

export { ArrayWrapper }
