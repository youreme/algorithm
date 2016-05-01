function isEmpty(str) {
    return !str || !str.length;
}

exports.default = function reverseStringCenter(str) {

    if(isEmpty(str)) return str;

    const len = str.length;
    const center = len/2;
    let start = 0;
    let back = len;

    const result = [];

    for(;start < center; start++, back--) {
        result[back - 1] = str[start];
        result[start] = str[back - 1];
    }

    return result.join('');
};

exports.reverseStringUseReduce = function(str) {

    if(isEmpty(str)) return str;

    return str.split('')
        .reduce((result, val, index, orig) => {
            result.push(orig[orig.length - index - 1]);
            return result;
        }, [])
        .join('');
};

exports.reverseStringFullLoop = function(str) {

    if(isEmpty(str)) return str;

    const stack = [];
    const fixSize = str.length;
    let len = str.length;

    while(len--) {
        stack[fixSize-len] = str[len];
    }

    return stack.join('')

};

exports.reverseStringCenter = exports.default;