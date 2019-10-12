var MathOperations;
(function (MathOperations) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log("area of rectangle=" + 2 * (length + breadth));
        }
        rectangle.area = area;
    })(rectangle = MathOperations.rectangle || (MathOperations.rectangle = {}));
})(MathOperations || (MathOperations = {}));
// MathOperations.rectangle.area(5,5);
