// #Easy #2023_07_26_Time_52_ms_(92.72%)_Space_43.1_MB_(21.30%)

function createHelloWorld() {
    return function (...args): string {
        return 'Hello World'
    }
}

/*
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */

 export { createHelloWorld }
