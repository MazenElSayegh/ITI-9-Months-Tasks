var flag=0;
function tog(){
    var active=$(".active")
    if(flag<5){ 
        $(".active+div").addClass("active")
        active.removeClass("active") 
        console.log("if");
        flag++;
    }
    else{
        $("#task1+div").addClass("active")
        active.removeClass("active")
        console.log("else");
        flag=0;
    }
    return false;
};
var repeat = setInterval(tog,1000);

var wrapper = '<div class="wrapper"></div>';
$("#stop").on("click",function(){
    clearInterval(repeat);
    }
)

// & jquery animation 
// $("#start").on("click",function(){
//     $(".active").animate({}
//     ,1000,"linear",function(){
//         var active=$(".active")
//     if(flag<5){ 
//         $(".active+div").addClass("active")
//         active.removeClass("active") 
//         console.log("if");
//         flag++;
//     }
//     else{
//         $("#start+div").addClass("active")
//         active.removeClass("active")
//         console.log("else");
//         flag=0;
//     }
//     return false;
//     })
// })

