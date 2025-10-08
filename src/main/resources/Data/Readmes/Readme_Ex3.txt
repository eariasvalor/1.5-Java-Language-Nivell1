===========================================================
README — Nivell 1, Exercici 3
===========================================================

ENUNCIAT DE L'EXERCICI
-----------
Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat
per la pantalla, guarda el resultat en un fitxer TXT.

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

javac -d out src/main/java/n1exercici3/N1Exercici3.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp out n1exercici3.N1Exercici3 src/main/resources/data
