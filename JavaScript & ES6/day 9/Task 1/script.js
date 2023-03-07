var centerPart=document.getElementById("center");
var rightPart=document.getElementById("right");
var leftPart=document.getElementById("left");
var nxt=document.getElementById("nxt");
var prv=document.getElementById("prv");
var flag=1;
function next(){
    var centerStyle= `order: 3;
    width: 40%;
    height: 60%;
    z-index: 1;
    opacity: 1;`
    var leftStyle= `order: 2;
    opacity: 0.7;
    width: 20%;
    height: 50%;
    z-index: 0;`
    var rightStyle= `order: 4;
    opacity: 0.7;
    width: 20%;
    height: 50%;
    z-index: 0;`
    switch (flag){
        case 1:
            rightPart.style.cssText=centerStyle;
            centerPart.style.cssText=leftStyle;
            leftPart.style.cssText=rightStyle;
            let numR=Number(rightPart.innerHTML);
            if(numR<6){
                leftPart.innerHTML=numR+1;
            }
            else{
                leftPart.innerHTML=1;
            }
            flag=2;
            break;
        case 2:
            rightPart.style.cssText=leftStyle;
            centerPart.style.cssText=rightStyle;
            leftPart.style.cssText=centerStyle;
            let numL=Number(leftPart.innerHTML);
            if(numL<6){
                centerPart.innerHTML=numL+1;
            }
            else{
                centerPart.innerHTML=1;
            }
            flag=3;
            break;
        case 3:
            rightPart.style.cssText=rightStyle;
            centerPart.style.cssText=centerStyle;
            leftPart.style.cssText=leftStyle;
            let numC=Number(centerPart.innerHTML);
            if(numC<6){
                rightPart.innerHTML=numC+1;
            }
            else{
                rightPart.innerHTML=1;
            }
            flag=1;
            break;
    }   
}
nxt.onclick= next;
function prev(){
    var centerStyle= `order: 3;
    width: 40%;
    height: 60%;
    z-index: 1;
    opacity: 1;`
    var leftStyle= `order: 2;
    opacity: 0.7;
    width: 20%;
    height: 50%;
    z-index: 0;`
    var rightStyle= `order: 4;
    opacity: 0.7;
    width: 20%;
    height: 50%;
    z-index: 0;`
    switch (flag){
        case 2:
            rightPart.style.cssText=centerStyle;
            centerPart.style.cssText=leftStyle;
            leftPart.style.cssText=rightStyle;
            let numR=Number(rightPart.innerHTML);
            if(numR>1){
                centerPart.innerHTML=numR-1;
            }
            else{
                centerPart.innerHTML=6;
            }
            flag=3;
            break;
        case 1:
            rightPart.style.cssText=leftStyle;
            centerPart.style.cssText=rightStyle;
            leftPart.style.cssText=centerStyle;
            let numL=Number(leftPart.innerHTML);
            if(numL>1){
                rightPart.innerHTML=numL-1;
            }
            else{
                rightPart.innerHTML=6;
            }
            flag=2;
            break;
        case 3:
            rightPart.style.cssText=rightStyle;
            centerPart.style.cssText=centerStyle;
            leftPart.style.cssText=leftStyle;
            let numC=Number(centerPart.innerHTML);
            if(numC>1){
                leftPart.innerHTML=numC-1;
            }
            else{
                leftPart.innerHTML=6;
            }
            flag=1;
            break;
    }
}
prv.onclick=prev;
setInterval(next, 3000);






