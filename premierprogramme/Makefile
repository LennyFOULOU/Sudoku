### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java
JVMFLAGS = 

### REGLES ESSENTIELLES ###

Main.class : Main.java MenuView.class MenuController.class VerifierModel.class SudokuView.class SudokuController.class Case.class CaseController.class CaseModel.class
	${JC} ${JCFLAGS} Main.java

MenuView.class : MenuView.java MenuController.class
	${JC} ${JCFLAGS} MenuView.java

MenuController.class : MenuController.java
	${JC} ${JCFLAGS} MenuController.java

VerifierModel.class : VerifierModel.java SudokuGrid.class
	${JC} ${JCFLAGS} VerifierModel.java

SudokuView.class : SudokuView.java VerifierModel.class SudokuGrid.class
	${JC} ${JCFLAGS} SudokuView.java

SudokuController.class : SudokuController.java
	${JC} ${JCFLAGS} SudokuController.java

Case.class : Case.java
	${JC} ${JCFLAGS} Case.java

CaseController.class : CaseController.java
	${JC} ${JCFLAGS} CaseController.java

CaseModel.class : CaseModel.java
	${JC} ${JCFLAGS} CaseModel.java

### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###
