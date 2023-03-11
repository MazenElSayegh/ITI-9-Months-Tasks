const express = require("express");
let router = express.Router();
const StCont = require("../Controllers/StudentsController.js")

// Get all students
router.get("/", StCont.GetAllStudents);

//Get student by id
router.get("/:id", StCont.GetStudentByID);

// add new student
router.post("/new",StCont.AddNewStudent );

// delete student by id
router.delete("/:id", StCont.DeleteStudent);

//update student by id
router.put("/:id", StCont.UpdateStudent);

module.exports = router;
