import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { MoviesComponent } from './movies/movies.component';
import { RegisterComponent } from './register/register.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { Register2Component } from './register2/register2.component';


const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot([{
    path:'',component:HomeComponent
  },
  {path:'users',component:UsersComponent},
  {path:'movies',component:MoviesComponent},
  {path:'register',component:RegisterComponent},
  {path:'bike',component:BikeComponent},
  {path:'bike_details',component:BikeDetailsComponent},
  {path:'register2',component:Register2Component}
])],
  exports: [RouterModule]
})
export class AppRoutingModule { }
