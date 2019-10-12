import { Component, OnInit } from '@angular/core';
import { Head2serivceService } from '../head2serivce.service';



@Component({
  selector: 'app-homeh2',
  templateUrl: './homeh2.component.html',
  styleUrls: ['./homeh2.component.css']
})
export class Homeh2Component implements OnInit {
products:any[]=[];
  constructor(private service:Head2serivceService) { 
    this.getData();
  }


  getData(){ 
    this.service.getData().subscribe(data=>{
    this.products=data;
  },err=>{
    console.log(err);
  })
  }
  ngOnInit() {
  }

}
