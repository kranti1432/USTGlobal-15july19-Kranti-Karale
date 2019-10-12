import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-science',
  templateUrl: './science.component.html',
  styleUrls: ['./science.component.css']
})
export class ScienceComponent implements OnInit {
  indianScience:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=science&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
    .subscribe(resData=>{
      this.indianScience=resData.articles;
      console.log(this.indianScience);
    })
  }
  ngOnInit() {
  }

}
