# DATA CONTROLER & ANONYMISER - BACKLOG 📈✅

## Description de la Solution
### Caractéristiques de la Solution

Création du socle d'un projet qui vérifie et anonymise des données. L'application lira et écrirera des fichiers au format CSV. 

À l'avenir l'appli devra lire et écrire d'autres formats de données. 

Le projet doit pouvoir être éxecuté de deux manière différentes, l'une pour vérifier les données et l'autre pour les anonymiser.


### Acteurs du Projet

* 🐬 - Émerite NEOU - Maître d'ouvrage - [emerite-neou](https://github.com/emerite-neou)
* 🇩🇿 - Nadir NADJEM - [NadirOmega](https://github.com/NadirOmega)
* 🇫🇷 - Yannis LE GUEN - [yLGN](https://github.com/yLGN) 
 
### Hébergement

*	🌍 On-premise

### Application utilisée

*	IDE
	*	Eclipse - [www.eclipse.org](https://www.eclipse.org/)

### Langage de programmation, Librairies & Frameworks

* Java
* JUnits
* JSON
* Log4j

### Base de données

*	rules_verification.json
*	rules_anonymisation.json

### Document de référence

[Énoncé](https://github.com/emerite-neou/2019-DAUPHINE-M1/blob/master/projet/sujet.md)

## Aspects métiers
### Nombre d’utilisateurs

Non étudié. Le projet pourrait, dans le cadre de fonctionalité bonus, être amené migrer sur une architecture client/Serveur. Il faudra donc étudier sa montée en charge.

### Service Level Agreement

* Vérifier des données à partir d'un fichier CSV et d'une base de règles.
* Anonymiser des données à partir d'un fichier CSV et d'une base de règles.

## Généralités fonctionnelles

### Lots & Fonctionnalités Principales Associées 

|Lot |Fonctionnalité |Contenu|
|:--------:|:-------------:|:-----|
| 1 |  FP1 | Vérifier des données  |
| 2 |    FP2  |Anonymyser des données|

### Cas d’utilisations

#### Cas d’utilisation « FP1 - Vérifier des données »
« En tant que Bob,
Je veux donner une liste de données, un fichier décrivant le fichier de données, un fichier contenant les règles de vérification et je veux vérifier automatiquement que les données correspondent au type attendu. Afin de pouvoir obtenir des données 100% vérifiées dans un fichier dont le nom est donné préalablement par BOB.»

#### Cas d’utilisation « FP2 - Anonymiser des données »
« En tant que Bob,
Je veux donner une liste de données, un fichier décrivant le fichier de données, un fichier contenant les règles d'anonymisation. Afin de pouvoir obtenir des données 100% vérifiées dans un fichier dont le nom est donné préalablement par BOB.»

## Fonctionnalités détaillées

### Features & fonctionnalités associées 
| Feature | Perimètre|Fonctionnalité |Test associé | Évolutions à faire|
|:--------:|:----|:------------|:-------------|:-------------------------|
| F110 |  FP1 | Lire un fichier .csv  | Vérifier que la lecture est effective et intégrale.|Lire d'autres formats de données. Lire des fichiers csv avec des séparateurs autres que la virgule, et sur plusieurs caracteres. Lire des fichiers au format flatfile.Lire des fichiers ou une ligne ne correspond pas forcément à une entrée (entrée sur plusieurs ligne ou une ligne contient plusieurs entrée).|
| F120 |  FP1 | Lire un fichier .json décrivant les colonnes le fichier.csv | Vérifier que la lecture est effective et intégrale. Vérifier qu'il est bien possible d'instancier les objets|---|
| F130 |  FP1 | Lire un fichier .json donnant la base de règles de vérification| Vérifier que la lecture est effective et intégrale. Vérifier qu'il est bien possible d'instancier les objets|Avoir des règles de vérification en plus dans la bases des règles.|
| F140 |  FP1 | Donner un nom au fichier.csv d'output|Inutile de tester cette feature à moins que l'on décide de normaliser les output. (Le risque est identifié)|---|
| F150 |  FP1 | Vérifier automatiquement que les données dans F110 sont bien au format demandé par F120 |Vérifier que le système est capable de comparer des datatype. |---|
| F160 |  FP1 | Vérifier que les données dans F110 respectent les règles données par F130 |Vérifier que le système est capable de lire une règle. |---|
| F170 |  FP1 | Écrire les données vérifiée à 100% dans un fichier dont le nom est donné par F140 |Vérifier que le système peut écrire des données de manières intégrale | Écrire d'autres formats de données. Écrire des fichiers csv avec des séparateurs autres que la virgule, et sur plusieurs caracteres. É	crire des fichiers au format flatfile. Écire des fichiers ou une ligne ne correspond pas forcément à une entrée (entrée sur plusieurs ligne ou une ligne contient plusieurs entrée).|
| F210 |  FP2 | Lire un fichier .csv  | Vérifier que la lecture est effective et intégrale.|Lire d'autres formats de données. Lire des fichiers csv avec des séparateurs autres que la virgule, et sur plusieurs caracteres. Lire des fichiers au format flatfile.Lire des fichiers ou une ligne ne correspond pas forcément à une entrée (entrée sur plusieurs ligne ou une ligne contient plusieurs entrée).|
| F220 |  FP2 | Lire un fichier .json décrivant les colonnes le fichier.csv | Vérifier que la lecture est effective et intégrale. Vérifier qu'il est bien possible d'instancier les objets|---|
| F230 |  FP2 | Lire un fichier .json donnant la base de règles d'anonymisation| Vérifier que la lecture est effective et intégrale. Vérifier qu'il est bien possible d'instancier les objets|Avoir des règles d'anonymisation en plus dans la bases des règles.|
| F240 |  FP2 | Donner un nom au fichier.csv d'output|Inutile de tester cette feature à moins que l'on décide de normaliser les output. (Le risque est identifié)|---|
| F250 |  FP1 | Écrire les données dont la colonnes est contenue exclusivement dans 3|Vérifier que le système est capable de comparer des datatype. |---|

## Roadmap projet
1. Création du backlog (Cahier des charges) --> 23/12/2019
2. Création du DAT (Document d'architecture technique) --> 31/12/2019
	* Études techniques des évolutions.
	* Choix des exceptions.
	* Choix des logs.
	* Diagramme de classe (Étude des design patterns inclue).
3. Kick-off --> 31/12/2019
4. Livraison lot 1 -->
5. Livraison lot 2 -->
4. Rendu -->
