import React,{useState} from 'react';



export default function One({name1,age1,place1}){
    const [name,setName]=useState(name1);
    const [age,setAge]=useState(age1);
    const [place,setPlace]=useState(place1);
    return <>
        <div>
            <h1>This is from functional Component.</h1>
            <ul style={{listStyleType:'none'}}>
                <li>{name}</li>
                <li>{age}</li>
                <li>{place}</li>
            </ul>
            <button onClick={()=>setName("Jagadeesh")}>
            Change Name
          </button>
          <button onClick={()=>setAge(34)}>
            Change Age
          </button>
          <button onClick={()=>setPlace("Vizag")}>
            Change Place
          </button>
        </div>
    </>
}