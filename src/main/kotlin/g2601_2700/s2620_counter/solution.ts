// #Easy #2023_07_16_Time_53_ms_(91.77%)_Space_43.1_MB_(46.69%)

function createCounter(n: number): () => number {
    const fun = function() {
        n++;
        return n-1;
    } 
    return fun;
}

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
