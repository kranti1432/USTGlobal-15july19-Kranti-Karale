import { Component, OnInit } from '@angular/core';
import { FireServService } from '../fire-serv.service';

@Component({
  selector: 'app-fire-send',
  templateUrl: './fire-send.component.html',
  styleUrls: ['./fire-send.component.css']
})
export class FireSendComponent implements OnInit {

  constructor(private service:FireServService) { }

  ngOnInit() {
  }
  sendData(senduser){
    this.service.sendData(senduser).subscribe(senduser=>{
      console.log(senduser);
    })
  }
}
