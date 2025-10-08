===========================================================
README — Nivell 1, Exercici 2
===========================================================

ENUNCIAT DE L'EXERCICI
-----------
Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar
un arbre de directoris amb el contingut de tots els seus nivells (recursivament)
de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell,
indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

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
  │   │   │   └─ n1exercici2/
  │   │   │       └─ N1Exercici2.java
  │   │   └─ resources/
  │   │       └─ data/          ← directori amb fitxers o subcarpetes de prova


COMANDES PER COMPILAR I EXECUTAR
--------------------------------
Totes les comandes s’han d’executar des de la carpeta arrel del projecte.

------------------------------------------------------------
1. COMPILAR
------------------------------------------------------------

javac -d out src/main/java/n1exercici2/N1Exercici2.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp out n1exercici2.N1Exercici2 src/main/resources/data
