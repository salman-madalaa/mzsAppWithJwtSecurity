import { Component, OnInit } from '@angular/core';
import { RoleService } from 'src/app/services/roleService/role.service';
import { UserService } from 'src/app/services/userService/user.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  type ='user';
  users:any;
  constructor(private _userSer:UserService,private _roleService:RoleService) { }

  ngOnInit(): void {
    this.getAllUers();
  }

  getAllUers(){
    this._userSer.getallUsers().subscribe((data)=>{
      console.log(data);
      this.users=data;
    })
  }

}
