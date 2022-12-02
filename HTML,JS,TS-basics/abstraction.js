function car (color, model, cost, fueltype) {
    this.color = color;
    this.model = model;
    this.cost = cost;
    this.fueltype = fueltype;
    this.runningcoast= 30000;

    this.getDetails = function(){
        console.log("This is a color of car : "+ this.color);
        console.log("This is a model of car : "+ this.model);
        console.log("This is a cost of car : "+ this.cost);
        console.log("This is a fueltype of car : "+ this.fueltype);
        console.log("This is a running cost of car : "+ this.runningcoast);
    }

    this.totalcostofowner = function(){
        console.log("Total coast is : "+ runningcoast + cost);
    }
}


let mercedes = new Car("Mercedese", "C Class", 50000, "Petrol")
console.log(mercedes);

