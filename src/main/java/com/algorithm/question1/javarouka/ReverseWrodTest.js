const {
	reverseWord
} = require('./ReverseWord');

function assertTrue(desc, condition) {
	console.log(desc, condition ? "OK!" : "FAIL");
}

assertTrue("2로 나누는 방법", reverseWord("Algorithm are awesome!") === "awesome! are Algorithm");
assertTrue("그냥 돌리는 방법", reverseWord("Algorithm     are      awesome! OK") === "OK awesome!      are     Algorithm");