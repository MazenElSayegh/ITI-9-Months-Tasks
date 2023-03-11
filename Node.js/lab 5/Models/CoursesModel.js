const mongoose = require("mongoose");
var DB_URL = "mongodb://127.0.0.1:27017/students";

mongoose.connect(DB_URL,{useNewURLParser:true});

let CoursesSchema = new mongoose.Schema({
    name:{type:String, required:true},
    duration:{type:Number, required:true}
})

module.exports = mongoose.model("crs",CoursesSchema);