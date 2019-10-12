import { Component, OnInit } from '@angular/core';
import { ForpracticebService } from '../forpracticeb.service';

@Component({
  selector: 'app-practiceb',
  templateUrl: './practiceb.component.html',
  styleUrls: ['./practiceb.component.css']
})
export class PracticebComponent implements OnInit {

  
  constructor( private service:ForpracticebService) { }

  getuser(regForm){
    console.log(regForm.value);
    this.service.Users.push(regForm.value);
      }
  ngOnInit() {
  }

}
