var name = "Dinesh"
var age = 30
var laptop;
laptop = "Dell"
var isGraduate = true;
console.log(name);

function alertUser() {

    alert("This is the user : " + name)
    console.log("Dinesh is the user who logged in");

    var fevChips = ("Lays Onion")
    //defined in function so we can not call outside the function
}
alertUser();
//console.log(fevChips);

function operators(num) {
    if (num > 20) {
        console.log("Number is greater than 20");
    } else if (num = 20) {
        console.log("Number is equal to the 20");
    } else {
        console.log("Number is lesser than 20");
    }
}
operators(87);

function creditScore(score) {
    var creditLimit;

    switch (score) {
        case 800: creditLimit = "Above 1 lack";
            break;
        case 700: creditLimit = "Between 50k to 1 lack"
            break;
        case 600: creditLimit = "Between 25k to 50k"
            break;
        default: creditLimit = "Not eligible"
    }
    console.log(creditLimit);
}
creditScore(800);

function counting() {
    for (let i = 1; i < 10; i++) {
        console.log(i);
    }
}
counting();

var car = new Object();
car.name = "Mercedese";
car.model = "C-Class";
car.price = 60000000;

console.log(car);

var names = ["Dinesh", "Nishant", "JavaLearning"];
console.log(names);

//We can write let or class to define class
class Car {

    //Initializing object
    constructor(brand, modelname, price) {
        this.brand = brand;
        this.modelname = modelname;
        this.price = price;
    }
    print() {
        console.log("This is a " + this.brand + " " + this.modelname + " which costs around " + this.price);
    }
}
var c1 = new Car("Mercedes", "A-Class", 4000000);
var c2 = new Car("BMW", "3 Series", 5000000);

c1.print();
c2.print();



//Example of inheritence class (inbuild class inheritence)
class Todaysdate extends Date {
    constructor() {
        super();
    }
    printDate() {
        console.log(this.getDate());
    }
}
let today = new Todaysdate();
today.printDate();

class AppleLaptop {
    constructor(brand) {
        this.brand = "Apple";
    }
}
class MacBookPro extends AppleLaptop {
    constructor(model, processor, ram) {
        super();
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }
}

let l1 = new MacBookPro("2022 15' MacBookPro", "I7", 16);
console.log(l1.brand + " " + l1.model + " " + l1.processor + " " + l1.ram);



let Afruites = ["Apple", "Banana", "Pineaple"]

let Bfruites = ["Mango", "Lichi", "DragonFruite"]

let AllFruites = [...Afruites, ...Bfruites]// ...(3 dots) is the spread operator it copies all

console.log(AllFruites);

//The way to define inline or arrow function
let countingInline = () => {
    for (let i = 1; i <= 10; i++) {
        console.log(i);
    }
}
countingInline();


//There are 3 keywords used in javascipt to decalre the variables

// var - this has a scope of the varibale, this can be redeclare

var num1 = 1000;
var num1 = 2000;

console.log(num1);


//let keyword is announced with es6, it has a block scope, can not redefined
let a = 200;
function addnumbers() {
    a = 20;
    let b = 300;

    console.log(a + b);
}
addnumbers();
console.log(a + 250);


function addnumbers1() {
    const num2 = 2000;
    //const num2 = 3000;

    console.log(num2);
}
addnumbers1();



// function dogs() {
//     this.dogname = "Labrador";
//     throw new error("This is not a wild dog");
// }
// dogs.prototype.display()= function(){
//     return "This dog bread is : " + this.dogname;
// }

// function Animal(dogname) {
//     this.dogname = dogname;
// }

// Animal.prototype = Object.create(dogs.prototype)
// let tommy = new Animal("German Shefard");
// console.log(tommy.display());


function Greet(){
    alert("Greeting fellow Developers")
}