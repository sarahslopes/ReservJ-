import { ApartamentCreateComponent } from './apartament-create/apartament-create.component';
import { ApartamentsComponent } from './apartaments/apartaments.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


const routes: Routes = [
  { path: '', component: ApartamentsComponent},
  { path: 'new', component: ApartamentCreateComponent},
 // { path: 'edit', component: ApartamentCreateComponent},
  //{ path: 'delete', component: ApartamentCreateComponent},



];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ApartamentsRoutingModule { }
