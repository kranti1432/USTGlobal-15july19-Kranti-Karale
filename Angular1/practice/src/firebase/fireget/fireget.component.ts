import { Component, OnInit } from '@angular/core';
import { FireServService } from '../fire-serv.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-fireget',
  templateUrl: './fireget.component.html',
  styleUrls: ['./fireget.component.css']
})
export class FiregetComponent implements OnInit {
 users=[];
  constructor(public service:FireServService,public router:Router) {

     this.getData();
  }
  getData(){
   
    this.service.getData().subscribe(data=>{
      this.users=data;
    },err=>{
      console.log(err)
    })
  }
// send(user){
//   this.service.selected=user;
//  this.router.navigateByUrl('/firebase')
// }


  ngOnInit() {
  }

}
