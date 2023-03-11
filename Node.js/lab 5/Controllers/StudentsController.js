const validate = require("../utils/StudentsValidation.js");
const StudentModel =require("../Models/StudentsModel.js");
console.log(StudentModel);

var GetAllStudents = async (req,res)=>{
    var allStudents = await StudentModel.find({});  //when get from DB will be asyn & await
    await res.json(allStudents);
};

var GetStudentByID = async (req, res) => {
    var id = req.params.id;
    var foundStudent = await StudentModel.find((s) => {
      return s.id == id;
    });
    await res.json(foundStudent);
};

var AddNewStudent = async(req, res) => {
    var newStudent = req.body; 
    var valid = await validate(newStudent);
    if (valid) {
      var newStudentModel =new StudentModel(newStudent.name,newStudent.age,newStudent.department);
      newStudentModel.AddNewStudent();
      res.status(201).json(newStudentModel);
    } else {
      res.status(400).send("Check data");
    }
};

var DeleteStudent = (req, res) => {
    var id = req.params.id;
    var index;
    StudentModel.find((s, i) => {
      if (s.id == id) {
        index = i;
      }
    });
    console.log(index);
    StudentModel.splice(index, 1);
    res.send("Deleted successfully");
};

var UpdateStudent = (req, res) => {
    var id = req.params.id;
    var updatedStudent = req.body;
    var index;
    var valid = validate(updatedStudent);
    if (valid) {
      StudentModel.find((s, i) => {
        if (s.id == id) {
          // s= updatedStudent; //(didn't work)
          index = i;
        }
      });
      StudentModel[index] = updatedStudent;
      StudentModel[index].id = id;
      res.json(StudentModelsModels[index] || "Not Found");
      // res.send("Updated");
    } else {
      res.status(400).send("check data");
    }
};

module.exports = {
    GetAllStudents,
    GetStudentByID,
    AddNewStudent,
    DeleteStudent,
    UpdateStudent
}