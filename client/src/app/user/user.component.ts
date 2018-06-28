import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: any[]

  constructor(private dataService: DataService) { }

  ngOnInit() { this.getUsers(); }

  getUsers() {
    this.dataService.getRecords("user")
      .subscribe(
        users => this.users = users
      )
  }


}
