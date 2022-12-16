import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  employee = {
    "name" : "Lewis Hamillton",
    "baseSalary": 250000,
    "joinedOn" : Date.now(),
    "qualification" : "BTech",
    "about": "Lewis Hamillton is good racer and workinf in mercedese as a driver now.",
    "winningPercentage": 35/100
  }

  constructor() { }

  ngOnInit(): void {
  }

}
