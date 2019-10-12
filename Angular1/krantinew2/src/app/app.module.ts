import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';


import { AppComponent } from './app.component';
import { CarComponent } from './car/car.component';
import { NewsComponent } from './news/news.component';
import { RecipeComponent } from './recipe/recipe.component';
import { MobileComponent } from './mobile/mobile.component';
import { NewsDeatilsComponent } from './news-deatils/news-deatils.component';
import { RecipeDetailsComponent } from './recipe-details/recipe-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import{FormsModule, ReactiveFormsModule} from '@angular/forms';
import { Header2Component } from './header2/header2.component';
import { Homeh2Component } from './homeh2/homeh2.component';
import { Addproducth2Component } from './addproducth2/addproducth2.component';
import { Productdetailsh2Component } from './productdetailsh2/productdetailsh2.component';

import { HttpClientModule } from '@angular/common/http';
import { UsersComponent } from 'project1/users/users.component';
import { Register2Component } from 'project1/register2/register2.component';
import { Home1Component } from 'project1/home1/home1.component';
import { AboutComponent } from 'project1/about/about.component';
import { HeadermainComponent } from 'project1/headermain/headermain.component';
import { ForgetComponent } from '../../project2/forget/forget.component';

@NgModule({
  declarations: [
    AppComponent,
    CarComponent,
    NewsComponent,
    RecipeComponent,
    MobileComponent,
    NewsDeatilsComponent,

    RecipeDetailsComponent,
    MobileDetailsComponent,
    CarDetailsComponent,
    HeaderComponent,
    RegisterComponent,
    Header2Component,
    Homeh2Component,
    Addproducth2Component,
    Productdetailsh2Component,
    UsersComponent,
    Register2Component,
    Home1Component,
    AboutComponent,
    HeadermainComponent,
    ForgetComponent,

  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
path:'car',component:CarComponent
    },
    {
      path:'news',component:NewsComponent
          },
          {
            path:'recipe',component:RecipeComponent
                },
                {
                  path:'mobile',component:MobileComponent
                      },
                      {
                        path:'NewsDeatils',component:NewsDeatilsComponent
                            },
                            {
                              path:'MobileDetails',component:MobileDetailsComponent
                                  },
                                  {
                                    path:'CarDetails',component:CarDetailsComponent
                                        },
                                        {
                                          path:'CarDetails',component:RecipeDetailsComponent
                                              },
                                              {
                                                path:'addproduct',component:Addproducth2Component
                                                    },
                                                    {
                                                      path:'home',component:Homeh2Component
                                                          
                                                        },
                                                        {
                                                          path:'productdetails',component:Productdetailsh2Component
                                                              }
//project 1 paths
,{path:'',component:Home1Component},
{path:'about',component:AboutComponent},
{path:'register',component:Register2Component},
{path:'users',component:UsersComponent}

    ]),FormsModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
