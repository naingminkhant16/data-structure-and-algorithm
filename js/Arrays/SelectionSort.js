const arr = [42, 23, 74, 11, 65, 88, 19, 56, 93, 7];
// after first loop 3,12,9,11,7

for (let i = 0; i < arr.length - 1; i++) {
    let minIndex = i;
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    if (minIndex !== i) {
        // swap
        const temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

console.log(arr)