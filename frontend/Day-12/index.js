// // var a;

// // //hoisting

// // a=10;
// // console.log("Var a is "+a);

// // var a="hello";    // redeclaration
// // console.log("var a is reassigned "+a);
// // // let,const

// // const b=45;
// // console.log("Const b is "+b);

// // // c;
// // let c;
// // c=30;
// // console.log("Let c is "+c);
// // // let c="hello";   not possible 

// // const d=1;
// // console.log(d);

// //scope


// // global scope
// var x=78;
// function hello(){
//     // var x=78; 
//     console.log(x);
// }
// hello();
// console.log(x);

// // block scope
// // {
// //     let h=8;
// //     console.log(h);
// // }
// // console.log(h);


// {
//     const n=98;
//     console.log(n);
// }
// console.log(n);

var a=20;
console.log(a, typeof(a))

var b="hello";
console.log(b, typeof(b));

var h=true;
console.log(h, typeof(h), Number(h));



var l=null;
console.log(l, typeof(l));

var e;
console.log(e, typeof(e));

var f=237238890283908029380928;
console.log(f, typeof(f));

var g=BigInt(237238890283908029380928);
console.log(g, typeof(g));

var s=Symbol("hello");
console.log(s,typeof(s));

var arr=[3,4,1,true,"st"];
console.log(arr,typeof(arr));
console.log(arr[4]);

var c={
    fname:'jagadeesh',
    lname:'reddy'
}
console.log(c,typeof(c));


var arr1=[
    {
        name:'leo',
        age:45
    },
    {
        name:'harold',
        age:60
    }
]

console.log(arr1,typeof(arr1),arr1[0].name);