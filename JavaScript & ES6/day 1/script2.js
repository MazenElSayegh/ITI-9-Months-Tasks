alert("It's a new calculator that calculates only summation");
while(isNaN(num1)||isNaN(num2))
{
    var num1=Number(prompt("Enter tha first number."));
    var num2=Number(prompt("Enter the second number."));
}
var sum=num1+num2;
alert(`The sum of ${num1}+${num2} is equal ${sum}`);
