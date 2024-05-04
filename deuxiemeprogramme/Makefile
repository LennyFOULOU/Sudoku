# Définition du compilateur Java
JAVAC = javac

# Options du compilateur Java
JFLAGS = -g

# Fichiers sources
SOURCES = MenuController.java MenuView.java ChargerSauvegardeController.java SudokuGrid.java SudokuController.java SudokuView.java SudokuSolverModel.java Timer.java VerifierController.java VerifierModel.java VerifierView.java Main.java

# Fichiers de classe
CLASSES = $(SOURCES:.java=.class)

# Cible par défaut
default: $(CLASSES)

# Compilation des fichiers source Java en fichiers de classe
%.class: %.java
	$(JAVAC) $(JFLAGS) $<

# Nettoyage des fichiers générés
clean:
	rm -f *.class
