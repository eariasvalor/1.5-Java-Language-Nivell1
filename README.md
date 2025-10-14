# README — Nivell 1 - Exercicis 1-5


ENUNCIAT DELS EXERCICIS
-----------
- Exercici 1
Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

- Exercici 2
Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

- Exercici 3
Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

- Exercici 4
Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

- Exercici 5
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
  │   │   │   ├─ n1exercici1/  
  │   │   │   ├─ n1exercici2/  
  │   │   │   ├─ n1exercici3/  
  │   │   │   ├─ n1exercici4/  
  │   │   │   ├─ n1exercici5/  
  │   │   ├─ resources/  
  │   │   │   ├─ Data.Readmes/  
  │   │   │   │   ├─ Readme_Ex1.txt  
  │   │   │   │   ├─ Readme_Ex2.txt  
  │   │   │   │   ├─ Readme_Ex3.txt  
  │   │   │   │   ├─ Readme_Ex4.txt  
  │   │   │   │   ├─ Readme_Ex5.txt  
  │   │   │   ├─ data/  
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

javac -d out src/main/java/common_classes/*.java src/main/java/n1exercici[X]/*.java


------------------------------------------------------------
2. EXECUTAR
------------------------------------------------------------

java -cp out n1exercici[X].N1Exercici[X] src/main/java/[resta de la ruta]
