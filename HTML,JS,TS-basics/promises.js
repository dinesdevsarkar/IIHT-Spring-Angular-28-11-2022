// const fun1 =() => {
//     console.log("This is function 1");
// }
// const fun2 = () => {
//     setTimeout(() => {
//         console.log("This is a function under set time");
//     }, 5000);
//     console.log("This is funtion 2");
// }
// const fun3 =() => {
//     console.log("This is function 3");
// }

// fun1();
// fun2();
// fun3();


const fun1 = () => {
    return "This is function 1";
}
// const fun2 = () => {
//     setTimeout(() => {
//         return "This is funtion 2";
//     }, 5000);
// }
const fun2 = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve ("This is funtion 2");
        }, 5000);

    });

}
const fun3 = () => {
    return "This is function 3";
}

const calfun = async() => {
    let val1 = fun1();
    console.log(val1);
    let val2 = await fun2();
    console.log(val2);
    let val3 = fun3();
    console.log(val3);

}