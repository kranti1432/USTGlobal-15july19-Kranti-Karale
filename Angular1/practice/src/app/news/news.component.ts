import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
indianNews:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
    .subscribe(resData=>{
      this.indianNews=resData.articles;
      console.log(this.indianNews);
    })
  }

  ngOnInit() {
  }

}
