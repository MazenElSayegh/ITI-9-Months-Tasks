//#region require
const express = require("express");
const path = require("path");
const app = express();
const server = require("http").createServer(app);
const io = require("socket.io")(server);
//#endregion 

//#region middleware
app.use(express.static(path.join(__dirname + "/public")));
//#endregion

//#region sockets
io.on("connection", function (socket) {
  socket.on("newuser", function (username) {
    socket.broadcast.emit("update", username + " Joined the conversation");
  });
  socket.on("exituser", function (username) {
    socket.broadcast.emit("update", username + " Left the conversation");
  });
  socket.on("chat", function (message) {
    socket.broadcast.emit("chat", message);
  });
});
//#endregion

server.listen(7004);
