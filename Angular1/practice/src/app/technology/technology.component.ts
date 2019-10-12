import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {
  indianTechnology:any=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=science&apiKey=3c01c6ad10ab4d93bd4fec43d626c7fb')
    .subscribe(resData=>{
      this.indianTechnology=resData.articles;
      console.log(this.indianTechnology);
    })
  }

  ngOnInit() {
  }

}
