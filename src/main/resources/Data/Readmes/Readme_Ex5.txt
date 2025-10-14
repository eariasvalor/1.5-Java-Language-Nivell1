===========================================================
README — Nivell 1, Exercici 5
===========================================================

ENUNCIAT DE L'EXERCICI
-----------
Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.

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
         │   │   │   ├─ n1exercici5/
         │   │   ├─ resources/
         │   │   │   ├─ Data.Readmes/
         │   │   │   │   ├─ Readme_Ex5.txt
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

javac -d out src/main/java/common_classes/*.java src/main/java/n1exercici5/*.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp src/main/java n1exercici5.N1Exercici5 src/main/java/result.txt
