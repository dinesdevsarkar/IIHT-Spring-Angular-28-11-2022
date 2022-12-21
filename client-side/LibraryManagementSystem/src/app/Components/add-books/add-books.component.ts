import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/model/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {

  book: Book = new Book();

  constructor(private bookService: BookService,
    private router: Router) { }


  ngOnInit(): void {
  }

  
  createBook(){
    const observables = this.bookService.createBook(this.book);
    observables.subscribe(
      (res: any) => {
        console.log(res);
      }, function (error) {
        console.log(error);
        alert("Something went wrong !, Please try again");
      }
    )
  }

}

