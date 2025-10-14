===========================================================
README — Nivell 1, Exercici 1
===========================================================

ENUNCIAT DE L'EXERCICI
-----------
Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

DESCRIPCIÓ
-----------
Aquest programa mostra per pantalla el contingut d’un directori
rebut per paràmetre en executar el programa.  
Els elements del directori es llisten en ordre alfabètic (A–Z).

El directori a llistar s’indica com a argument a la línia de comandes.


REQUISITS
----------
- Java 17 o superior instal·lat i configurat al PATH.
- El projecte segueix aquesta estructura:

   project/
    ├─ src/
    │   ├─ main/
    │   │   ├─ java/
    │   │   │   ├─ common_classes/
    │   │   │   ├─ n1exercici1/
    │   │   ├─ resources/
    │   │   │   ├─ Data.Readmes/
    │   │   │   │   ├─ Readme_Ex1.txt
    │   ├─ test/
    ├─ target/
    ├─ .gitignore
    ├─ pom.xml
    ├─ README.md


COMANDES PER COMPILAR I EXECUTAR
--------------------------------
Totes les comandes s’han d’executar des de la carpeta arrel del projecte.

------------------------------------------------------------
1. COMPILAR
------------------------------------------------------------

javac -d out src/main/java/n1exercici1/N1Exercici1.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp out n1exercici1.N1Exercici1 src/main/java
