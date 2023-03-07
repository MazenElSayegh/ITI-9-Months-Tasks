var clock=Number(prompt("Enter the time in 24 hour clock."));
if(clock>12)
{
    clock-=12;
    clock+=" PM";
}
else if(clock==12)
{
    clock+=" PM";
}
else
{
    clock+=" AM";
}
alert(`The time is ${clock}`);