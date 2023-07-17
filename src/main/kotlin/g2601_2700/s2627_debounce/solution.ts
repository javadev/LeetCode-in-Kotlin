// #Medium #2023_07_17_Time_64_ms_(73.92%)_Space_43.1_MB_(35.10%)

type F = (...p: any[]) => any

function debounce(fn: F, t: number): F {
    var ref = null;
    return function(...args) {
        if(ref !== null) {
            clearTimeout(ref)
        }
        ref = setTimeout(()=>fn(...args), t)
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */