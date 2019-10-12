import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-assign2',
  templateUrl: './assign2.component.html',
  styleUrls: ['./assign2.component.css']
})
export class Assign2Component implements OnInit {
  array:any[]=[];

  constructor(private http:HttpClient) { 
    http.get<any>('https://api.github.com/users').subscribe(resData=>{
      return this.array=resData;
      console.log(this.array);
    })
  }

  grtData(){
    
  }

  ngOnInit() {
  }

}
