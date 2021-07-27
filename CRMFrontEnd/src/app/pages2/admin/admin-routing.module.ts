import { TeamComponent } from './team/team.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin.component';

const routes: Routes = [
  {
    path: '',
    component: AdminComponent,
  },
  {
    path: 'team',
    loadChildren: () => import('./team/team.module').then((m) => m.TeamModule),
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
