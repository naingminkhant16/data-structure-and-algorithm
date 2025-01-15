const myArray = [7, 12, 9, 11, 3];

for (let i = 0; i < myArray.length - 1; i++) {
    let swap = false;
    for (let j = 0; j < myArray.length - 1 - i; j++) {
        if (myArray[j] > myArray[j + 1]) {
            // swap
            const temp = myArray[j];
            myArray[j] = myArray[j + 1];
            myArray[j + 1] = temp;
            swap = true;
        }
    }
    if (!swap) break;
}

console.log(myArray);