import React from 'react';

const Display=(props)=>{
    return <>
        <h1> This is from Functional Component !</h1>
        <h3>User Data</h3>
        <ul>
            <li>{props.data.name}</li>
            <li>{props.data.age}</li>
            <li>{props.data.place}</li>
        </ul>
    </>
}
export default Display;