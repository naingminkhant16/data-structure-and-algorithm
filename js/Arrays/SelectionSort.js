const arr = [42, 23, 74, 11, 65, 88, 19, 56, 93, 7];
// after first loop 3,12,9,11,7

for (let i = 0; i < arr.length - 1; i++) {
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
            // swap
            const temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}

console.log(arr)