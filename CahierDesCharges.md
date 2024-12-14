# Cahier des charges

## 1. Le contexte du besoin

Ce projet vise à développer un système innovant destiné à assister les personnes malentendantes dans leur vie quotidienne. L’objectif principal est de leur permettre de suivre des conversations de groupe tout en étant alertées visuellement des sons importants de leur environnement. Ce système repose sur deux fonctionnalités clés :
- **Transcription en temps réel** des échanges verbaux.
- **Notifications visuelles** en cas de détection de bruits spécifiques (alarme, appel de leur nom).

Le développement du système s’appuiera sur un incrément réalisé en Java, visant à aboutir à un prototype fonctionnel. Ce prototype sera conçu pour un usage dans des contextes précis, tels qu’une salle de réunion ou un espace de travail collaboratif, afin de tester son efficacité dans des environnements contrôlés.

---

## 2. Objectifs du projet

- Permettre aux personnes malentendantes de lire les conversations grâce à une transcription en temps réel.
- Envoyer des alertes visuelles pour avertir des bruits importants, comme un appel ou une alarme.
- Faciliter la communication et l’inclusion sociale.

---

## 3. Public visé

Le projet cible principalement les **personnes malentendantes** participant à des discussions en groupe ou dans des environnements professionnels collaboratifs.

---

## 4. Avantages du projet

1. **Inclusion sociale**
   - Meilleure intégration en groupe.
   - Autonomie accrue grâce aux alertes visuelles.

2. **Sécurité renforcée**
   - Notifications pour les bruits critiques (alarme, détecteur de fumée).

3. **Amélioration professionnelle**
   - Participation active aux réunions.
   - Réduction des malentendus.

4. **Adaptabilité**
   - Application dans divers contextes : maison, lieux publics, etc.
   - Intégration future avec d'autres technologies (appareils auditifs, applications mobiles).

5. **Impact technologique et sociétal**
   - Innovation technologique.
   - Contribution à une société plus inclusive.

---

## 5. Freins (difficultés éventuelles)

Le principal frein serait un problème technique provenant de l’hébergeur du site, bien que cela soit peu probable.

---

## 6. Date prévue de l’événement

Date non précisée dans le document.

---

## 7. Fonctions

| Fonctions | Expressions | Critères |
|-----------|-------------|----------|
| **fp1** | Transcrire automatiquement et en temps réel toutes les conversations de groupe en texte, de manière lisible pour la personne malentendante | **Entrée** : Signal audio (microphone captant la conversation) <br> **Sortie** : Texte visible à l’écran |
| **fp2** | Identifier et afficher le nom de la personne qui parle, avec possibilité d’indiquer qui s’adresse spécifiquement à l’utilisateur malentendant | **Entrée** : Reconnaissance vocale et association de l’orateur à un profil ou à un identifiant. <br> **Sortie** : Affichage du nom de l’orateur à côté du texte transcrit. |
| **fp3** | Fournir une alerte visuelle lorsque quelqu’un s’adresse spécifiquement à l’utilisateur malentendant | **Entrée** : Appui sur un bouton par un autre participant pour signaler qu’il s’adresse à la personne malentendante. <br> **Sortie** : Notification visuelle (popup) |
| **fp4** | Détecter certains bruits de l’environnement (alarme, appel de nom, etc.) et fournir une notification visuelle à l’utilisateur malentendant | **Entrée** : Microphones captant les bruits ambiants. <br> **Sortie** : Notifications visuelles correspondant à des bruits spécifiques (ex. clignotement de lumière ou icône indiquant l’alarme). |

---

## 8. Rôles et missions de chacun

Les rôles et missions spécifiques de chaque membre doivent être définis à travers un organigramme.

---

## Description synthétique du domaine d'application

### Public cible
Personnes malentendantes, en particulier dans des environnements collaboratifs tels que des bureaux ou des salles de réunion.

### Objectifs principaux
- Accessibilité des informations verbales via des transcriptions en temps réel.
- Alertes visuelles pour signaler des bruits spécifiques (alarme, voix humaine).

### Contexte d'utilisation
- Milieux restreints (espaces de travail collaboratifs, environnements calmes).
- Scénarios nécessitant une réactivité accrue face aux sons critiques.

### Contraintes techniques
- Traitement en temps réel de l’audio.
- Reconnaissance et catégorisation des sons spécifiques.
- Interface visuelle intuitive.

### Impact attendu
- Inclusion accrue des personnes malentendantes.
- Réduction des risques liés à l’absence de perception auditive.

---
