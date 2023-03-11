const Ajv =require("ajv");
const ajv =new Ajv();


// const coursesSchema={
//     type: "object",
//     properties:{
//         name:{type:"string",pattern: "^[a-zA-Z]+$"},
//         duration:{type:"number",minimum:1},
//         department:{type:"string",enum:["OS","WBI","MD"],minLength:2, maxLength:3 }
//     },
//     required:["name","age"],
//     additionalProperties: false
//     // minProperties:2,
//     // maxProperties:2
// }
// module.exports = ajv.compile(coursesSchema);