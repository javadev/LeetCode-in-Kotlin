// #Hard #2023_07_17_Time_314_ms_(99.39%)_Space_115.7_MB_(62.42%)

type Fn = (...params: any) => any

function memoize(fn: Fn): Fn {
    const cache = new Map();

    return function(...args) {
        let currentCache;
        if (cache.has(args.length)) {
            currentCache = cache.get(args.length);
        }
        else {
            currentCache = new Map();
            cache.set(args.length, currentCache);
        }

        for (let i=0, len=args.length; i<=len; i++){
            const arg = args[i];
            const isEnd = i >= len - 1;

            if (currentCache.has(arg)) {
                if (isEnd) {
                    return currentCache.get(arg);
                }
                else {
                    currentCache = currentCache.get(arg);
                }
            }
            else {
                if (isEnd) {
                    break;
                }
                else {
                    const newSubCache = new Map();

                    currentCache.set(arg, newSubCache);
                    currentCache = newSubCache;
                }
            }
        }

        let value = fn.apply(null, args);

        currentCache.set(args[args.length - 1], value);
        return value;
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