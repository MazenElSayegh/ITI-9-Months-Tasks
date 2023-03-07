var i;
var count=Number(prompt("How many numbers?"));
var numbers= new Array;
var sum=0;
for (i=0;i<count;i++)
{
    numbers[i]=Number(prompt(`Enter the number ${i+1}`));
    sum+=numbers[i];
}
alert(`Sum = ${sum} and Average = ${sum/count}`);