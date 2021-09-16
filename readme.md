# TDD 
### __JUnit__ : Junit est un framework permmettant la création et l'éxecution de test unitaire pour le langage Java. 
### __Hamcrest__ : Hamcress est un framework permettant d'assister le développeur lors de l'écriture de test. Il permet de définir des correspondance de façon déclarative.
### __Mockito__ : Mockito est un framework permettant la création de test. Ils nous donne la possibilité d'espionner des objets, simuler et vérifier des comportements et simplie les tests unitaires

### __Liste de tâche__
- [x] Creer la classe de test 
- [x] Creer un test non fonctionnel 
- [x] Commencer l'écriture de la class dictionary 
- [x] Refactorisé 
- [x] Implémenter un test non fonctionnel pour méthode isEmpty 
- [ ] Implémenter méthode pour ajouter élèments dans Dictionary class
- [x] Ajout test vérification de la traduction du Dictionary

### __Quel duplication existe dans notre code ?__
On a une méthode getName qui ne retourne rien de cohérent, juste un champ de texte "Example". De plus le constructeur ne retourne rien. L'utilité prévu à notre constructeur est l'initilisation de variable afin d'éviter toute redondance dans des set de variable privé future qui sont encapsuler dans notre classe Dictionary. 

