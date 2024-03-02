import React from "react";
import App2 from './App2';
class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "suresh",
      age: 21,
      place: "vijayawada",
    };
  }

  changeName=()=>{
    this.setState({name: "john" })
  }
  changeAge=()=>{
    this.setState({age:24 })
  }
  changePlace=()=>{
    this.setState({place: "Guntur" })  }
  render() {
    return (
      <>
        <center>
        <h1> This is from Class Component</h1>
          <p>{this.state.name}</p>
          <p>{this.state.age}</p>
          <p>{this.state.place}</p>

          <button onClick={this.changeName}>
            Change Name
          </button>
          <button onClick={this.changeAge}>
            Change Age
          </button>
          <button onClick={this.changePlace}>
            Change Place
          </button>
          <App2 name1={this.state.name} age1={this.state.age} place1={this.state.place} />
        </center>
      </>
    );
  }
}
export default App;
