var num1=Number(prompt("Enter the first number"));
var oper=prompt("Enter the operator");
var num2=Number(prompt("Enter the second number"));
switch (oper) 
{
    case '+':
        alert(`Solution = ${num1+num2}`);
        break;
    case '-':
        alert(`Solution = ${num1-num2}`);
        break;
    case '*':
        alert(`Solution = ${num1*num2}`);
        break;
    case '/':
        alert(`Solution = ${num1/num2}`);
        break;
    case '%':
        alert(`Solution = ${num1%num2}`);
        break;
    case '^':
        alert(`Solution = ${Math.pow(num1,num2)}`);
        break;
}