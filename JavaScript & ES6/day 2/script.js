var age=prompt("Enter your age.");
while(age!=null)
{
    while (age<0)
{
    var age=prompt("Enter your age.");
}
switch (true)
{
    case (age<11):
        alert("You're a child.");
        break;
    case (age>10&&age<19):
        alert("You're a teenager.");
        break;
    case (age>18&&age<50):
        alert("You're a grown up.");
        break;
    default:
        alert("You're old.");
        break;
}
var age=prompt("Enter your age.");
}



