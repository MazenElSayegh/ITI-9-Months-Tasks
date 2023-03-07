const express = require("express");
const path = require("path");
const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
function getPath(myPath) {
  return path.join(__dirname, myPath);
}
let PORT = process.env.PORT || "7003";

// function m1(req, res, next) {
//   res.sendFile(getPath("../ClientSide/style.css"));
// }
// function m2(req, res, next) {
//   res.sendFile(getPath("../ClientSide/script.js"));
// }
app.get("/style.css", (req, res) => {
  res.sendFile(getPath("../ClientSide/style.css"));
});
app.get("/script.js", (req, res) => {
  res.sendFile(getPath("../ClientSide/script.js"));
});
app.get("/back.jpg", (req, res) => {
  res.sendFile(getPath("../ClientSide/back.jpg"));
});
app.get("/main.html", (req, res) => {
  res.sendFile(getPath("../ClientSide/main.html"));
});
// app.get("*",m1,m2, (req, res) => {
//   res.sendFile(getPath("../ClientSide/main.html"));
// });

// app.router("/main.html")
//     .get((req,res) => {})
//     .post((req,res) => {})

const fs = require("fs");
// const { json } = require("express");
let ProfileFileHTML = fs.readFileSync("../ClientSide/profile.html").toString();
let usersJSON = "./users.json";
app.post(
  "/profile.html",
  (req, res, next) => {
    console.log(req.body);
    fullname = req.body.name;
    email = req.body.email;
    mobile = req.body.number;
    address = req.body.address;
    ProfileFileHTML = ProfileFileHTML.replace(
      "{Hello}",
      `<p>name: &nbsp;${req.body.name}<br><br>
                     mobile: &nbsp;${req.body.mobile}<br><br>
                     email: &nbsp;${req.body.email}<br><br>
                    address: &nbsp;${req.body.address}</p>`
    );
    // res.send(ProfileFileHTML);

    let user = {
      fullname,
      email,
      mobile,
      address,
    };
    let readJSON = fs.readFileSync(usersJSON, "utf-8");

    let jsonArray = [];

    if (readJSON === "") {
      jsonArray.push(user);
      fs.appendFileSync(usersJSON, JSON.stringify(jsonArray));
    } else {
      let jsonArray = fs.readFileSync(usersJSON, "utf-8");
      jsonArray = JSON.parse(jsonArray);

      jsonArray.push(user);
      fs.writeFileSync(usersJSON, JSON.stringify(jsonArray));
    }

    next();
  },
  (req, res) => {
    res.send(ProfileFileHTML);
  }
);

app.listen(PORT, () => {
  console.log("http://localhost:" + PORT);
});