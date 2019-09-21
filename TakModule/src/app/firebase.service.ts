import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{ map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {
  url="https://kranti2-70fd5.firebaseio.com/";

  constructor(private http:HttpClient) { }
  sendTask(sendtask){
    return this.http.post(`${this.url}/task.json`,sendtask);
  }
  getTask(){
     return this.http.get(`${this.url}/task.json`)
     .pipe(map(data=>{
       let array1:any[]=[];
       for(let key in data){
         array1.push({...data[key],id:key})
       }
       return array1;
     }))
  }
  delete(task){
    return this.http.delete(`${this.url}/task.json`,task)
  }
}
