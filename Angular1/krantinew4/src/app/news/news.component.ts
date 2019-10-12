import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  indianNews:any[]=[];

  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=4d78d0db46a24378bd81cc1fc26c2251')
    .subscribe(resData=>{
      this.indianNews=resData.articles;
    })
   }

  ngOnInit() {
  }

}
