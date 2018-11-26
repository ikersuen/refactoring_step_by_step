# refactoring_step_by_step
# (1) public -> private
# Step1: write assertTrue and assertFalse test case for "should_check_driver"
# Step2: run test case
# Step3: [Driver]create getter for "age"
# Step4: [Driver]find usage of "age"
# Step5: [Police]change driver.age => driver.get
# Step6: [Driver]int age (public -> private)
# Step7: Run test case

#(2) change [Police] checkDriver function name
# Step1: write a same test case as should_check_driver, change the test case name to "should_check_driver_be_of_age"
# Step2: [Police]check "checkDriver" fucntion find usage
# Step3: [Police]write a function having same function content as checkDriver, change name to checkDriverBeOfAge
# Step4: [Test]change function name from "checkDriver" to "checkDriverBeOfAge" under test case "should_check_driver_be_of_age"
# Step5: Run test case
# Step6: Remove checkDriver function in Police and Test case "should_check_driver"

#(3) driver.getAge() >= 18
# Step1: create a new function isAnAdult
# Step2: replace "driver.getAge() >= 18" into isAnAdult
# Step3: run test case

#(4) duplicate code
# Step1: change "if(isAnAdult(driver)) return true; else return false;" into "return isAnAdult(driver)"
# Step2: run test case