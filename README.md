Starfleet - Système de Réservation et Gestion de Vaisseaux
Description
Starfleet est une application Java permettant de gérer des vaisseaux, des missions et des réservations dans un contexte inspiré de la saga Star Trek. Le système permet d'ajouter, modifier, supprimer et lister des vaisseaux, de gérer des missions interplanétaires et d'effectuer des réservations pour les missions.
Fonctionnalités

1. Gestion des Vaisseaux : Ajouter, modifier et supprimer des vaisseaux.
2. Gestion des Personnes : Ajouter et gérer les officiers et civils assignés aux missions.
3. Gestion des Missions : Créer des missions avec des destinations et des dates.
4. Gestion des Réservations : Réaliser des réservations pour les missions avec des personnes spécifiques.
5. Sauvegarde et Chargement des Données : Sauvegarder les données sur le disque et charger une sauvegarde existante.
6. Interface en ligne de commande : Utilisation simple avec un menu interactif en ligne de commande pour gérer les vaisseaux, missions, et réservations.
   Prérequis
   Avant de commencer, assurez-vous que vous avez les éléments suivants :

- Java 8 ou une version plus récente installée sur votre machine.
- Un environnement de développement ou un IDE (comme IntelliJ IDEA ou Eclipse) pour exécuter le code.
  Installation

1. Cloner le projet depuis le dépôt Git :
   git clone https://github.com/symphopho/starfleet-final-reservation.git
2. Accéder au répertoire du projet :
   cd starfleet
3. Compiler le projet (si vous n'utilisez pas un IDE, compilez avec Maven ou Ant) :
   Si vous utilisez Maven, vous pouvez compiler et exécuter le projet en utilisant la commande suivante :
   mvn compile
   Lancer l'Application
   Méthode 1 : Lancer via IDE
4. Ouvrez le projet dans votre IDE préféré (IntelliJ IDEA, Eclipse, etc.).
5. Lancez la classe `Main` pour démarrer le système.

Méthode 2 : Lancer via ligne de commande

1. Naviguez jusqu’au dossier contenant le fichier `Main.java`.
2. Compilez et exécutez l’application :
   javac -d bin src/fr/starfleet/Main.java
   java -cp bin fr.starfleet.Main
   Utilisation de l'Application
   Une fois l'application lancée, vous serez accueilli par un menu interactif dans le terminal. Le menu principal vous permet de choisir entre plusieurs options pour gérer les vaisseaux, les personnes, les missions et les réservations.

### Menu Principal

Le menu principal est divisé en plusieurs sections :

1. Gérer les Vaisseaux : Vous pouvez ajouter, lister ou modifier des vaisseaux.
2. Gérer les Personnes : Ajoutez des officiers et des civils qui participeront aux missions.
3. Gérer les Missions : Créez de nouvelles missions en définissant leur code, description, destination et capacité.
4. Gérer les Réservations : Réalisez des réservations pour les missions.
5. Sauvegarder les Données : Sauvegardez l’état actuel des vaisseaux, missions et réservations dans un fichier de sauvegarde.
6. Charger les Données : Chargez les données précédemment sauvegardées à partir de `sauvegarde.dat`.
7. Quitter : Quittez l'application.

### Exemple de commandes dans le menu :

1. Gérer les vaisseaux :

- Ajouter un vaisseau : Entrez le nom, l’immatriculation et la capacité maximale.
- Lister les vaisseaux : Affiche tous les vaisseaux ajoutés.

2. Gérer les missions :

- Créer une mission : Vous devrez saisir un code de mission, une description, une destination et une capacité.

3. Gérer les réservations :

- Effectuer une réservation : Choisissez une personne et une mission à réserver.

4. Sauvegarde et Chargement des Données :

- Sauvegarde : Vous pouvez sauvegarder l’état actuel des données dans un fichier.
- Chargement : Vous pouvez recharger les données sauvegardées à partir du fichier `sauvegarde.dat`.
  Architecture du Projet
  L’application est construite avec une architecture en couches :
- Modèle (Modèle de données) : Classes représentant les entités comme les vaisseaux, les personnes, les missions et les réservations.
- Logique Métier : Les classes qui gèrent la logique de création et de gestion des objets.
- Interface Utilisateur (UI) : Un menu en ligne de commande qui permet à l'utilisateur d'interagir avec l'application.
- Utilitaires : Des classes utilitaires pour la gestion des fichiers et des dates.
  Exemples d'Entrée et de Sortie

### Exemple 1 : Ajouter un Vaisseau

```bash
1. Gérer les vaisseaux
    1. Ajouter un vaisseau
    2. Retour
Choisir une option: 1
Nom du vaisseau: USS Enterprise
Immatriculation du vaisseau: NCC-1701
Capacité maximale: 500
```

Sortie :

```bash
Vaisseau ajouté avec succès !
```

### Exemple 2 : Créer une Mission

```bash
1. Gérer les missions
    1. Créer une mission
    2. Retour
Choisir une option: 1
Code de mission: VUL001
Description de la mission: Mission vers Vulcain
Destination: Vulcain
Capacité maximale: 100
```

Sortie :

```bash
Mission créée avec succès !
```

Sauvegarde et Chargement des Données

- Sauvegarde : Après avoir ajouté des vaisseaux, des personnes et des missions, vous pouvez sauvegarder ces données dans un fichier.
- Chargement : Vous pouvez recharger les données sauvegardées à partir du fichier `sauvegarde.dat`.
  Conclusion
  L'application Starfleet permet une gestion complète des vaisseaux, des missions et des réservations à travers une interface simple et intuitive en ligne de commande. Elle offre des fonctionnalités de sauvegarde et de chargement pour persister les données et faciliter la gestion de l'application.
  Contributeurs
  Développeur principal : ADA-BE Symphoria Daria
  Licence
  Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.
