import React from "react";
import Display from "./Display";

// class component Approach



class App extends React.Component{
    state={
        name:"john",
        age:76,
        place:"brazil"
    }

    render(){
        return <>
            {/* <h1>I am from Class Component</h1>
            <ul>
            <li>{this.state.name}</li>
            <li>{this.state.age}</li>
            <li>{this.state.place}</li>
            </ul> */}
            <Display data={this.state}/>
        </>
    }
}
export default App;