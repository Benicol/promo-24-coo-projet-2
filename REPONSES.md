> **Question (Ex1) :** Une méthode `default` dans une interface peut-elle accéder aux champs
> privés de la classe qui l'implémente ? Justifiez, en vous appuyant sur `isDefective()`
> dans `Qualifiable` et `getQualityScore()` dans `Duck`.

Non, une méthode `default` dans une interface ne peut pas accéder aux champs privés de la classe qui l'implémente,
ici on utilise simplement `getQualityScore()` pour accéder à la qualité d'un objet `Duck` dans la méthode `isDefective()`
de l'interface `Qualifiable`. La méthode `default` peut appeler des méthodes publiques de la classe qui l'implémente,
mais elle ne peut pas accéder directement aux champs privés de cette classe.

> **Question (Ex2) :** Dans ce projet, `Maintainable` est une interface et `Machine` est une
> classe abstraite. Quelle règle Java vous aurait empêché de faire l'inverse
> (rendre `Maintainable` abstraite et `Machine` une interface) ? Plus généralement,
> quand choisit-on une interface plutôt qu'une classe abstraite ?

En Java, une interface ne peut pas contenir de champs d'instance (sauf des constantes), 
tandis qu'une classe abstraite peut en contenir. 
Si nous avions rendu `Maintainable` une classe abstraite, 
nous aurions été limités à l'utilisation de champs d'instance, 
ce qui n'est pas approprié pour une interface qui est censée 
définir un contrat sans implémentation. et pour Machine, si nous l'avions rendu une interface, 
nous aurions été limités à la déclaration de méthodes sans implémentation, 
ce qui n'est pas approprié pour une classe qui est censée fournir une implémentation partielle ou complète
> **Question (Ex4) :** Expliquez pourquoi `canBeFulfilled(Stock<Duck> stock)` serait une
> signature plus restrictive que `canBeFulfilled(Stock<? extends Duck> stock)`.
> Donnez un exemple de code Java qui compilerait avec la seconde mais pas avec la première.

La signature `canBeFulfilled(Stock<Duck> stock)` est plus restrictive que `canBeFulfilled(Stock<? extends Duck> stock)` 
car elle exige que le paramètre soit exactement de type `Stock<Duck>`
, tandis que la seconde signature permet d'accepter n'importe quel 
type de `Stock` qui est un sous-type de `Duck`, y compris des types 
génériques comme `Stock<SpecialDuck>` où `SpecialDuck` est une 
classe qui étend `Duck`.

> **Question ouverte (dans `REPONSES.md`) :** `Factory` expose `getMachines()` qui retourne
> une `List<Machine>` non modifiable (via `Collections.unmodifiableList()`).
> Pourquoi ce choix ? Que se passerait-il si on retournait la liste interne directement ?
> Peut-on quand même modifier les machines elles-mêmes (via leurs méthodes) depuis l'extérieur ?

Le choix de retourner une liste non modifiable via `Collections.unmodifiableList()` est fait pour protéger l'intégrité de la liste interne de machines.
Si nous retournions la liste interne directement, 
les consommateurs de la classe `Factory` pourraient ajouter, 
supprimer ou modifier les machines dans cette liste, 
ce qui pourrait entraîner des comportements inattendus 
ou des erreurs dans le fonctionnement de la `Factory`. 
En utilisant une liste non modifiable, 
nous garantissons que les consommateurs ne peuvent pas altérer la structure de la liste elle-même.