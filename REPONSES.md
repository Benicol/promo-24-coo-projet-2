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

