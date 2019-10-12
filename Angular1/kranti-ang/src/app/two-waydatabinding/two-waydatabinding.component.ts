import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-waydatabinding',
  templateUrl: './two-waydatabinding.component.html',
  styleUrls: ['./two-waydatabinding.component.css']
})
export class TwoWaydatabindingComponent implements OnInit {
  ngOnInit():void {
    console.log("oninit implement");
  }

  // paragraphStyle="Red";
  // fontColor="red"
  backgroundcolor="red";
  
  constructor() { 
    console.log("constructor running");
  }

buttonEvent(data){
  console.log(data);
}

// changecolor(){
//   if(this.backgroundcolor==="yellow"){
//     this.backgroundcolor="red";
//   }
//   else
//   this.backgroundcolor="yellow";
// }



changecolor(data){
this.backgroundcolor=data;
}


}
