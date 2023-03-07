var fs = require("fs");
// fs.readFile("file.txt", (err, data) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log(data);
//   }
// });
// fs.writeFile("file.txt", "Hii", (err) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log("Write Success");
//   }
// });
const http = require("http");
http
  .createServer((req, res) => {
    if (req.url != "/favicon.ico") {
      let o = req.url.split("/");
      console.log(o);
      console.log(req.method);
      console.log(res.statusCode);
      res.writeHead(200, { "content-type": "text/html" });
      switch (o[1]) {
        case "sub":
          let sub = o[2];
          for (let i = 3; i < o.length; i++) {
            sub -= Number(o[i]);
          }
          console.log(sub);
          res.write(`<h1>Answer is ${sub}</h1>`);
          fs.appendFile("file.txt", `${sub}`, () => {});
          break;
        case "mult":
          let mult = o[2];
          for (let i = 3; i < o.length; i++) {
            mult *= Number(o[i]);
          }
          console.log(mult);
          res.write(`<h1>Answer is ${mult}</h1>`);
          fs.appendFile("file.txt", `${mult}`, () => {});
          break;
        case "add":
          let add = Number(o[2]);
          for (let i = 3; i < o.length; i++) {
            add += Number(o[i]);
          }
          console.log(add);
          res.write(`<h1>Answer is ${add}</h1>`);
          fs.appendFile("file.txt", `${add}`, () => {});
          break;
        case "div":
          let div = o[2];
          for (let i = 3; i < o.length; i++) {
            div /= Number(o[i]);
          }
          console.log(div);
          res.write(`<h1>Answer is ${div}</h1>`);
          fs.appendFile("file.txt", `${div}`, () => {});
          break;
        default:
          res.write(`<h1>Undefined operator</h1>`);
      }
    }
    res.end("<h1>Mazen's Server<h1>");
  })
  .listen("7000", () => {
    console.log("Listening on Port 7000");
  });
