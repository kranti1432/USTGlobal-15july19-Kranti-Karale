import { Component, OnInit } from '@angular/core';
import{NgModel,NgForm,FormsModule} from '@angular/forms';
import { FirebaseService } from '../firebase.service';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {


  constructor(private service:FirebaseService ) {}
  
  ngOnInit() {
  }
  sendTask(sendTask){
    this.service.sendTask(sendTask).subscribe(sendTask=>{
      console.log(sendTask);
    })
  }
}
