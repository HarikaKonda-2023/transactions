import { Component } from "react";
import './index.css';


class FormPage extends Component{
    state={
        debit:'',
        credit:'',
        balance:'',
        amount:'',
        desc:'',
        option:''
    }
    onChangeAmount=(event)=>{
        this.setState({amount:event.target.value})
    }
    onChangeDesc=(event)=>{
        this.setState({desc:event.target.value})
    }
    onChangeOption=(event)=>{
       this.setState({option:event.target.value})
    }
    successForm=()=>{
    const {history}=this.props
    history.replace("/")

    }
    onSubmit=(event)=>{
      event.preventDefault()
      
      this.successForm()
      
    }
    onCancel=()=>{
        this.setState({amount:'',
            desc:'',
            option:''
        })
    }
    render(){
        const {amount,desc,option}=this.state
        return(
            <div className="main-form-con">
            
              <h1>New Transaction</h1>
              <div>
              <form onSubmit={this.onSubmit}>
                <label htmlFor="selectitem"><p>Transaction Type</p></label>
                <select id="selectitem" onChange={this.onChangeOption} value={option}>
                    <option>Credit</option>
                    <option>Debit</option>
                </select>
            
              <div>
                <p>Amount</p>
                <input type="text" onChange={this.onChangeAmount} value={amount}/>
                
              </div>
              <div>
                <p>Description</p>
                <input type="text" onChange={this.onChangeDesc} value={desc}/>
              </div>
              <div>
                <button type="submit">Save</button>
                <button type="button" onClick={this.onCancel}>Cancel</button>
              </div>
              </form>
            </div>
            </div>
        )
    }
}

export default FormPage