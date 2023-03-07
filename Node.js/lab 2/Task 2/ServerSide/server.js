const http = require("http");
const fs = require("fs");

let MainFileHTML = fs.readFileSync("../ClientSide/main.html").toString();
let ProfileFileHTML = fs.readFileSync("../ClientSide/profile.html").toString();
let StyleCSS = fs.readFileSync("../ClientSide/style.css").toString();
let ScriptFile = fs.readFileSync("../ClientSide/script.js").toString();
let myImage = fs.readFileSync("../ClientSide/back.jpg");

var userName = "";

http
  .createServer((req, res) => {
    //#region GET
    if (req.method == "GET") {
      switch (req.url) {
        case "/main.html":
          res.setHeader("Access-Control-Allow-Origin", "*");
          res.write(MainFileHTML);
          break;
        case "/profile.html":
          res.setHeader("Access-Control-Allow-Origin", "*");
          res.write(ProfileFileHTML);
          break;
        case "/style.css":
          res.writeHead(200, "Ok", { "content-type": "text/css" });
          res.write(StyleCSS);
          break;
        case "/script.js":
          res.writeHead(300, "Hii", { "content-type": "text/javascript" });
          res.write(ScriptFile);
          break;
        case "/back.jpg":
          res.writeHead(200, "ok", { "content-type": "image/jpeg" });
          res.write(myImage);
          break;
        default:
          res.write("<h1>No Page Found</h1>");
          break;
      }
      res.end();
    } else if (req.method == "POST") {
      //url
      req.on("data", (data) => {
        userName = data.toString().split(/[=&]+/);
      });
      req.on("end", () => {
        ProfileFileHTML = ProfileFileHTML.replace(
          "{Hello}",
          `<p>${userName[0]}: &nbsp;${userName[1]}<br><br> 
                    ${userName[2]}: &nbsp;${userName[3]}<br><br>
                    ${userName[4]}: &nbsp;${userName[5]}<br><br> 
                    ${userName[6]}: &nbsp;${userName[7]}</p>`
        );
        ProfileFileHTML = ProfileFileHTML.replaceAll("+", " ");
        ProfileFileHTML = ProfileFileHTML.replaceAll("%40", "@");
        res.write(ProfileFileHTML);
        res.end();
      });
    }
  })
  .listen("7001", () => {
    console.log("http://localhost:7001");
  });
