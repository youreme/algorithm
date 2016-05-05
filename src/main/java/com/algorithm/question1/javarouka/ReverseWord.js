function isEmpty(str) {
	return !str || !str.length;
}

exports.reverseWord = function(str) {

	if(isEmpty(str)) return str;

	return str.split(' ')
		.reduce((result, val, index, orig) => {
			result.push(orig[orig.length - index - 1]);
			return result;
		}, [])
		.join(' ');
};

exports.reverseWord = exports.default;