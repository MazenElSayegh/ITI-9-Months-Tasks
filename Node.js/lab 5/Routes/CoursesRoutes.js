const express =require("express");
let router = express.Router();
const CrsCont = require("../Controllers/CoursesController.js")
const cvalidate =require("../utils/CoursesValidation.js");


// Get all courses
router.get("/", CrsCont.GetAllCourses);

//Get Course by id
router.get("/:id", CrsCont.GetCourseByID);

// add new course
router.post("/new",CrsCont.AddNewCourse );

// delete Course by id
router.delete("/:id", CrsCont.DeleteCourse);

//update Course by id
router.put("/:id", CrsCont.UpdateCourse);

module.exports = router;