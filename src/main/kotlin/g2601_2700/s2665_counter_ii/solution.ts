// #Easy #2023_07_25_Time_65_ms_(86.59%)_Space_44.8_MB_(93.23%)

type ReturnObj = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): ReturnObj {
    let n = init;
    return {
        increment: () => {
            n = n + 1;
            return n;
        },
        decrement: () => {
            n = n - 1;
            return n;
        },
        reset: () => {
            n = init;
            return n;
        }
    }
};

/*
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */