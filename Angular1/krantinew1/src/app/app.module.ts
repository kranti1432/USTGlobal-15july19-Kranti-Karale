import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule, ReactiveFormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './users/users.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { MoviesComponent } from './movies/movies.component';
import { Register2Component } from './register2/register2.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    RegisterComponent,
    UsersComponent,
    BikeComponent,
    BikeDetailsComponent,
    MoviesComponent,
    Register2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
