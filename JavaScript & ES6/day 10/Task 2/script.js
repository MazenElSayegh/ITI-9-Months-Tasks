function doTask() {
    document.getElementById("btn").onclick = addTask;
    function addTask(e)
{
    e.preventDefault();
    if(txt.value)
    {
        var newDiv = document.createElement("div");
        newDiv.classList.add("todo");
        var newContent = document.createTextNode(txt.value);
        var check = document.createTextNode(`\u2713`);
        var cross = document.createTextNode("X");
        newDiv.appendChild(newContent);
        var cont=document.getElementById("container");
        cont.appendChild(newDiv);
        var btns= document.createElement("div");
        btns.classList.add("btns");
        var done =document.createElement("button");
        done.classList.add("done");
        done.appendChild(check);
        btns.appendChild(done);
        var del =document.createElement("button");
        del.classList.add("del");
        del.appendChild(cross);
        btns.appendChild(del);
        newDiv.appendChild(btns);  
    }
    localStorage.setItem("todos", cont.innerHTML); 
    done.onclick=function doneBt(e){
        if((!e.target.parentNode.parentNode.firstChild.textContent.includes("(DONE)")))
        {
            let doneContent = document.createTextNode(`${e.target.parentNode.parentNode.firstChild.textContent} (DONE)`);
            // console.log(e.target.parentNode.parentNode.firstChild);
            // console.log(doneContent);
            newDiv.replaceChild(doneContent, newContent);
            // console.log(e.target.parentNode.parentNode);
            e.target.parentNode.parentNode.style.backgroundColor= "lightgreen";
            localStorage.setItem("todos", cont.innerHTML);
        }
    }
    del.onclick=function removeTask(e){
        newDiv.parentNode.removeChild(newDiv);
        localStorage.setItem("todos", cont.innerHTML); 
    }
    }        
}
doTask();
document.getElementById("container").innerHTML= localStorage.getItem("todos");