import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../model/book';

const BASE_URL = "http://localhost:8085";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private httpClient: HttpClient) { }

  getBooks(): Observable<Book[]>{
    return this.httpClient.get<Book[]>(BASE_URL + "/allbooks");
  }

  createBook(book: Book): Observable<Object>{
    return this.httpClient.post(BASE_URL + "/add/book", book);
  }

  deleteBook(book: any) {
    return this.httpClient.delete(BASE_URL + "/remove/" + book.bookId);
  }

}
