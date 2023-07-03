import { Component } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  public user={
    username: '',
    email: '',
    password: '',
  };

  //submit function
  

  formSubmit(){
    console.log(this.user);
    if(this.user.username == '' || this.user.email == null || this.user.password ==''){
      alert('enter the valid data');
      return;
    }
    alert('Register successfully');
  }
}
