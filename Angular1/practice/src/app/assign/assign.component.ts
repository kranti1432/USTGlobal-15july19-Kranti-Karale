import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-assign',
  templateUrl: './assign.component.html',
  styleUrls: ['./assign.component.css']
})
export class AssignComponent implements OnInit {
user:any[]=[];
  constructor(private http:HttpClient) { 
    http.get<any>('https://jsonplaceholder.typicode.com/posts').subscribe(resData=>{
      this.user=resData;
    })
  }

  ngOnInit() {
  }

}
