const mongoose = require("mongoose");
var DB_URL = "mongodb://127.0.0.1:27017/students";

mongoose.connect(DB_URL,{useNewURLParser:true});

let StudentsSchema = new mongoose.Schema({
    name:{type:String, required:true},
    age:{type:Number, required:true},
    dept:{type:String, required:true}
})

module.exports = mongoose.model("std",StudentsSchema);
