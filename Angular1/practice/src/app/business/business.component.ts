import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-business',
  templateUrl: './business.component.html',
  styleUrls: ['./business.component.css']
})
export class BusinessComponent implements OnInit {
  indianBusiness:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
    .subscribe(resData=>{
      this.indianBusiness=resData.articles;
      console.log(this.indianBusiness);
    })
  }

  ngOnInit() {
  }

}
