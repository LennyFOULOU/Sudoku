# Définition du compilateur Java
JAVAC = javac

# Options du compilateur Java
JFLAGS = -g

# Fichiers sources
SOURCES = ChargerSauvegardeController.java Main.java MenuController.java MenuView.java \
          SudokuController.java SudokuGrid.java SudokuSolverModel.java SudokuView.java \
          Timer.java VerifierController.java VerifierModel.java VerifierView.java

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
