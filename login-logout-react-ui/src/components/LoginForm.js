import React from 'react';
import ReactDOM from 'react-dom';
class LoginForm extends React.Component
{
    constructor(props)
    {
        super();
        this.loginUser = this.loginUser.bind(this);
    }

    loginUser()
    {
        alert("Login successful")
    }
    render(){
        return(
        <div>
            <div>
            Login Form<br/>
            <form>
            Username : <input type ="text" name ="txtUsername"/><br/>
            Password : <input type ="password" name  = "txtPassword"/><br/>
            <button onClick = {this.loginUser}>Login</button>
            </form>
            </div>
        </div>
    )
        }
}

export default LoginForm;