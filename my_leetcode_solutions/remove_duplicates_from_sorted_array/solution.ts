function removeDuplicates(nums: number[]): number {
    const uniqueNums: number[] = [...new Set(nums)];
    for (let i = 0; i < uniqueNums.length; i++)
        nums[i] = uniqueNums[i];
    return uniqueNums.length;
}


let nums: number[] = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];
// let nums: number[] = [0, 0, 0, 1];
// let nums: number[] = [1, 1, 2];
console.log("Nums before removeDuplicates");
console.log(nums)
const k: number = removeDuplicates(nums);
console.log("Lengths K")
console.log(k)
console.log("Numbers after removeDuplicates");
console.log(nums)

