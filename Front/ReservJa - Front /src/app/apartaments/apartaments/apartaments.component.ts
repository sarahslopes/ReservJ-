
import { ApartamentInterface } from './../model/apartament-interface';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { ActivatedRoute, Router } from '@angular/router';
import { ApartamentService } from '../services/apartament.service';


@Component({
  selector: 'app-apartaments',
  templateUrl: './apartaments.component.html',
  styleUrls: ['./apartaments.component.scss']
})

export class ApartamentsComponent implements OnInit {
  apartaments: Observable<ApartamentInterface[]>;
  displayedColumns = ['id', 'name', 'customers', 'room', 'status' , 'actions'];

  constructor(
    private apartamentsService: ApartamentService,
    private router: Router,
    private route: ActivatedRoute

    ) {
      this.apartaments = this.apartamentsService.list();
  }

  onAdd(){
    this.router.navigate(['new'], {relativeTo: this.route});

  }

  onEdit(){
    this.router.navigate(['edit'], {relativeTo: this.route});

  }

  onDelete(){
   this.router.navigate(['delete'], {relativeTo: this.route});

  }




  ngOnInit(): void {

  }

}
