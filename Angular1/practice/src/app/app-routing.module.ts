import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { SportsComponent } from './sports/sports.component';
import { HealthComponent } from './health/health.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { BusinessComponent } from './business/business.component';
import { ScienceComponent } from './science/science.component';
import { TechnologyComponent } from './technology/technology.component';
import { GeneralComponent } from './general/general.component';


const routes: Routes = [
  {path: 'sports' ,component: SportsComponent},
  {path: 'entertainment' ,component: EntertainmentComponent},
  {path: 'health' ,component:HealthComponent},
  {path: 'business' ,component:BusinessComponent},
  {path: 'science' ,component:ScienceComponent},
  {path: 'technology' ,component:TechnologyComponent},
  {path: 'general' ,component:GeneralComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})
export class AppRoutingModule { }
