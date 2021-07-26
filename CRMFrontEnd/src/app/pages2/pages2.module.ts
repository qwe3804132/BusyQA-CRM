import { ConfirmEqualValidatorDirective } from './shared/confirm-equal-validator.directive';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Pages2RoutingModule } from './pages2-routing.module';
import { Pages2Component } from './pages2.component';

@NgModule({
  declarations: [Pages2Component],
  imports: [CommonModule, Pages2RoutingModule],
})
export class Pages2Module {}
