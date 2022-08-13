import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ApartamentsRoutingModule } from './apartaments-routing.module';
import { ApartamentsComponent } from './apartaments/apartaments.component';
import {MatTableModule} from '@angular/material/table';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { ApartamentCreateComponent } from './apartament-create/apartament-create.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSnackBarModule } from '@angular/material/snack-bar';



@NgModule({
  declarations: [
    ApartamentsComponent,
    ApartamentCreateComponent
  ],
  imports: [
    CommonModule,
    ApartamentsRoutingModule,
    MatTableModule,
    MatCardModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule,
    FormsModule,
    ReactiveFormsModule,
    MatSnackBarModule

  ]
})
export class ApartamentsModule { }
