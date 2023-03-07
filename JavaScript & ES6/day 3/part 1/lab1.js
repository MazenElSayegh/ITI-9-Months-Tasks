var name=prompt("Enter username.");
var pass=prompt("Enter password");
if(name=="admin"&&pass=="421$$")
{
    alert("Welcome login success.");
}
else if(name=="admin"&&pass!="421$$")
{
    alert("Wrong password");
}
else if(name!="admin"&&pass=="421$$")
{
    alert("Wrong username");
}
else
{
    alert("Wrong username and password");
}
