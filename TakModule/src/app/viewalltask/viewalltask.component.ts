import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {
tasks=[];
  constructor(public service:FirebaseService) {
    this.getTask();
   }
   getTask(){
   
    this.service.getTask().subscribe(data=>{
      this.tasks=data;
    },err=>{
      console.log(err)
    })
  }
  delete(task){
    let index=this.tasks.indexOf(task);
    this.tasks.splice(index,1)
  }
  ngOnInit() {
  }

}
