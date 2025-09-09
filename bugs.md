Bug: IndividualProject/src/main/java/dev/coms4156/project/individualproject/controller/RouteController.java:[93,3] missing return statement
Fix: added in the catch statement: return new ResponseEntity<>("Expeption"+e, HttpStatus.I_AM_A_TEAPOT)

Bug: IndividualProject/src/main/java/dev/coms4156/project/individualproject/model/BOOK.java:[268,20] incompatible types: java.lang.Object cannot be converted to dev.coms4156.project.individualproject.model.BOOK
Fix: checked obj type before comparing ids

Bug: BOOK.java getLanguage() should return a String, but nothing was returned