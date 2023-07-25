// #Easy #2023_07_25_Time_53_ms_(93.29%)_Space_42.1_MB_(98.84%)

function once<T extends (...args: T[]) => any>(fn: T):
 ((...args: Parameters<T>) => ReturnType<T> | undefined) {
    let hasRun: boolean;
  return function (...args: T[]): ReturnType<T> | undefined {
      if (!hasRun) {
        hasRun = true;
        return fn(...args);
      } else {
          return undefined;
      }
  };
}

/*
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */