> **Question (Ex1) :** Une méthode `default` dans une interface peut-elle accéder aux champs
> privés de la classe qui l'implémente ? Justifiez, en vous appuyant sur `isDefective()`
> dans `Qualifiable` et `getQualityScore()` dans `Duck`.

Non, une méthode `default` dans une interface ne peut pas accéder aux champs privés de la classe qui l'implémente,
ici on utilise simplement `getQualityScore()` pour accéder à la qualité d'un objet `Duck` dans la méthode `isDefective()`
de l'interface `Qualifiable`. La méthode `default` peut appeler des méthodes publiques de la classe qui l'implémente,
mais elle ne peut pas accéder directement aux champs privés de cette classe.