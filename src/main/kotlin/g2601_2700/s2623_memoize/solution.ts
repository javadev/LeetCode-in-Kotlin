// #Medium #2023_07_16_Time_326_ms_(92.92%)_Space_108.8_MB_(38.51%)

type Fn = (...params: any) => any

function memoize(fn: Fn): Fn {
    const mem_args: Map<string, any> = new Map<string, any> ();
    return function(...args) {
        const args_str = args.toString();
        if (mem_args.has(args_str)) {
            return mem_args.get(args_str);
        }

        const result =  fn(...args);
        mem_args.set(args_str, result);
        return result;
    }
}

/**
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1
 */
