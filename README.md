# problems

A collection of solutions to competitive programming and coding interview problems (LeetCode, HackerRank, and other platforms).

## Project Structure

- `src/main/java/com/ilselva/problems/`
  Solutions organized by platform (e.g. `hackerrank`, `leetcode`) and problem category.

- `src/test/java/com/ilselva/problems/`
  Automated tests for the solutions, following the same structure as the solutions.

- `src/test/resources/`
  Contains input sets for some tests; other inputs are included directly in the test code.

## Running Tests

By default, tests under the `kattis` and `hackerrank` packages require input files to be present to run correctly. for that reason they are excluded from the default test suite.

To run the default test suite:

`mvn test`

To run all tests use the `all-tests` Maven profile:

`mvn test -Pall-tests`