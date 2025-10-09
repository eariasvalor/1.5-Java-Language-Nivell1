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
  │   │   │   └─ n1exercici4/
  │   │   │       └─ N1Exercici4.java
  │   │   └─ resources/
  │   │       └─ data/          ← directori amb fitxers o subcarpetes de prova


COMANDES PER COMPILAR I EXECUTAR
--------------------------------
Totes les comandes s’han d’executar des de la carpeta arrel del projecte.

------------------------------------------------------------
1. COMPILAR
------------------------------------------------------------

javac -d out src/main/java/n1exercici5/*.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp src/main/java n1exercici5.N1Exercici5 src/main/resources/Data/Readmes/result.txt
