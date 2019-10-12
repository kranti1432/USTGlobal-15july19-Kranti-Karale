import { Component, OnInit } from '@angular/core';
import{FormControl,Validators,FormGroup} from '@angular/forms';
import { LoginserviceService } from '../loginservice.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service:LoginserviceService) { }
  
get email(){
  return this.login.get('email')
}
get pass(){
  return this.login.get('pass')
}
  login=new FormGroup({
    email:new FormControl('',[Validators.minLength(7),Validators.required]),
    pass:new FormControl('',[Validators.minLength(6),Validators.required])
  })
  submitData(login){
    console.log(login.value);
 this.service.Users.push(login.value)
  }
  ngOnInit() {
  }

}
