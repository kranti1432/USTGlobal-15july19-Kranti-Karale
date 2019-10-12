import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-general',
  templateUrl: './general.component.html',
  styleUrls: ['./general.component.css']
})
export class GeneralComponent implements OnInit {
  indianGeneral:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=general&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
    .subscribe(resData=>{
      this.indianGeneral=resData.articles;
      console.log(this.indianGeneral);
    })
  }

  ngOnInit() {
  }

}
