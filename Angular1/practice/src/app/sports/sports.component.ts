import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {
  indianSport:any=[];
  constructor(private http:HttpClient) { 
  http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
  .subscribe(resData=>{
    this.indianSport=resData.articles;
    console.log(this.indianSport);
  })
}
  ngOnInit() {
  }

}
