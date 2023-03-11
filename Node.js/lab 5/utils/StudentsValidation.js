const Ajv =require("ajv");
const ajv =new Ajv();

const studentsSchema={
    type: "object",
    properties:{
        name:{type:"string",pattern: "^[a-zA-Z]+$"},
        age:{type:"number",minimum:16,maximum:60},
        department:{type:"string",enum:["OS","WBI","MD"],minLength:2, maxLength:3 }
    },
    required:["name","age","department"],
    additionalProperties: false
    // minProperties:2,
    // maxProperties:2

}
module.exports = ajv.compile(studentsSchema);