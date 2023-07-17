// #Easy #2023_07_17_Time_64_ms_(75.36%)_Space_43.5_MB_(5.78%)

type Fn = (...params: any[]) => Promise<any>;

function timeLimit(fn: Fn, t: number): Fn {
  return async function (...args: any[]): Promise<any> {
    const fns = fn(...args);
    const timeLimitPromise = new Promise((_, reject) => {
      setTimeout(() => {
        reject("Time Limit Exceeded");
      }, t);
    });

    return Promise.race([fns, timeLimitPromise]);
  };
}

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */