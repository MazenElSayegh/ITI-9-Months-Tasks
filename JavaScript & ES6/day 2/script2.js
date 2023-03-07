var str=prompt("Enter a string.");
var i;
var count=0;
var letters=str.split("");
for(i=0;i<str.length;i++)
{
    if(letters[i]=='a'||letters[i]=='e'||letters[i]=='o'||letters[i]=='u'||letters[i]=='i')
    {
        count++;
    }
}
alert(`There are ${count} vowels in the string.`);