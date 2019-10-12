import { Component, OnInit } from '@angular/core';

import { Head2serivceService } from '../head2serivce.service';

@Component({
  selector: 'app-addproducth2',
  templateUrl: './addproducth2.component.html',
  styleUrls: ['./addproducth2.component.css']
})
export class Addproducth2Component implements OnInit {

  constructor(private service:Head2serivceService) { }

  ngOnInit() {
  }
sendData(data){
  this.service.sendData(data).subscribe(data=>{
    console.log(data);
  },err=>{
    console.log(err);
  },()=>{
    console.log("data enter successfully");
  })
}
}
