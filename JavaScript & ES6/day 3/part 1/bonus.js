var solution=0;
var num1=Number(prompt("Enter the first number"));
var oper=prompt("Enter the operator");
var num2=Number(prompt("Enter the second number"));
while(oper!=null && num2!=null){

switch (oper) 
{
    case '+':
        solution=num1+num2;
        alert(`Solution = ${solution}`);
        break;
    case '-':
        solution=num1-num2;
        alert(`Solution = ${solution}`);
        break;
    case '*':
        solution=num1*num2;
        alert(`Solution = ${solution}`);
        break;
    case '/':
        solution=num1/num2;
        alert(`Solution = ${solution}`);
        break;
    case '%':
        solution=num1%num2;
        alert(`Solution = ${solution}`);
        break;
    case '^':
        solution=Math.pow(num1,num2);
        alert(`Solution = ${solution}`);
        break;
}
num1=solution;
oper=prompt("Enter the operator");
num2=Number(prompt("Enter the second number"));
}