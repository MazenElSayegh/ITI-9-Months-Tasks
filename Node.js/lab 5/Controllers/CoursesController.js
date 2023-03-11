const validate = require("../utils/CoursesValidation.js");
const CourseModel =require("../Models/CoursesModel.js");

var GetAllCourses = async (req,res)=>{
    var allCourses = await CourseModel.find({});  //when get from DB will be asyn & await
    await res.json(allCourses);
};

var GetCourseByID = async (req, res) => {
    var id = req.params.id;
    var foundCourse = await CourseModel.find((s) => {
      return s.id == id;
    });
    await res.json(foundCourse);
};

var AddNewCourse = async(req, res) => {
    var newCourse = req.body; 
    var valid = await cvalidate(newCourse);
    if (valid) {
      var newCourseModel =new CourseModel(newCourse.name,newCourse.age,newCourse.department);
      newCourseModel.AddNewCourse();
      res.status(201).json(newCourseModel);
    } else {
      res.status(400).send("Check data");
    }
};

var DeleteCourse = (req, res) => {
    var id = req.params.id;
    var index;
    CourseModel.find((s, i) => {
      if (s.id == id) {
        index = i;
      }
    });
    console.log(index);
    CourseModel.splice(index, 1);
    res.send("Deleted successfully");
};

var UpdateCourse = (req, res) => {
    var id = req.params.id;
    var updatedCourse = req.body;
    var index;
    var valid = validate(updatedCourse);
    if (valid) {
      CourseModel.find((s, i) => {
        if (s.id == id) {
          // s= updatedCourse; //(didn't work)
          index = i;
        }
      });
      CourseModel[index] = updatedCourse;
      CourseModel[index].id = id;
      res.json(CourseModelsModels[index] || "Not Found");
      // res.send("Updated");
    } else {
      res.status(400).send("check data");
    }
};

module.exports = {
    GetAllCourses,
    GetCourseByID,
    AddNewCourse,
    DeleteCourse,
    UpdateCourse
}