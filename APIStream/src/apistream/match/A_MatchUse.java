/**
 * Search for data by using search methods of the Stream classes including findFirst, findAny, anyMatch,
allMatch, noneMatch
 */
package apistream.match;

import java.util.stream.IntStream;

/**
 * 
 * @author
 *
 */

public class A_MatchUse {

	public static void main(String[] args) {
		// Average temperatures in Concordia, Antarctica in a week in October
		// 2015
		boolean anyMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
		System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);
		boolean allMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
		System.out.println("allMatch(temp -> temp > 0): " + allMatch);
		boolean noneMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
		System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);
	}
}
