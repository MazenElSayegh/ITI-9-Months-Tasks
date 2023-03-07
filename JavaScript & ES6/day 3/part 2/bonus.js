var shape=prompt("Enter the shape");
switch(shape)
{
    case 'circle':
        var r=prompt("Enter radius");
        alert(`Area = ${Math.PI*r*r}`);
        break;
    case 'rectangle':
        var w=prompt("Enter width");
        var l=prompt("Enter length");
        alert(`Area = ${w*l}`);
        break;
    case 'square':
        var a=prompt("Enter side length");
        alert(`Area = ${a*a}`);
        break;
    case 'triangle':
        var b=prompt("Enter base");
        var h=prompt("Enter height");
        alert(`Area = ${0.5*b*h}`);
        break;
    case 'ellipse':
        var a=prompt("Enter minor axis");
        var b=prompt("Enter major axis");
        alert(`Area = ${0.25*Math.PI*a*b}`);
        break;
    case 'trapezium':
        var a=prompt("Enter 1st side");
        var b=prompt("Enter 2nd side");
        var h=prompt("Enter height");
        alert(`Area = ${h*0.5*(a+b)}`);
        break;
    case 'parallelogram':
        var b=prompt("Enter base");
        var h=prompt("Enter vertical height");
        alert(`Area = ${b*h}`);
        break;
    default:
        alert("Unavailable shape");
}