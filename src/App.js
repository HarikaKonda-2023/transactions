import MainPage from './components/MainPage'
import FormPage  from './components/FormPage';
import './App.css';
import {BrowserRouter,Switch,Route} from 'react-router-dom';

function App() {
  return (
       <BrowserRouter>
      
        <Route exact path="/" component={MainPage}/>
        <Route exact path="/add" component={FormPage}/>
       
       </BrowserRouter>
      
  
  );
}

export default App;
