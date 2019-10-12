import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import{Router} from '@angular/router';
import { from } from 'rxjs';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private FirebaseService:FirebaseService,private Router:Router) { }

updateUser(user){
  this.FirebaseService.selectedUser=user;
  this.Router.navigateByUrl('/firebase');
  
  }

  deleteUser(user){
    this.FirebaseService.deleteData(user).subscribe(resData=>{
      console.log(resData);
      this.FirebaseService.getData();
    })
  }
  ngOnInit() {
    this.FirebaseService.getData();
console.log(this.FirebaseService.users);
  }

}
