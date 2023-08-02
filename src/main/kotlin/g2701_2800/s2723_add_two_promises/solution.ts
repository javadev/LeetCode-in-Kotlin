// #Easy #2023_08_02_Time_56_ms_(97.63%)_Space_43.1_MB_(45.64%)

async function addTwoPromises(promise1: Promise<number>, promise2: Promise<number>): Promise<number> {
    return await promise1 + await promise2
};

/*
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */

 export { addTwoPromises }