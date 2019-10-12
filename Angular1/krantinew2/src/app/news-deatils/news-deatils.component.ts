import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-news-deatils',
  templateUrl: './news-deatils.component.html',
  styleUrls: ['./news-deatils.component.css']
})
export class NewsDeatilsComponent implements OnInit {
@Input() newsdetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
