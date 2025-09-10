### Bug: IndividualProject/src/main/java/dev/coms4156/project/individualproject/controller/RouteController.java:[93,3] missing return statement
#### Fix: added in the catch statement: return new ResponseEntity<>("Expeption"+e, HttpStatus.I_AM_A_TEAPOT)

### Bug: IndividualProject/src/main/java/dev/coms4156/project/individualproject/model/BOOK.java:[268,20] incompatible types: java.lang.Object cannot be converted to dev.coms4156.project.individualproject.model.BOOK
#### Fix: checked obj type before comparing ids

### Bug: BOOK.java getLanguage() should return a String, but nothing was returned

### Bug: Book.java returns null, instead of a String, if no copies available
#### Fix: returns "Book not available now! Come back later!" instead

### Bug: Book.java addCopy() does nothing
#### Fix: added totalCopies++ and copiesAvailable++


### Bug: Book.java deleteCopy() returning opposite boolean
#### Fix: Swapped return statements

### Bug: Book.java returnCopy(String date) iterating returnDates when it's empty
#### Fix: changed it to when returnDates is not empty

### Bug: Book.java setShelvingLocation() sets field to "shelvingLocation" instead of shelvingLocation variable
#### Fix: removed string quotation

### Bug: Book.java checkoutCopy decreases amountOfTimesCheckedOut
#### Fix: increase amountOfTimesCheckedOut by 1

### Bug: RouteController Welcome messgage missing space
#### Fix: added space to make it grammatically correct

### Bug: RouteController addCopy() function defines currBookId but never used
#### Fix: commented out the line