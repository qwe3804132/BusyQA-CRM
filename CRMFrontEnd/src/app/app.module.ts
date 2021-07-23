import { AuthGuard } from './_services/auth.guard';
import { authInterceptorProviders } from './_helpers/auth.interceptor';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ConfirmEqualValidatorDirective } from './pages/shared/confirm-equal-validator.directive';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './pages/register/register.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { ReactiveFormsModule } from '@angular/forms';
import { WelcomeComponent } from './pages/welcome/welcome.component';
import { AdminComponent } from './pages/admin/admin.component';
import { NavAdminComponent } from './pages/admin/nav-admin/nav-admin.component';
//import { AdminRoutingModule } from './pages/admin/routing-admin.module';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    HomeComponent,
    LoginComponent,
    ConfirmEqualValidatorDirective,
    WelcomeComponent,
    AdminComponent,
    NavAdminComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [authInterceptorProviders, AuthGuard],
  bootstrap: [AppComponent],
})
export class AppModule {}
