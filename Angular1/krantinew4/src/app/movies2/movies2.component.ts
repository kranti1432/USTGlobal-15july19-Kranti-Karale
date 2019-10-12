import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-movies2',
  templateUrl: './movies2.component.html',
  styleUrls: ['./movies2.component.css']
})
export class Movies2Component implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  moviesCollectin:any[]=[];
  searchMovie(movie){
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie}&apikey=bd46192`).subscribe(resdata=>{
      this.moviesCollectin=resdata.Search;
      console.log(this.moviesCollectin)
    },err=>{
      console.log(err)
    },()=>{
      console.log("Movies Successfully Created")
    })
  }

}
