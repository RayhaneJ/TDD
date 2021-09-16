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
- [x] Implémenter méthode pour ajouter élèments dans Dictionary class
- [x] Ajout test vérification de la traduction du Dictionary
- [x] Ajout deuxième test simulacre 
- [x] Ajout de l'attribut HashMap dans Dictionary
- [x] Implémentation du get et set traduction dans Dictionary
- [x] Amélioration des tests existant pour tester Dictionary
- [x] Ajouter le test FakeIt à traduction multiples
- [x] Implémentation des tests pour test après refactorisation 
- [x] Construire test vérification reverso traductions 
- [x] Modifier test pour Green Bar 
- [x] Implémentation pour résoudre reverso traduction 
- [x] Ajout DictionaryParser test 
- [x] Ajouter jacoco tâche

### __Quel duplication existe dans notre code ?__
On a une méthode getName qui ne retourne rien de cohérent, juste un champ de texte "Example". De plus le constructeur ne retourne rien. L'utilité prévu à notre constructeur est l'initilisation de variable afin d'éviter toute redondance dans des set de variable privé future qui sont encapsuler dans notre classe Dictionary.

### __Est-il possible de faire un test qui n'implique l'ajout d'une seule de ces deux méthodes ?__
Avec addTranslation la seule est unique utilé d'un test aurait été de vérifier si une traduction a bien été ajouté mais l'utilisation de la méthode getTraduction est indispensable dans ce cas. Cependant on peut très bien réalisé un test avec uniquement getTraduction dans le même cas que pour le champ "nom" de la première partie du TD. On rajoute dans le constructeur la possibilité d'assigner à notre objet une traduction par défault. Dans ce cas getTranslation peut être utilisé sans addTranslation.

### Traductions Multiples 
### __Que proposez-vous pour pouvoir gérer les traductions multiples ?__
On peut créer un attribut traductions de type HashMap avec comme valeur correspondante une liste de String.
Exemple : private Map<String, List<String>>> translations
Dans ce cas on pourra rajouter plusieurs traductions à un mot donné.
L'implémentation en vue de la résolution de ce problème ce fait dans notre méthode addTranslation comparé à notre solution rapide où l'implémentation c'est faite directement dans la méthode de test.

### Mock
### __Type du Mock ?__
Le type du Mock sera un FileStream comme c'est un fichier et que l'on lit un flux de données.

### Couverture
### __Taux de couverture ?__
On peut espèrer au moins 80% de taux de couverture étant donné qu'on n'écrit le test tout en écrivant le code.

### Conclusion
Le TDD permet de maitrise le code que l'on écrit. Autrement dit on écrit le code pour que celui sois valide donc pas de surprise en fin de session d'écriture de code ou lors du lancement d'un projet. Cependant on peut vite répondre au besoin de test et non des fonctionalité/besoin du client.

