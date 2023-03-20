# *spring-crud-generator*
*Miniapplication **Java** offrant une console pour générer le **CRUD** d'une entité en **spring** !*

### *Prérequis :*
*Pour développer des applications avec Spring Boot sur votre machine, vous avez besoin des éléments suivants :*

1. [ ] *Java Development Kit (JDK) : Spring Boot est construit sur le langage de programmation Java, donc vous devez installer une version récente du JDK sur votre machine. Et cela n'est pas une obligation.Vous pouvez installer la dernière version précisement le 11 ;*

2. [ ] *Un environnement de développement intégré (IDE) : bien qu'il soit possible de développer des applications Spring Boot avec un simple éditeur de texte, il est recommandé d'utiliser un IDE pour améliorer la productivité. Les IDE les plus populaires pour développer des applications Spring Boot sont Eclipse, IntelliJ IDEA et Visual Studio Code ;*

3. [ ] *Apache Maven ou Gradle : Maven et Gradle sont des outils de gestion de projet qui vous permettent de configurer et de gérer les dépendances de votre application Spring Boot. Spring Boot est livré avec des fichiers de configuration pour les deux outils ;*

4. [ ] *Spring Boot CLI (optionnel) : Spring Boot CLI est un outil en ligne de commande qui permet de créer rapidement des applications Spring Boot. Bien qu'il ne soit pas nécessaire pour développer des applications Spring Boot, il peut être utile pour des tâches spécifiques comme la génération de projets, la création de controllers, etc. ;*

5. [ ] *Un SGBD comme MySQL/PostgreSQL/MongoDB selon vos choix pour la gestion de la base de données de votre projet.*

*Une fois que vous avez installé les éléments ci-dessus, vous êtes prêt à commencer à développer des applications Spring Boot sur votre machine.*

### *Manuel d'utilisation*

*1. Pour commencer, dirigeons-nous sur le site suivant: https://start.spring.io/ pour générer notre projet avant de générer le **crud** de nos entités.*
    *Vous devez savoir que vous n'êtes pas obligé d'aller sur ce site si vous avez déjà généré votre projet d'avance.*
    ![1](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/start.spring.io.png)
    
   - *au niveau de **Project**, nous avons choisi maven ;*
   - *ainsi, au niveau de **Spring Boot**, nous avons choisi la version **2.7.9** ;*
   - *au niveau de **Project Metadata**, remplissez les champs selon vos choix en respectant la manière nous l'avions fait sur la capture tout en laissant le packaging en **jar** ;*
   - *pour les dépendances, ajouter les comme il est fait sur la capture.*

*2. Ensuite, une fois que tout est bon, cliquez sur **GENERATE** pour générer votre projet spring*
    ![2](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/generate.spring.png)
    
*3. Pour vous assurer que votre projet a été bien généré, allez dans votre **explorateur de fichier** et cliquez sur **Téléchargements** si votre machine est en français, dans le cas contraire, cliquez sur **Downloads***
    ![3](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/telechargement.png)
    *Vu que le nom de notre projet est : **mon_projet** d'après la capture, c'est pour cela le dossier zippé ou le projet généré depuis le site se nomme : **mon_projet***

*4. Maintenant dézippons notre projet généré et mettons-le à un endroit dans votre explorateur où vous pouvez le retrouver plutard.*
    *Dans mon cas ici je vais le mettre sur mon disque C:*
    ![4](https://github.com/MaFlore/spring-crud-generator/blob/main/images_docs/mon_projet.disque.c.png)

*5. Téléchargez ensuite **le fichier jar de notre projet en suivant ce lien : [text](https://github.com/MaFlore/spring-crud-generator/blob/main/spring-crud-generator.jar)**. Ce fichier téléchargé vous permettra de générer le CRUD d'une entité en **Spring** à partir du **CMD (ligne de commande/Console)**.*
