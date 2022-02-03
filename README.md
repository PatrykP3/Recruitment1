# Recruitment1
It's a solution to recruitment task, initial state is what I did at first. Now I want to refactor it a bit to see what can I do to make this code better.

## Task
1. Create a simple entity class with fields:
    * id (number)
    * name (string)
    * creationDate (string/LocalDate)
2. Create a simple application that will read csv file and create entity instances from given file.
3. Print entities on the screen ensuring following rules:
    * make sure that name field is prefixed with “The Greatest ”
    * print only those who have a creation date in march
    * records with creation date after 2020-01-01 should have a year masked hash charecters (like ####-03-01).
## Tags
### v1.0
#### Description
Initial state. Originally code was added into empty Spring project i had prepared for something different. Then, for refactoring, I created new project for this task. Code stays intact as it was after recruitment.
#### Differences
* pom.xml - Spring removed
* README.md added
* boot class has different name and no annotations, main() method is identical.