import { Component, OnInit,Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Output() ChildData =new EventEmitter();
@Input() dataFromParent='';


  constructor() { }

  ngOnInit() {
    this.ChildData.emit('this is data from child');
  }


}
