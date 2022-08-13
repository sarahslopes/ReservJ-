import { ApartamentInterface } from './../model/apartament-interface';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  first, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ApartamentService {

  private readonly API = '/api/list';
  private readonly API2 = '/api/create';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<ApartamentInterface[]>(this.API)
      .pipe(
        first(),
        tap(apartaments => console.log(apartaments))
      );
  }

  save(record: Partial<ApartamentInterface>) {
    return this.httpClient.post<ApartamentInterface>(this.API2, record).pipe(first());
  }


}

