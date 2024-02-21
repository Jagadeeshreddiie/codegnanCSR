// let arr=[12,3131,1,2,11,123];
        // for(let num in arr){
        //     console.log(arr[num]);
        //     // num is index
        //     // arr[num] is value in the index
        // }
        // var bad={
        //     name:'rome',
        //     place:'germany',
        //     job:'developer'
        // }

        // "for of" is not iterable. not suitable for object
        // "for of" is used only for arrays
        // for(let details of bad){
        //     console.log(details);
        // }

        // let ar=[1,2,2323,4,5,6]
        // for(let num of ar)
        // console.log(num)


        // functions


        // function hello(){
        //     console.log("function is called");
        // }
        // hello();

        // const add=(a,b)=>{
        //     console.log();
        // }
        // add(3,4);



        // events

        
        function clickTheButton(){
            document.write(prompt("Enter the number"));
        }
        function changingVal(event){
            console.log(event.target.value);
        }
        function dontLeave(){
            alert("Dont move");
        }
        function mouseenter(){
            confirm("Hey you are on me");
        }



        // Math functions

        console.log(Math.floor(34.88));
        console.log(Math.floor(-34.88));
        console.log(Math.ceil(-34.88));
        console.log(Math.ceil(34.88));
        // round will roundup based on the decimal value 
        // 0-4 low 5-9 high
        console.log(Math.round(34.49999999));
        console.log(Math.round(34.5));
        console.log(Math.round(34.882323));

        // sign

        console.log(Math.sign(-67.3));
        console.log(Math.sign(67.3));
        console.log(Math.sign(0));
        console.log(Math.abs(45.34324242423424242));
        console.log(Math.random());
        console.log(Math.max(4,9,1));
        console.log(Math.min(4,9,1));

        // trigonometry

        console.log(Math.PI);
        console.log(Math.log(45));
        console.log(Math.ceil(Math.tan(45)));

        // spread operator

        let ar=[2,4,7.3];
        let [a,b,c,d]=ar;
        let ar1=[56,...ar,5];
        console.log(ar);
        console.log(ar1);
        console.log(a+" "+b+" "+c+" "+d);