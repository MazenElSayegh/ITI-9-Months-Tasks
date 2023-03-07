document.body.style.cssText = `display: flex;
                                flex-direction: column;
                                height: 95vh;
                                justify-content: center;
                                background-color: lightgreen;
                                align-items: center;`;
var div =document.getElementById("dv");
dv.style.cssText= `width: 28%;
                    height: 50%;
                    display: flex;
                    flex-direction: column;
                    justify-content: center;
                    background-color: white;
                    align-items: center;`
var frm =document.getElementById("frm");
frm.style.cssText= `width:80%;
                    height: 80%;
                    display: flex;
                    justify-content: center;
                    flex-direction: column;
                    align-items: center;`
var btn=document.getElementById("btn");
btn.style.cssText= `width: 82%;
                    background-color: green;
                    height: 20%;
                    border: none;
                    color: white;`
var pass=document.getElementById("pass");
pass.style.cssText= `width: 80%;
                    height: 20%;
                    background-color: lightgrey;
                    border: none;`
var us=document.getElementById("us");
us.style.cssText= `width: 80%;
                    height: 20%;
                    background-color: lightgrey;
                    border: none;`
var acc =document.getElementById("acc");
acc.style.color= "lightgreen";
var ok=document.getElementById("ok");
ok.style.cssText= `width: 20%;
                    height: 10%;
                    font-size: 20px;
                    position: absolute;
                    top: 10px;
                    display: flex;
                    justify-content: center;
                    align-items: center;`
function check(e){
    e.preventDefault();
    if (us.value=="admin"&&pass.value=="123"){
        // alert("Welcome");
        ok.style.backgroundColor= "green";
        ok.innerHTML= "Welcome";
    }
    else{
        ok.style.backgroundColor= "red";
        ok.innerHTML= "Not registered";
        // alert("Not registered");
    }
}
document.getElementById("btn").onclick = check;
// frm.onsubmit= check;

