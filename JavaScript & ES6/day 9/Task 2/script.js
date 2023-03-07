function Time() {

    var date = new Date();
    // hour
    var hour = date.getHours();
    // minute
    var minute = date.getMinutes();
    // second
    var second = date.getSeconds();
    //  AM / PM
    var period =document.getElementById("apm");
    // days
    var day=date.getDay();
    var week=document.querySelectorAll(".day");

    week[day].style.opacity=1;

    if (hour >= 12) {
    period.innerText = "PM";
    } else {
    period.innerText = "AM";
    }
    // 12-hour format
    if (hour == 0) {
    hour = 12;
    } else {
    if (hour > 12) {
    hour = hour - 12;
    }
    }
    // Updating hour, minute, and second
    // if they are less than 10
    hour = update(hour);
    minute = update(minute);
    second = update(second);
    
    document.getElementById("time").innerText = hour + " : " + minute + " : " + second ;
    
    setTimeout(Time, 1000);
    }

    function update(t) {
    if (t < 10) {
    return "0" + t;
    }
    else {
    return t;
    }   
}

Time();


var alarm = document.getElementById("alarmBtn"),
    popUp = document.getElementById("popUp"),
    clear = document.getElementById("clear"),
    set = document.getElementById("set"),
    hrs = document.getElementById("hrs"),
    min = document.getElementById("min"),
    sec = document.getElementById("sec"),
    closeW=document.getElementById("close");

let sound="pics/notif.mp3";

function Popup() {
    popUp.style.display = "flex";
  }

function clearAlarm() {
    sec.value = "";
    hrs.value = "";
    min.value = "";
  }
function closePop(){
    popUp.style.display = "none";
}
  
function setAlarm() {
    amount = Number(
      (Number(sec.value) + Number(min.value) * 60 + Number(hrs.value * 60 * 60))
    );
    setTimeout(startAlarm, amount);
    closePop();
  }
function startAlarm() {
    new Audio(sound).play();
    alert(
        `It's time!\nIt has been ${amount} seconds`);
  }
  
  
alarm.addEventListener("click", Popup);
clear.addEventListener("click", clearAlarm);
set.addEventListener("click",setAlarm);
closeW.addEventListener("click",closePop);
    