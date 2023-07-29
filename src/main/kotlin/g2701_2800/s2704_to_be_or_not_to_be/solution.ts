// #Easy #2023_07_29_Time_49_ms_(97.88%)_Space_42.3_MB_(89.10%)

type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

const expect = (val: any): ToBeOrNotToBe => ({
    toBe: (equality: any) => {
        if (val !== equality) {
            throw new Error("Not Equal");
        }
        return true;
    },
    notToBe: (equality: any) => {
        if (val === equality) {
            throw new Error("Equal");
        }
        return true;
    },
});

/*
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

 export { expect }