import { ConfirmEqualValidatorDirective } from './../shared/confirm-equal-validator.directive';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RegisterRoutingModule } from './register-routing.module';
import { RegisterComponent } from './register.component';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [RegisterComponent, ConfirmEqualValidatorDirective],
  imports: [
    CommonModule,
    RegisterRoutingModule,

    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
})
export class RegisterModule {}
