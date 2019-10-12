import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
url:string ='https://angular-http-d3e45.firebaseio.com/';
// dependency injection in the constructor
  constructor( private http:HttpClient) { }
// data that need to post pass as parameter

  postData(data){
    return this.http.post(`${this.url}users.json`,data);
  }
  // first arg is api 2nd is data to post 
  // /user is json extension to firebase url as json object
}
