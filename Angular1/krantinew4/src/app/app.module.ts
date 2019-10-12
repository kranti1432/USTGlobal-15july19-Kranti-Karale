import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import{HttpClientModule} from '@angular/common/http';
import{FormsModule} from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsComponent } from './news/news.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';
import { PipesPipe } from './pipes.pipe';
import { FilterPipe } from './filter.pipe';
import { Movies2Component } from './movies2/movies2.component';

@NgModule({
  declarations: [
    AppComponent,
    NewsComponent,
    HeaderComponent,
    MoviesComponent,
    FirebaseComponent,
    UsersComponent,
    PipesPipe,
    FilterPipe,
    Movies2Component,
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'news',component:NewsComponent},
      {
        path:'movie',component:MoviesComponent
      },
      {
        path:'users',component:UsersComponent
      },
      {
        path:'firebase',component:FirebaseComponent
      },
      { path: 'movies2',component:Movies2Component}

    ]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
