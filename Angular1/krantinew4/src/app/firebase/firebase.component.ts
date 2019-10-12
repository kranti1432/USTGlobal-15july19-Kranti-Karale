import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-firebase',
  templateUrl: './firebase.component.html',
  styleUrls: ['./firebase.component.css']
})
export class FirebaseComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private Router:Router) { }
postUser(form:NgForm){
  if(form.value.id){
    this.firebaseService.updateData(form.value).subscribe(resData=>{
      console.log(resData);
      this.firebaseService.getData();
      
      this.Router.navigateByUrl('/users');
    },err=>{
      console.log(err);
    })
  }else
  {this.firebaseService.postData(form.value).subscribe(data=>{
    console.log(data);
    this.firebaseService.getData();
    
    this.Router.navigateByUrl('/firebase');
  },err=>{
console.log(err);
})
}
}
  ngOnInit() {
  }

}
