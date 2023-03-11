//#region configuration
const express = require("express");
const app =express();
const PORT =process.env.PORT || 7005;
const path = require("path");
const bodyParser = require("body-parser");
const loggingMW= require("./Middlewares/logging.js");
const StudentsRoutes= require("./Routes/StudentsRoutes.js");
const CoursesRoutes= require("./Routes/CoursesRoutes.js");
//#endregion

//#region Middlewares
app.use(bodyParser.urlencoded({extended:true}));
app.use(bodyParser.json());
app.use(loggingMW);

app.use("/api/students",StudentsRoutes);

app.use("/api/courses",CoursesRoutes);

app.listen(PORT,()=>{console.log("http://localhost:"+PORT)});