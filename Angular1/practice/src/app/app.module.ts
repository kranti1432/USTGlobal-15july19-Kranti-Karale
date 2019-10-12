import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsComponent } from './news/news.component';
import { HttpClientModule } from '@angular/common/http';
import { MoviesComponent } from './movies/movies.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule, ReactiveFormsModule} from'@angular/forms';
import { from } from 'rxjs';
import { FirebaseComponent } from './firebase/firebase.component';
import { SortsComponent } from './sorts/sorts.component';
import { SportsComponent } from './sports/sports.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { HealthComponent } from './health/health.component';
import { BusinessComponent } from './business/business.component';
import { ScienceComponent } from './science/science.component';
import { GeneralComponent } from './general/general.component';
import { TechnologyComponent } from './technology/technology.component';
import { Assign2Component } from './assign2/assign2.component';

import { AssignComponent } from './assign/assign.component';
import { PracticeComponent } from '../practicea/practice/practice.component';
import { PracticechildComponent } from '../practicea/practicechild/practicechild.component'
import { FireSendComponent } from '../firebase/fire-send/fire-send.component';
import { FiregetComponent } from '../firebase/fireget/fireget.component';
import { FireheadComponent } from '../firebase/firehead/firehead.component';
import { RouterOutlet, RouterModule } from '@angular/router';
import { UsersComponent } from './users/users.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { PracticebComponent } from './practiceb/practiceb.component';


@NgModule({
  declarations: [
    AppComponent,
    NewsComponent,
    MoviesComponent,
    HeaderComponent,
    FirebaseComponent,
    SortsComponent,
    SportsComponent,
    EntertainmentComponent,
    HealthComponent,
    BusinessComponent,
    ScienceComponent,
    GeneralComponent,
    TechnologyComponent,
    Assign2Component,
    AssignComponent,
    PracticeComponent,
    PracticechildComponent,
    FireSendComponent,
    FiregetComponent,
    FireheadComponent,
    UsersComponent,
    AboutComponent,
    RegisterComponent,
    PracticebComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,ReactiveFormsModule,
  
    AppRoutingModule,HttpClientModule,
  //   RouterModule.forRoot([{path:'add', component:FireSendComponent},
  // {path:'get', component:FiregetComponent}]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
