import { ApartamentInterface } from './../model/apartament-interface';
import { NonNullableFormBuilder, UntypedFormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { Component, createPlatform, OnInit } from '@angular/core';
import { ApartamentService } from '../services/apartament.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-apartament-create',
  templateUrl: './apartament-create.component.html',
  styleUrls: ['./apartament-create.component.scss']
})

export class ApartamentCreateComponent implements OnInit {

  constructor(private formBuilder: NonNullableFormBuilder,
    private service: ApartamentService
   ) {

  }

  form = this.formBuilder.group({
    name: [''],
    customers: [''],
    room: [''],
    status: ['']

  });

  ngOnInit(): void {
  }

  onSubmit() {
    this.service.save(this.form.value).subscribe((result: ApartamentInterface) => console.log(result));
  }


  onCancel(){

  }
}



