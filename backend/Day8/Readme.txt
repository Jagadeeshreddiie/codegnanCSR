OOPS concept was started but missed upto polymorphism

->encapsulation

->interface

->polymorphism   

-- these three concets are covered in the past 7 days.

Abstract method : 
    a method declaration qualified with "abstract" keyword and ends with semi colon, without body.

    Ex :- Public abstract double calcArea();

    -> Forces the class to become abstract class.


12th FEB

Final keyword:    exact opposite (Abstract)

    variable: 
        constant
        none of the instance of the class can change it's value.
    method:
        cannot be overriden in sub classes.
    class:
        Cannot be inherited into another class.



{ class is the specification of object }

interface :

    Acts as mediator between two things.

    Fully abstract class which helps two classes to interact.

{ interface is the specification of class }

--> program written on interface.

Car is interface
Fortuner is class implemented Car

Fortuner s1=new Fortuner();

it is specific initialisation

Car s1=new Fortuner();

it is portable to another class

the interaface methods are only can executed using s1, not interface methods can be used using Fortuner class.
