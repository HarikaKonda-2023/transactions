import { Component} from "react";
import FormPage from '../FormPage'
import {Link} from 'react-router-dom';

class MainPage extends Component{
    

   state={
    form:false
   }
   onAdd=()=>{
    this.setState({form:true})
   }
   render(){
    const {form}=this.state
       return(
        <div>
        <div>
            <h1>Office Transactions</h1>
            
        </div>
        <div>
        <Link to="/add">

          <button  type="button">Add Transaction</button>
          {form?<FormPage/>:''}
        </Link>
        </div>
        </div>
       )

    }
}


export default MainPage