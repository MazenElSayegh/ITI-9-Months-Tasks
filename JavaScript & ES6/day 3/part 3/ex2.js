//10 Array predefined methods

//1-concat() :- concatenates arrays into one
var arr1 = ["Mazen", "Mohamed"];
var arr2 = ["Kamal", "Ahmed"];
var children = arr1.concat(arr2);

//2-slice() :- slice a part of array into new one
var names = ["Mazen", "Mohamed", "Kamal", "Ahmed"];
const names1 = names.slice(1,3);
alert(`${names1[0]}, ${names1[1]}`);

//3-splice() :- adds or removes part from array
var names2 = ["Mazen", "Mohamed", "Kamal", "Ahmed"];
names2.splice(1,2); //removes (position,how many to remove, to be added if any)
alert(`${names2[0]}, ${names2[1]}`);

//4-reverse() :- reverse order in array
names.reverse();
alert(names[0]);

//5-some() :- checks if some of the array applies a condition return boolean
const ages = [33, 15,17, 25];
alert(ages.some(checkAdult));
function checkAdult(age) {
  return age > 18;
}

//6-sort() :- sorts the array
alert(ages.sort());

//7-pop() :- returns and removes the last element of array
alert(ages.pop());

//8-push() :-adds an element to the end of the array and returns new length
alert(ages.push(6));

//9-join() :- join all elements of array into a string with commas between them
alert(ages.join());

//10-lastIndexOf() :- Search the array for an element, starting at the end, and returns its position
alert(ages.lastIndexOf(6));



