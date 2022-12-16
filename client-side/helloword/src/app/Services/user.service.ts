import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import User from 'src/app/Entity/user';

const BASE_URL = 'http://localhost:5000/users'

@Injectable({
  providedIn: 'root'
})
export class UserService {


  users: User[] = [];

  constructor(private http : HttpClient) { }

saveUser(user: {
  firstname: String;
    lastname: String;
    age: number;
    gender: String;
    email: String;
}) {
  return this.http.post(BASE_URL, user);
}

getUsers(){
  return this.http.get(BASE_URL);
  }

delteUsers(user:any){
  return this.http.delete(BASE_URL + "/" + user.id);
}

}
