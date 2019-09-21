import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { ViewalltaskComponent } from './viewalltask/viewalltask.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    AddTaskComponent,
    ViewalltaskComponent,
    HeaderComponent,
  
  ],
  imports: [
    BrowserModule,HttpClientModule,FormsModule,
    AppRoutingModule,RouterModule.forRoot([
      {path:'addtask',component:AddTaskComponent},
    {
      path:'viewalltask',component:ViewalltaskComponent
    }]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
