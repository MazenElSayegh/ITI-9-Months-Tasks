//Part 2

function Shape(name="Shape" , side=0 , sidelength=0){
    this.name=name ;
    this.side=side ;
    this.sidelength=sidelength ;
}

Object.assign(Shape.prototype, {
    calcPerimeter()
    {
        let perimeter = this.side * this.sidelength;
        console.log(perimeter);
    } 
    }
);

function Square(sidelength){
    Shape.call(this,"Square" , 4 , sidelength=0);
}

Square.prototype = Shape.prototype;
console.log(Square.prototype.constructor===Shape);
Square.prototype.constructor = Square;

Object.assign(Square.prototype, {
    calcArea(){
        var area= this.sidelength * this.sidelength;
        console.log(area);
    } 
});

var square = new Square(3);
square.calcPerimeter();
square.calcArea();