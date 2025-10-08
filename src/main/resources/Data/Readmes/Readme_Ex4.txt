===========================================================
README — Nivell 1, Exercici 4
===========================================================

ENUNCIAT DE L'EXERCICI
-----------
Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

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

javac -d out src/main/java/n1exercici4/N1Exercici4.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp out n1exercici4.N1Exercici4 src/main/resources/data/[nom de la carpeta] + [nom de l'arxiu que voleu llegir]
