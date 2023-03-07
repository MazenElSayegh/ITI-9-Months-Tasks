var oper=prompt("Enter an operation (Add 'a' or Search 's')");
var person= new Array;
var i=0;
while(oper!=null)
{
    if(oper=='add'||oper=='a')
    {
        var name=prompt("Enter the name");
        var phone=prompt("Enter the phone number");
        person[i] ={Name:name, Phone:phone};
        i++;
    }
    else if(oper=='search'||oper=='s')
    {
        var find=Number(prompt("Enter the number of the person in the phonebook"));
        if(person[find-1]!=null)
        {
            alert(`The info of the person you searched for:\nName: ${person[find-1].Name}\nPhone: ${person[find-1].Phone}`);
        }
        else
        {
            alert("Unavailable")
        }
        
    }
    oper=prompt("Enter an operation");
}
