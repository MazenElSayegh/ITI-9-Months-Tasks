//10 Object predefined methods

//1-assign() :- assign values in objects
const object1 = {  
    a: 1,  
    b: 2,  
    c: 3  
  };    
const object2 = Object.assign({c: 4, d: 5}, object1);   
console.log(object2.c, object2.d); 

//2-Object.freeze() :- prevents the modification of existing property, attributes, and values. return object
Object.freeze(object2); //now no modifications can be done to object 2

//3-Object.values() :- returns an array of values
alert(Object.values(object1));

//4-Object.entries() :- returns an array with arrays of the key, value pairs.
const obj = { 10: 'arry', 21: 'barry', 23: 'carry' };  
console.log(Object.entries(obj)[2]); 

//5-Object.create() :- create a new object with the specified prototype object and properties.
const person = 
{  
    printHello: function ()  
    {  
      console.log(`My name is ${this.name}. Am I human? ${this.isHuman}`);  
    }  
};  
const me = Object.create(person);  
me.name = "Mazen";   
me.isHuman = true;   
me.printIntroduction(); 

//6-Object.getOwnPropertyNames() :- returns an array of all properties (enumerable or not) found
const obj1 = {  
    a: 0,  
    b: 1,  
    c: 2,  
  };  
console.log(Object.getOwnPropertyNames(obj1));  

//7-Object.isFrozen() :- determines if an object was frozen
const obj2 = 
{
    property1: 42
};  
console.log(Object.isFrozen(obj2)); //false 
Object.freeze(obj2); 
console.log(Object.isFrozen(obj2)); //true

//8-Object.defineProperty() :- describe some behavioral attributes of the property
const object3 = {};  
Object.defineProperty(object3, 'property1', {  value: 22, } );  
object3.property1;   
console.log(object3.property1);  

//9-Object.preventExtensions() :- prevent any extensions of an object
const obj4 = {};  
Object.preventExtensions(obj4);  
obj4.o = 3;  
  
console.log(  
    obj.hasOwnProperty("o")  
);   // false

//10-Object.keys() :- returns an array of a given object's own property names
const keys1 = 
{
    a: 'mazen',
    b: 25,
    c: M
};
  console.log(Object.keys(keys1)); // "a", "b", "c"
  