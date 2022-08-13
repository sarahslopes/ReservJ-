import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '',pathMatch : 'full', redirectTo: 'apartaments' },
  {
    path: 'apartaments',
    loadChildren: () => import('./apartaments/apartaments.module').then(m => m.ApartamentsModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
