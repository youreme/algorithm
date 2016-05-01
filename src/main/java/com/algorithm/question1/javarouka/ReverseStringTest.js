const {
    reverseStringCenter,
    reverseStringFullLoop,
    reverseStringUseReduce
} = require('./ReverseString');

function assertTrue(desc, condition) {
    console.log(desc, condition ? "OK!" : "FAIL");
}

assertTrue("2로 나누는 방법", reverseStringCenter("hello,world") === "dlrow,olleh");
assertTrue("그냥 돌리는 방법", reverseStringFullLoop("안녕하세요") === "요세하녕안");
assertTrue("Array.prototype.reduce", reverseStringUseReduce("안녕하세요") === "요세하녕안");