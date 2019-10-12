import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-practicechild',
  templateUrl: './practicechild.component.html',
  styleUrls: ['./practicechild.component.css']
})
export class PracticechildComponent implements OnInit {
@Input() method1;
@Output() public childEvent=new EventEmitter();

  constructor() { }

  ngOnInit() {
  }
 sendEvent(){
   this.childEvent.emit("hii kranti how r u?");
 }
}
