package com.algorithm.question4.javarouka;

import com.algorithm.question3.javarouka.Node;

/**
 *
 * createdAt 2016. 5. 15.
 * @since 1.0
 * @author javarouka
 */
public interface Mergeable<T> {

	T merge(T other);
}
