import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './users/users.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { Header2Component } from './header2/header2.component';
import { LoginComponent } from './login/login.component';
import { LoginDetailsComponent } from './login-details/login-details.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    RegisterComponent,
    UsersComponent,
    HeaderComponent,
    Header2Component,
    LoginComponent,
    LoginDetailsComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,ReactiveFormsModule,FormsModule,
    AppRoutingModule,RouterModule.forRoot([{
      path:'',component:HomeComponent
    },
  {path:'about',component:AboutComponent},
{path:'register',component:RegisterComponent},{
  path:'users',component:UsersComponent
},
{path:'login',component:LoginComponent},
{path:'logind',component:LoginDetailsComponent},
{path:'**',component:PagenotfoundComponent}])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
