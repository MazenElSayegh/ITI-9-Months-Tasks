//Part 1

class Shape {
    constructor(name, sides, sideLength) {
      this.name = name;
      this.sides = sides;
      this.sideLength = sideLength;
    }
  }
  
  Shape.prototype.calcPerimeter = function () {
    let perimeter = this.sides*this.sideLength;
    console.log(perimeter);
  };
  
  var square = new Shape("Square", 4, 5);
  var triangle = new Shape("Triangle", 3, 3);

  console.log(square);
  
  square.calcPerimeter();
  triangle.calcPerimeter();