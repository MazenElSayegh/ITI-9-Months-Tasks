var myMod = require("./script");
let myClass = myMod.myClass;

let user1 = new myClass();
user1.addTicket(9, 122, 10, 12, "12/2", 37);
user1.addTicket(10, 120, 11, 13, "16/6", 30);
console.log(user1.displayTickets());
console.log(user1.getTicket(30));
user1.updateTicket(13, 150, 16, 15, "20/10", 37);
console.log(user1.getTicket(37));
