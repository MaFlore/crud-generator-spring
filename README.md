# *spring-crud-generator V.1*
*Miniapplication **Java** offrant une console pour générer le **CRUD** d'une entité en **spring** !*
*Téléchargeable sur le lien : [https://github.com/MaFlore/download/spring-crud-generator.jar](https://github.com/MaFlore/spring-crud-generator/raw/main/spring-crud-generator.jar)*

### *Prérequis :*
*Pour développer des applications avec Spring Boot sur votre machine, vous avez besoin des éléments suivants :*

1. [ ] *Java Development Kit (JDK) : Spring Boot est construit sur le langage de programmation Java, donc vous devez installer une version récente du JDK sur votre machine. Et cela n'est pas une obligation. Vous pouvez installer une ancienne version précisement le 11 ;*

2. [ ] *Un environnement de développement intégré (IDE) : bien qu'il soit possible de développer des applications Spring Boot avec un simple éditeur de texte, il est recommandé d'utiliser un IDE pour améliorer la productivité. Les IDE les plus populaires pour développer des applications Spring Boot sont Eclipse, IntelliJ IDEA et Visual Studio Code ;*

3. [ ] *Apache Maven ou Gradle : Maven et Gradle sont des outils de gestion de projet qui vous permettent de configurer et de gérer les dépendances de votre application Spring Boot. Spring Boot est livré avec des fichiers de configuration pour les deux outils ;*

4. [ ] *Spring Boot CLI (optionnel) : Spring Boot CLI est un outil en ligne de commande qui permet de créer rapidement des applications Spring Boot. Bien qu'il ne soit pas nécessaire pour développer des applications Spring Boot, il peut être utile pour des tâches spécifiques comme la génération de projets, la création de controllers, etc. ;*

5. [ ] *Un SGBD comme MySQL/PostgreSQL/MongoDB selon vos choix pour la gestion de la base de données de votre projet.*

*Une fois que vous avez installé les éléments ci-dessus, vous êtes prêt à commencer à développer des applications Spring Boot sur votre machine.*

### *Manuel d'utilisation*

*1. Pour commencer, dirigeons-nous sur le site suivant: https://start.spring.io/ pour générer notre projet **Spring** avant de générer le **crud** de nos entités.*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/start.spring.io.png)
    
   - *au niveau de **Project**, nous avons choisi maven ;*
   - *ainsi, au niveau de **Spring Boot**, nous avons choisi la version **2.7.9** ;*
   - *au niveau de **Project Metadata**, remplissez les champs selon vos choix en respectant la manière nous l'avions fait sur la capture tout en laissant le packaging en **jar** ;*
   - *pour les dépendances, ajouter les comme il est fait sur la capture.*

   *NB: N'oubliez pas la valeur du **Package name**. Retenez-le en tête. Dans notre cas ici c'est : **com.example.app**. Nous aurons besoin de ça lorsqu'on essayera de générer le CRUD avec l'outil **spring-crud-generator***

*2. Ensuite, une fois que tout est bon, cliquez sur **GENERATE** pour générer votre projet spring*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/generate.spring.png)
    
*3. Pour vous assurer que votre projet a été bien généré, allez dans votre **explorateur de fichier** et cliquez sur **Téléchargements** si votre machine/PC est en français, dans le cas contraire, cliquez sur **Downloads***
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/telechargement.png)
    *Vu que le nom de notre projet est : **app** d'après la capture, c'est pour cela le dossier zippé ou le projet généré depuis le site se nomme : **app***

*4. Maintenant dézippons notre projet généré et mettons-le à un endroit dans votre explorateur où vous pouvez le retrouver plutard.*
    *Dans mon cas ici je vais le mettre sur mon disque C:*
    
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/app.disque.c.png)

*5. Téléchargez ensuite **l'outil de génération de CRUD en suivant ce lien : [https://github.com/MaFlore/download/spring-crud-generator.jar](https://github.com/MaFlore/spring-crud-generator/raw/main/spring-crud-generator.jar)**. Cet outil téléchargé vous permettra de générer le CRUD d'une entité en **Spring** à partir du **CMD (ligne de commande/Console)**.*

*6. L'outil téléchargé : **spring-crud-generator.jar** se retrouvera dans **téléchargements/downloads** sur votre machine/PC une fois le téléchargement terminé.*
    *On va ensuite le déplacer sur notre disque C: dans le dossier **users/utilisateur-courant** ou soit n'importe quel emplacement sur votre machine/PC où vous pouvez le retrouver une fois que vous en aurez besoin. Dans notre cas ici **l'utilisateur courant est Mathis**, donc l'emplacement sera **C:/users/Mathis**.*

    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/users.mathis.png)

*7. À présent, nous allons générer le **CRUD d'une entité au choix dans le projet généré** depuis le site officielle de spring nommé : **app**.*
    *Pour commencer lançons notre **CMD** et entrons la commande : **java -jar spring-crud-generator.jar**.*
    *Une fois cette commande validée, nous aurons dans notre CMD un message de salutation, ensuite on nous demande de copier le chemin vers le projet dans lequel on veut générer le CRUD. ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/img1.png)Ici, nous allons dans notre explorateur cherché l'emplacement où on a mis le projet généré depuis le site officiel de spring*
    *Dans notre cas ici, c'est sur notre disque C:*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/app.disque.c.png)
    *Ainsi, on copie le chemin vers l'emplacement de notre projet généré et on vient coller ça dans notre CMD.*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/img2.png)
    *Une fois, cette partie validée on nous demande d'entrer le **Package name**.*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/package.name.png)
    *Le **Package name** de notre projet dans ce tutoriel est : **com.example.app**.*
    *Ainsi, allons dans notre CMD pour valider notre **Package name**.*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/package.name.v.png)
    *Nous venons de valider le **Package name** et on nous demande d'entrer le **nom de l'entité** pour laquelle on veut générer le CRUD.*
    *L'entité choisie dans notre cas est : **Etudiant***
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/entity.png)
    *Lorsque nous validons cette partie, notre CRUD sera généré avec succès et on va nous demander si on veut générer le CRUD d'une autre entité ? Si on entre **Oui** on va nous demander le nom de l'entité dans le cas contraire le programme s'arrête.*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/entity.v.png)
    *Pour s'assurer que notre **CRUD** est bien généré ouvrons le projet dans un éditeur*
    ![alt](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/crud.v.png)

*    *Une fois que nous voyons le package **controller**, **service**, **serviceImpl**, **model** et **repository** alors notre CRUD est bien généré.*

### *Merci de nous avoir suivis!👊*
*Cet outil est notre version 1, nous essayerons d'apporter des mises à jour lors des éditions prochaines.*

