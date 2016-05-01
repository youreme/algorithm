const { reverseStringCenter, reverseStringFullLoop  } = require('./ReverseString');

function asset(desc, condition) {
    console.log(desc, condition ? "OK!" : "FAIL");
}

asset("2로 나누는 방법", reverseStringCenter("hello,world") === "dlrow,olleh");
asset("그냥 돌리는 방법", reverseStringFullLoop("안녕하세요") === "요세하녕안");