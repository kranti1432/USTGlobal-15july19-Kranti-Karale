import { Component, OnInit } from '@angular/core';
import { LoginserviceService } from '../loginservice.service';

@Component({
  selector: 'app-login-details',
  templateUrl: './login-details.component.html',
  styleUrls: ['./login-details.component.css']
})
export class LoginDetailsComponent implements OnInit {
User:any[]=[];
  constructor(private service:LoginserviceService) {
  this.User=this.service.Users
   }

   selectedUser={
     email:null,
     pass:null
   }

   update(user){
this.selectedUser=user;
   }
update2(login2){
let user=login2.value;
console.log(user);
}

  ngOnInit() {
  }

}
